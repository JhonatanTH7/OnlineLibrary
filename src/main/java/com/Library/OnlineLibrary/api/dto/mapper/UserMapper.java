package com.Library.OnlineLibrary.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.Library.OnlineLibrary.api.dto.GetUser;
import com.Library.OnlineLibrary.domain.entities.User;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mapping(source =  = "", target = "")
    GetUser userToGetDTO(User user);
}
