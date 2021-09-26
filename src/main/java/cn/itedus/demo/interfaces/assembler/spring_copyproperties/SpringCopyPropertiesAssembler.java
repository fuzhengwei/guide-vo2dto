package cn.itedus.demo.interfaces.assembler.spring_copyproperties;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class SpringCopyPropertiesAssembler implements IAssembler<UserVO, UserDTO> {

    @Override
    public UserDTO sourceToTarget(UserVO var) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(var, userDTO);
        return userDTO;
    }

}
