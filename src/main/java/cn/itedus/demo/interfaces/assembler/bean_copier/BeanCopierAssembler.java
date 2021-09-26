package cn.itedus.demo.interfaces.assembler.bean_copier;


import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Component;

@Component
public class BeanCopierAssembler implements IAssembler<UserVO, UserDTO> {

    @Override
    public UserDTO sourceToTarget(UserVO var) {
        UserDTO userDTO = new UserDTO();
        BeanCopier beanCopier = BeanCopier.create(var.getClass(), userDTO.getClass(), false);
        beanCopier.copy(var, userDTO, null);
        return userDTO;
    }

}
