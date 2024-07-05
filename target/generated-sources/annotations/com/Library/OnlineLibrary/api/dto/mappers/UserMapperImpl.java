package com.Library.OnlineLibrary.api.dto.mappers;

import com.Library.OnlineLibrary.api.dto.GetLoan;
import com.Library.OnlineLibrary.api.dto.GetReservation;
import com.Library.OnlineLibrary.api.dto.GetUser;
import com.Library.OnlineLibrary.domain.entities.Loan;
import com.Library.OnlineLibrary.domain.entities.Reservation;
import com.Library.OnlineLibrary.domain.entities.User;
import com.Library.OnlineLibrary.util.enums.Role;
import com.Library.OnlineLibrary.util.enums.Status;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-05T07:46:23-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public GetUser toGetDTO(User user) {
        if ( user == null ) {
            return null;
        }

        GetUser.GetUserBuilder getUser = GetUser.builder();

        getUser.email( user.getEmail() );
        getUser.fullName( user.getFullName() );
        getUser.id( user.getId() );
        getUser.loans( loanListToGetLoanList( user.getLoans() ) );
        getUser.password( user.getPassword() );
        getUser.reservations( reservationListToGetReservationList( user.getReservations() ) );
        if ( user.getRole() != null ) {
            getUser.role( user.getRole().name() );
        }
        getUser.userName( user.getUserName() );

        return getUser.build();
    }

    @Override
    public User toEntity(GetUser getUser) {
        if ( getUser == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.email( getUser.getEmail() );
        user.fullName( getUser.getFullName() );
        user.id( getUser.getId() );
        user.loans( getLoanListToLoanList( getUser.getLoans() ) );
        user.password( getUser.getPassword() );
        user.reservations( getReservationListToReservationList( getUser.getReservations() ) );
        if ( getUser.getRole() != null ) {
            user.role( Enum.valueOf( Role.class, getUser.getRole() ) );
        }
        user.userName( getUser.getUserName() );

        return user.build();
    }

    protected GetLoan loanToGetLoan(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        GetLoan.GetLoanBuilder getLoan = GetLoan.builder();

        getLoan.book( loan.getBook() );
        getLoan.id( loan.getId() );
        getLoan.loanDate( loan.getLoanDate() );
        getLoan.returnDate( loan.getReturnDate() );
        if ( loan.getStatus() != null ) {
            getLoan.status( loan.getStatus().name() );
        }
        getLoan.user( loan.getUser() );

        return getLoan.build();
    }

    protected List<GetLoan> loanListToGetLoanList(List<Loan> list) {
        if ( list == null ) {
            return null;
        }

        List<GetLoan> list1 = new ArrayList<GetLoan>( list.size() );
        for ( Loan loan : list ) {
            list1.add( loanToGetLoan( loan ) );
        }

        return list1;
    }

    protected GetReservation reservationToGetReservation(Reservation reservation) {
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

    protected List<GetReservation> reservationListToGetReservationList(List<Reservation> list) {
        if ( list == null ) {
            return null;
        }

        List<GetReservation> list1 = new ArrayList<GetReservation>( list.size() );
        for ( Reservation reservation : list ) {
            list1.add( reservationToGetReservation( reservation ) );
        }

        return list1;
    }

    protected Loan getLoanToLoan(GetLoan getLoan) {
        if ( getLoan == null ) {
            return null;
        }

        Loan loan = new Loan();

        loan.setBook( getLoan.getBook() );
        loan.setId( getLoan.getId() );
        loan.setLoanDate( getLoan.getLoanDate() );
        loan.setReturnDate( getLoan.getReturnDate() );
        if ( getLoan.getStatus() != null ) {
            loan.setStatus( Enum.valueOf( Status.class, getLoan.getStatus() ) );
        }
        loan.setUser( getLoan.getUser() );

        return loan;
    }

    protected List<Loan> getLoanListToLoanList(List<GetLoan> list) {
        if ( list == null ) {
            return null;
        }

        List<Loan> list1 = new ArrayList<Loan>( list.size() );
        for ( GetLoan getLoan : list ) {
            list1.add( getLoanToLoan( getLoan ) );
        }

        return list1;
    }

    protected Reservation getReservationToReservation(GetReservation getReservation) {
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

    protected List<Reservation> getReservationListToReservationList(List<GetReservation> list) {
        if ( list == null ) {
            return null;
        }

        List<Reservation> list1 = new ArrayList<Reservation>( list.size() );
        for ( GetReservation getReservation : list ) {
            list1.add( getReservationToReservation( getReservation ) );
        }

        return list1;
    }
}
