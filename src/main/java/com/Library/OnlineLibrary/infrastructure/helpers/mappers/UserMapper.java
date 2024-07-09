package com.Library.OnlineLibrary.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.Library.OnlineLibrary.api.dto.request.UserRequest;
import com.Library.OnlineLibrary.api.dto.response.UserResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.specific.UserLoansResponse;
import com.Library.OnlineLibrary.domain.entities.User;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

        @Mappings({
                        @Mapping(target = "id", ignore = true),
                        @Mapping(target = "loans", ignore = true),
                        @Mapping(target = "reservations", ignore = true)
        })
        User toEntity(UserRequest user);

        UserResponse toEntityResponse(User user);

        UserBasicResponse toEntityBasicResponse(User user);

        @Mappings({
                        @Mapping(target = "id", ignore = true),
                        @Mapping(target = "loans", ignore = true),
                        @Mapping(target = "reservations", ignore = true)
        })
        void toExistingEntity(UserRequest request, @MappingTarget User user);

        UserLoansResponse toUserLoansResponse(User user);
}
