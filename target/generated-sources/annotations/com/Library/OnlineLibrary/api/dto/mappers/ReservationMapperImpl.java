package com.Library.OnlineLibrary.api.dto.mappers;

import com.Library.OnlineLibrary.api.dto.GetReservation;
import com.Library.OnlineLibrary.domain.entities.Reservation;
import com.Library.OnlineLibrary.util.enums.Status;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-05T07:23:46-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public GetReservation toGetDTO(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        GetReservation.GetReservationBuilder getReservation = GetReservation.builder();

        getReservation.book( reservation.getBook() );
        getReservation.id( reservation.getId() );
        getReservation.reservationDate( reservation.getReservationDate() );
        if ( reservation.getStatus() != null ) {
            getReservation.status( reservation.getStatus().name() );
        }
        getReservation.user( reservation.getUser() );

        return getReservation.build();
    }

    @Override
    public Reservation toEntity(GetReservation getReservation) {
        if ( getReservation == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setBook( getReservation.getBook() );
        reservation.setId( getReservation.getId() );
        reservation.setReservationDate( getReservation.getReservationDate() );
        if ( getReservation.getStatus() != null ) {
            reservation.setStatus( Enum.valueOf( Status.class, getReservation.getStatus() ) );
        }
        reservation.setUser( getReservation.getUser() );

        return reservation;
    }

    @Override
    public List<GetReservation> toGetReservationList(List<Reservation> reservations) {
        if ( reservations == null ) {
            return null;
        }

        List<GetReservation> list = new ArrayList<GetReservation>( reservations.size() );
        for ( Reservation reservation : reservations ) {
            list.add( toGetDTO( reservation ) );
        }

        return list;
    }

    @Override
    public List<Reservation> toEntityList(List<GetReservation> reservations) {
        if ( reservations == null ) {
            return null;
        }

        List<Reservation> list = new ArrayList<Reservation>( reservations.size() );
        for ( GetReservation getReservation : reservations ) {
            list.add( toEntity( getReservation ) );
        }

        return list;
    }
}
