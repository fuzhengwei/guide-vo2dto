package cn.itedus.demo.interfaces.assembler.jmapper;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class JMapperAssembler implements IAssembler<UserVO, UserDTO> {

    @Override
    public UserDTO sourceToTarget(UserVO var) {
       /* JMapper<UserDTO, UserVO> jMapper = new JMapper<>(UserDTO.class, UserVO.class, new JMapperAPI()
                .add(JMapperAPI.mappedClass(UserDTO.class)
                        .add(JMapperAPI.attribute("userId")
                                .value("userId"))
                        .add(JMapperAPI.attribute("userNickName")
                                .value("userNickName"))
                        .add(JMapperAPI.attribute("createTime")
                                .value("createTime"))
                ));

        return jMapper.getDestination(var);*/
       return null;
    }

}
