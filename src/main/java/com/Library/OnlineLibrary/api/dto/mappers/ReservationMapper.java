package com.Library.OnlineLibrary.api.dto.mappers;


import com.Library.OnlineLibrary.api.dto.GetReservation;
import com.Library.OnlineLibrary.domain.entities.Reservation;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReservationMapper {

    GetReservation toGetDTO(Reservation reservation);

    @InheritInverseConfiguration
    Reservation toEntity(GetReservation getReservation);

    List<GetReservation> toGetReservationList(List<Reservation> reservations);

    List<Reservation> toEntityList(List<GetReservation> reservations);

}
