package cn.itedus.demo.interfaces.assembler.model_mapper;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperAssembler implements IAssembler<UserVO, UserDTO> {

    private static ModelMapper modelMapper = new ModelMapper();

    static {
        modelMapper.addMappings(new PropertyMap<UserVO, UserDTO>() {
            @Override
            protected void configure() {
                // 属性值不一样可以自己操作
                map().setUserId(source.getUserId());
            }
        });
    }

    @Override
    public UserDTO sourceToTarget(UserVO var) {
        return modelMapper.map(var, UserDTO.class);
    }

}
