package com.Library.OnlineLibrary.infrastructure.helpers.mappers;

import com.Library.OnlineLibrary.api.dto.request.UserRequest;
import com.Library.OnlineLibrary.api.dto.response.UserResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.LoanBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.ReservationBasicResponse;
import com.Library.OnlineLibrary.domain.entities.Loan;
import com.Library.OnlineLibrary.domain.entities.Reservation;
import com.Library.OnlineLibrary.domain.entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-08T11:59:55-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserRequest user) {
        if ( user == null ) {
            return null;
        }

        User.UserBuilder user1 = User.builder();

        user1.userName( user.getUserName() );
        user1.password( user.getPassword() );
        user1.email( user.getEmail() );
        user1.fullName( user.getFullName() );
        user1.role( user.getRole() );

        return user1.build();
    }

    @Override
    public UserResponse toEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setId( user.getId() );
        userResponse.setUserName( user.getUserName() );
        userResponse.setPassword( user.getPassword() );
        userResponse.setEmail( user.getEmail() );
        userResponse.setFullName( user.getFullName() );
        userResponse.setRole( user.getRole() );
        userResponse.setReservations( reservationListToReservationBasicResponseList( user.getReservations() ) );
        userResponse.setLoans( loanListToLoanBasicResponseList( user.getLoans() ) );

        return userResponse;
    }

    protected ReservationBasicResponse reservationToReservationBasicResponse(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationBasicResponse reservationBasicResponse = new ReservationBasicResponse();

        reservationBasicResponse.setId( reservation.getId() );
        reservationBasicResponse.setReservationDate( reservation.getReservationDate() );
        reservationBasicResponse.setStatus( reservation.getStatus() );

        return reservationBasicResponse;
    }

    protected List<ReservationBasicResponse> reservationListToReservationBasicResponseList(List<Reservation> list) {
        if ( list == null ) {
            return null;
        }

        List<ReservationBasicResponse> list1 = new ArrayList<ReservationBasicResponse>( list.size() );
        for ( Reservation reservation : list ) {
            list1.add( reservationToReservationBasicResponse( reservation ) );
        }

        return list1;
    }

    protected LoanBasicResponse loanToLoanBasicResponse(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        LoanBasicResponse loanBasicResponse = new LoanBasicResponse();

        loanBasicResponse.setId( loan.getId() );
        loanBasicResponse.setLoanDate( loan.getLoanDate() );
        loanBasicResponse.setReturnDate( loan.getReturnDate() );
        loanBasicResponse.setStatus( loan.getStatus() );

        return loanBasicResponse;
    }

    protected List<LoanBasicResponse> loanListToLoanBasicResponseList(List<Loan> list) {
        if ( list == null ) {
            return null;
        }

        List<LoanBasicResponse> list1 = new ArrayList<LoanBasicResponse>( list.size() );
        for ( Loan loan : list ) {
            list1.add( loanToLoanBasicResponse( loan ) );
        }

        return list1;
    }
}
