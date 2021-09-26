package cn.itedus.demo.test;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import com.alibaba.fastjson.JSON;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * MapStruct	                    0	0	1	3	15
 * BeanCopier	                    5	6	18	89	124
 * bean-mapping-asm	                23	24	29	72	237
 * bean-mapping	                    13	20	44	153	670
 * Spring BeanUtils.copyProperties	4	6	17	68	226
 * Apache BeanUtils.copyProperties	41	77	383	2067	16576
 * get_set	                        0	0	1	4	8
 * 一百次	一千次	一万次	十万次	一百万次
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Resource
    private IAssembler<UserVO, UserDTO> apacheCopyPropertiesAssembler;
    @Resource
    private IAssembler<UserVO, UserDTO> beanCopierAssembler;
    @Resource
    private IAssembler<UserVO, UserDTO> beanMappingAssembler;
    @Resource
    private IAssembler<UserVO, UserDTO> beanMappingASMAssembler;
    @Resource
    private IAssembler<UserVO, UserDTO> getSetAssembler;
    @Resource
    private IAssembler<UserVO, UserDTO> mapStructAssembler;
    @Resource
    private IAssembler<UserVO, UserDTO> springCopyPropertiesAssembler;
    @Resource
    private IAssembler<UserVO, UserDTO> orikaAssembler;
    @Resource
    private IAssembler<UserVO, UserDTO> dozerAssembler;
    @Resource
    private IAssembler<UserVO, UserDTO> modelMapperAssembler;
    private IAssembler<UserVO, UserDTO> jMapperAssembler;
    @Resource
    private IAssembler<UserVO, UserDTO> json2JsonAssembler;

    private UserVO userVO = new UserVO();

    @Before
    public void initData() {
        userVO.setId(1001L);
        userVO.setUserId("fustack");
        userVO.setUserNickName("小傅哥");
        userVO.setCreateTime(new Date());
    }

    @Test
    public void test_apacheCopyPropertiesAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            UserDTO userDTO = apacheCopyPropertiesAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
        // 方法耗时：2050ms
    }

    @Test
    public void test_beanCopierAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            UserDTO userDTO = beanCopierAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
        // 方法耗时：53ms
    }

    @Test
    public void test_beanMappingAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            UserDTO userDTO = beanMappingAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
        // 方法耗时：162ms
    }

    @Test
    public void test_beanMappingASMAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            UserDTO userDTO = beanMappingASMAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
        // 方法耗时：90ms
    }

    // 方法耗时：3ms
    @Test
    public void test_getSetAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            UserDTO userDTO = getSetAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

    @Test
    public void test_mapStructAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            UserDTO userDTO = mapStructAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
        // 方法耗时：4ms
    }

    @Test
    public void test_springCopyPropertiesAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            UserDTO userDTO = springCopyPropertiesAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
        // 方法耗时：64ms
    }

    @Test
    public void test_orikaAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            UserDTO userDTO = orikaAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

    @Test
    public void test_dozerAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            UserDTO userDTO = dozerAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

    @Test
    public void test_modelMapperAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            UserDTO userDTO = modelMapperAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

    @Test
    public void test_jMapperAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            UserDTO userDTO = jMapperAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

    @Test
    public void test_json2JsonAssembler() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            UserDTO userDTO = json2JsonAssembler.sourceToTarget(userVO);
        }
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

}
