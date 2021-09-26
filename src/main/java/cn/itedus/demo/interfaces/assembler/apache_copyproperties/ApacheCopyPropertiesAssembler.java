package cn.itedus.demo.interfaces.assembler.apache_copyproperties;


import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

@Component
public class ApacheCopyPropertiesAssembler implements IAssembler<UserVO, UserDTO> {

    @Override
    public UserDTO sourceToTarget(UserVO var) {
        UserDTO userDTO = new UserDTO();
        try {
            BeanUtils.copyProperties(userDTO, var);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return userDTO;
    }

}
