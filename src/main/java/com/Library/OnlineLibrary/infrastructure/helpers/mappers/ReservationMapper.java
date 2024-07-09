package com.Library.OnlineLibrary.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.Library.OnlineLibrary.api.dto.request.ReservationRequest;
import com.Library.OnlineLibrary.api.dto.response.ReservationResponse;
import com.Library.OnlineLibrary.domain.entities.Reservation;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReservationMapper {

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "book.id", source = "bookId"),
            @Mapping(target = "user.id", source = "userId")
    })
    Reservation toEntity(ReservationRequest reservation);

    ReservationResponse toEntityResponse(Reservation reservation);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "book", ignore = true),
            @Mapping(target = "user", ignore = true)
    })
    void toExistingEntity(ReservationRequest request, @MappingTarget Reservation reservation);
    
}
