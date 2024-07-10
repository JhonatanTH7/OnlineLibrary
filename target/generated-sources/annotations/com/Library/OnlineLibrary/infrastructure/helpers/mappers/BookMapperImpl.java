package com.Library.OnlineLibrary.infrastructure.helpers.mappers;

import com.Library.OnlineLibrary.api.dto.request.BookRequest;
import com.Library.OnlineLibrary.api.dto.response.BookResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.LoanBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.ReservationBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.specific.book_reservations.BookReservationsResponse;
import com.Library.OnlineLibrary.api.dto.response.specific.book_reservations.ReservationInBookReservationsResponse;
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
    date = "2024-07-09T19:34:34-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toEntity(BookRequest book) {
        if ( book == null ) {
            return null;
        }

        Book book1 = new Book();

        book1.setAuthor( book.getAuthor() );
        book1.setGenre( book.getGenre() );
        book1.setIsbn( book.getIsbn() );
        book1.setPublicationYear( book.getPublicationYear() );
        book1.setTitle( book.getTitle() );

        return book1;
    }

    @Override
    public BookResponse toEntityResponse(Book book) {
        if ( book == null ) {
            return null;
        }

        BookResponse bookResponse = new BookResponse();

        bookResponse.setAuthor( book.getAuthor() );
        bookResponse.setGenre( book.getGenre() );
        bookResponse.setId( book.getId() );
        bookResponse.setIsbn( book.getIsbn() );
        bookResponse.setPublicationYear( book.getPublicationYear() );
        bookResponse.setTitle( book.getTitle() );
        bookResponse.setLoans( loanListToLoanBasicResponseList( book.getLoans() ) );
        bookResponse.setReservations( reservationListToReservationBasicResponseList( book.getReservations() ) );

        return bookResponse;
    }

    @Override
    public BookBasicResponse toEntityBasicResponse(Book book) {
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

    @Override
    public void toExistingEntity(BookRequest request, Book book) {
        if ( request == null ) {
            return;
        }

        book.setAuthor( request.getAuthor() );
        book.setGenre( request.getGenre() );
        book.setIsbn( request.getIsbn() );
        book.setPublicationYear( request.getPublicationYear() );
        book.setTitle( request.getTitle() );
    }

    @Override
    public BookReservationsResponse toBookReservationsResponse(Book book) {
        if ( book == null ) {
            return null;
        }

        BookReservationsResponse bookReservationsResponse = new BookReservationsResponse();

        bookReservationsResponse.setAuthor( book.getAuthor() );
        bookReservationsResponse.setGenre( book.getGenre() );
        bookReservationsResponse.setId( book.getId() );
        bookReservationsResponse.setIsbn( book.getIsbn() );
        bookReservationsResponse.setPublicationYear( book.getPublicationYear() );
        bookReservationsResponse.setTitle( book.getTitle() );
        bookReservationsResponse.setReservations( reservationListToReservationInBookReservationsResponseList( book.getReservations() ) );

        return bookReservationsResponse;
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

    protected UserBasicResponse userToUserBasicResponse(User user) {
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

    protected ReservationInBookReservationsResponse reservationToReservationInBookReservationsResponse(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationInBookReservationsResponse reservationInBookReservationsResponse = new ReservationInBookReservationsResponse();

        reservationInBookReservationsResponse.setId( reservation.getId() );
        reservationInBookReservationsResponse.setReservationDate( reservation.getReservationDate() );
        reservationInBookReservationsResponse.setStatus( reservation.getStatus() );
        reservationInBookReservationsResponse.setUser( userToUserBasicResponse( reservation.getUser() ) );

        return reservationInBookReservationsResponse;
    }

    protected List<ReservationInBookReservationsResponse> reservationListToReservationInBookReservationsResponseList(List<Reservation> list) {
        if ( list == null ) {
            return null;
        }

        List<ReservationInBookReservationsResponse> list1 = new ArrayList<ReservationInBookReservationsResponse>( list.size() );
        for ( Reservation reservation : list ) {
            list1.add( reservationToReservationInBookReservationsResponse( reservation ) );
        }

        return list1;
    }
}
