package com.Library.OnlineLibrary.api.dto.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.Library.OnlineLibrary.api.dto.GetUser;
import com.Library.OnlineLibrary.domain.entities.User;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    GetUser toGetDTO(User user);

    @InheritInverseConfiguration
    User toEntity(GetUser getUser);

}
