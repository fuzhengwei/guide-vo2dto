package cn.itedus.demo.test;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.dto.UserDTO;
import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * @description:
 * @author: fuzhengwei1
 * @date: 2021/09/15
 */
public class Psvm {

    public static void main(String[] args) {

        UserVO userVO = new UserVO();

        userVO.setId(1001L);
        userVO.setUserId("fustack");
        userVO.setUserNickName("小傅哥");
        userVO.setCreateTime(new Date());

//        JMapper<UserDTO, UserVO> jMapper = new JMapper<>(UserDTO.class, UserVO.class, new JMapperAPI()
//                .add(JMapperAPI.mappedClass(UserDTO.class)
//                        .add(JMapperAPI.attribute("userId")
//                                .value("userId"))
//                        .add(JMapperAPI.attribute("userNickName")
//                                .value("userNickName"))
//                        .add(JMapperAPI.attribute("createTime")
//                                .value("createTime"))
//                ));
//
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            jMapper.getDestination(userVO);
//        }
//        System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");

//        System.out.println(JSON.toJSONString(jMapper.getDestination(userVO)));
    }

}
