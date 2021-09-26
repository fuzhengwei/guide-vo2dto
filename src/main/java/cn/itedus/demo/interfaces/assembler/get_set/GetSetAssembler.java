package cn.itedus.demo.interfaces.assembler.get_set;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class GetSetAssembler implements IAssembler<UserVO, UserDTO> {

    @Override
    public UserDTO sourceToTarget(UserVO var) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(var.getUserId());
        userDTO.setUserNickName(var.getUserNickName());
        userDTO.setCreateTime(var.getCreateTime());
        return userDTO;
    }

}
