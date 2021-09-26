package cn.itedus.demo.interfaces.assembler.orika;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;

@Component
public class OrikaAssembler implements IAssembler<UserVO, UserDTO> {

    /**
     * 构造一个MapperFactory
     */
    private static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    static {
        mapperFactory.classMap(UserDTO.class, UserVO.class)
                .field("userId", "userId")  // 字段不一致时可以指定
                .byDefault()
                .register();
    }

    @Override
    public UserDTO sourceToTarget(UserVO var) {
        return mapperFactory.getMapperFacade().map(var, UserDTO.class);
    }

}
