package com.Library.OnlineLibrary.api.dto.mappers;

import com.Library.OnlineLibrary.api.dto.GetLoan;
import com.Library.OnlineLibrary.api.dto.GetReservation;
import com.Library.OnlineLibrary.api.dto.GetUser;
import com.Library.OnlineLibrary.domain.entities.Loan;
import com.Library.OnlineLibrary.domain.entities.Reservation;
import com.Library.OnlineLibrary.domain.entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T12:04:57-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public GetUser toGetDTO(User user) {
        if ( user == null ) {
            return null;
        }

        GetUser.GetUserBuilder getUser = GetUser.builder();

        getUser.id( user.getId() );
        getUser.userName( user.getUserName() );
        getUser.password( user.getPassword() );
        getUser.email( user.getEmail() );
        getUser.fullName( user.getFullName() );
        getUser.role( user.getRole() );
        getUser.reservations( reservationListToGetReservationList( user.getReservations() ) );
        getUser.loans( loanListToGetLoanList( user.getLoans() ) );

        return getUser.build();
    }

    @Override
    public User toEntity(GetUser getUser) {
        if ( getUser == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( getUser.getId() );
        user.userName( getUser.getUserName() );
        user.password( getUser.getPassword() );
        user.email( getUser.getEmail() );
        user.fullName( getUser.getFullName() );
        user.role( getUser.getRole() );
        user.reservations( getReservationListToReservationList( getUser.getReservations() ) );
        user.loans( getLoanListToLoanList( getUser.getLoans() ) );

        return user.build();
    }

    protected GetReservation reservationToGetReservation(Reservation reservation) {
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

    protected GetLoan loanToGetLoan(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        GetLoan.GetLoanBuilder getLoan = GetLoan.builder();

        getLoan.id( loan.getId() );
        getLoan.loanDate( loan.getLoanDate() );
        getLoan.returnDate( loan.getReturnDate() );
        getLoan.status( loan.getStatus() );
        getLoan.user( loan.getUser() );
        getLoan.book( loan.getBook() );

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

    protected Reservation getReservationToReservation(GetReservation getReservation) {
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

    protected Loan getLoanToLoan(GetLoan getLoan) {
        if ( getLoan == null ) {
            return null;
        }

        Loan.LoanBuilder loan = Loan.builder();

        loan.id( getLoan.getId() );
        loan.loanDate( getLoan.getLoanDate() );
        loan.returnDate( getLoan.getReturnDate() );
        loan.status( getLoan.getStatus() );
        loan.user( getLoan.getUser() );
        loan.book( getLoan.getBook() );

        return loan.build();
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
}
