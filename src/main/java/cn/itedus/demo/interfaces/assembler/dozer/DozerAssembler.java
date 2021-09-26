package cn.itedus.demo.interfaces.assembler.dozer;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class DozerAssembler implements IAssembler<UserVO, UserDTO> {

    private static DozerBeanMapper mapper = new DozerBeanMapper();

    @Override
    public UserDTO sourceToTarget(UserVO var) {
        return mapper.map(var, UserDTO.class);
    }

}
