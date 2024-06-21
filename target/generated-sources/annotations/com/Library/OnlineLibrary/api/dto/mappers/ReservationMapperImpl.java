package com.Library.OnlineLibrary.api.dto.mappers;

import com.Library.OnlineLibrary.api.dto.GetReservation;
import com.Library.OnlineLibrary.domain.entities.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T12:54:51-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public GetReservation toGetDTO(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        GetReservation.GetReservationBuilder getReservation = GetReservation.builder();

        getReservation.id( reservation.getId() );
        getReservation.reservationDate( reservation.getReservationDate() );
        getReservation.status( reservation.getStatus() );
        getReservation.user( reservation.getUser() );
        getReservation.book( reservation.getBook() );

        return getReservation.build();
    }

    @Override
    public Reservation toEntity(GetReservation getReservation) {
        if ( getReservation == null ) {
            return null;
        }

        Reservation.ReservationBuilder reservation = Reservation.builder();

        reservation.id( getReservation.getId() );
        reservation.reservationDate( getReservation.getReservationDate() );
        reservation.status( getReservation.getStatus() );
        reservation.user( getReservation.getUser() );
        reservation.book( getReservation.getBook() );

        return reservation.build();
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
