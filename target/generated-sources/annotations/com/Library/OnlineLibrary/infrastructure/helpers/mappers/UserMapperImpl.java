package com.Library.OnlineLibrary.infrastructure.helpers.mappers;

import com.Library.OnlineLibrary.api.dto.request.UserRequest;
import com.Library.OnlineLibrary.api.dto.response.UserResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.LoanBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.ReservationBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.specific.LoanInUserLoansResponse;
import com.Library.OnlineLibrary.api.dto.response.specific.UserLoansResponse;
import com.Library.OnlineLibrary.domain.entities.Book;
import com.Library.OnlineLibrary.domain.entities.Loan;
import com.Library.OnlineLibrary.domain.entities.Reservation;
import com.Library.OnlineLibrary.domain.entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-09T12:11:10-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserRequest user) {
        if ( user == null ) {
            return null;
        }

        User.UserBuilder user1 = User.builder();

        user1.email( user.getEmail() );
        user1.fullName( user.getFullName() );
        user1.password( user.getPassword() );
        user1.role( user.getRole() );
        user1.userName( user.getUserName() );

        return user1.build();
    }

    @Override
    public UserResponse toEntityResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setEmail( user.getEmail() );
        userResponse.setFullName( user.getFullName() );
        userResponse.setId( user.getId() );
        userResponse.setPassword( user.getPassword() );
        userResponse.setRole( user.getRole() );
        userResponse.setUserName( user.getUserName() );
        userResponse.setLoans( loanListToLoanBasicResponseList( user.getLoans() ) );
        userResponse.setReservations( reservationListToReservationBasicResponseList( user.getReservations() ) );

        return userResponse;
    }

    @Override
    public UserBasicResponse toEntityBasicResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserBasicResponse userBasicResponse = new UserBasicResponse();

        userBasicResponse.setEmail( user.getEmail() );
        userBasicResponse.setFullName( user.getFullName() );
        userBasicResponse.setId( user.getId() );
        userBasicResponse.setPassword( user.getPassword() );
        userBasicResponse.setRole( user.getRole() );
        userBasicResponse.setUserName( user.getUserName() );

        return userBasicResponse;
    }

    @Override
    public void toExistingEntity(UserRequest request, User user) {
        if ( request == null ) {
            return;
        }

        user.setEmail( request.getEmail() );
        user.setFullName( request.getFullName() );
        user.setPassword( request.getPassword() );
        user.setRole( request.getRole() );
        user.setUserName( request.getUserName() );
    }

    @Override
    public UserLoansResponse toUserLoansResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserLoansResponse userLoansResponse = new UserLoansResponse();

        userLoansResponse.setEmail( user.getEmail() );
        userLoansResponse.setFullName( user.getFullName() );
        userLoansResponse.setId( user.getId() );
        userLoansResponse.setPassword( user.getPassword() );
        userLoansResponse.setRole( user.getRole() );
        userLoansResponse.setUserName( user.getUserName() );
        userLoansResponse.setLoans( loanListToLoanInUserLoansResponseList( user.getLoans() ) );

        return userLoansResponse;
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

    protected BookBasicResponse bookToBookBasicResponse(Book book) {
        if ( book == null ) {
            return null;
        }

        BookBasicResponse bookBasicResponse = new BookBasicResponse();

        bookBasicResponse.setAuthor( book.getAuthor() );
        bookBasicResponse.setGenre( book.getGenre() );
        bookBasicResponse.setId( book.getId() );
        bookBasicResponse.setIsbn( book.getIsbn() );
        bookBasicResponse.setPublicationYear( book.getPublicationYear() );
        bookBasicResponse.setTitle( book.getTitle() );

        return bookBasicResponse;
    }

    protected LoanInUserLoansResponse loanToLoanInUserLoansResponse(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        LoanInUserLoansResponse loanInUserLoansResponse = new LoanInUserLoansResponse();

        loanInUserLoansResponse.setId( loan.getId() );
        loanInUserLoansResponse.setLoanDate( loan.getLoanDate() );
        loanInUserLoansResponse.setReturnDate( loan.getReturnDate() );
        loanInUserLoansResponse.setStatus( loan.getStatus() );
        loanInUserLoansResponse.setBook( bookToBookBasicResponse( loan.getBook() ) );

        return loanInUserLoansResponse;
    }

    protected List<LoanInUserLoansResponse> loanListToLoanInUserLoansResponseList(List<Loan> list) {
        if ( list == null ) {
            return null;
        }

        List<LoanInUserLoansResponse> list1 = new ArrayList<LoanInUserLoansResponse>( list.size() );
        for ( Loan loan : list ) {
            list1.add( loanToLoanInUserLoansResponse( loan ) );
        }

        return list1;
    }
}
