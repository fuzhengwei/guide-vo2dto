package cn.itedus.demo.interfaces.assembler.map_struct;

import cn.itedus.demo.domain.vo.UserVO;
import cn.itedus.demo.interfaces.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserDTOMapping extends IMapping<UserVO, UserDTO> {

    /** 用于测试的单例 */
    IMapping<UserVO, UserDTO> INSTANCE = Mappers.getMapper(UserDTOMapping.class);

    @Mapping(target = "userId", source = "userId")
    @Mapping(target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Override
    UserDTO sourceToTarget(UserVO var1);

    @Mapping(target = "userId", source = "userId")
    @Mapping(target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Override
    UserVO targetToSource(UserDTO var1);

}
