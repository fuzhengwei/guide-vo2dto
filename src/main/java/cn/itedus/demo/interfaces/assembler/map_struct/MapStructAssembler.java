package cn.itedus.demo.interfaces.assembler.map_struct;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MapStructAssembler implements IAssembler<UserVO, UserDTO> {

    @Resource
    private IMapping<UserVO, UserDTO> userDTOMapping;

    @Override
    public UserDTO sourceToTarget(UserVO var) {
        return userDTOMapping.sourceToTarget(var);
    }

}
