package cn.itedus.demo.interfaces.assembler.bean_mapping_asm;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import com.github.houbb.bean.mapping.asm.util.AsmBeanUtil;
import org.springframework.stereotype.Component;

@Component
public class BeanMappingASMAssembler implements IAssembler<UserVO, UserDTO> {

    @Override
    public UserDTO sourceToTarget(UserVO var) {
        UserDTO userDTO = new UserDTO();
        AsmBeanUtil.copyProperties(var, userDTO);
        return userDTO;
    }

}
