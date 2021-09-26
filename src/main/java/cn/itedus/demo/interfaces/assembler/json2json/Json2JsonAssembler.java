package cn.itedus.demo.interfaces.assembler.json2json;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.assembler.IAssembler;
import cn.itedus.demo.interfaces.dto.UserDTO;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

@Component
public class Json2JsonAssembler implements IAssembler<UserVO, UserDTO> {

    @Override
    public UserDTO sourceToTarget(UserVO var) {
        String strJson = JSON.toJSONString(var);
        return JSON.parseObject(strJson, UserDTO.class);
    }

}
