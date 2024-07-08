package com.Library.OnlineLibrary.infrastructure.helpers.mappers;

import com.Library.OnlineLibrary.api.dto.request.BookRequest;
import com.Library.OnlineLibrary.api.dto.response.BookResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.LoanBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.ReservationBasicResponse;
import com.Library.OnlineLibrary.domain.entities.Book;
import com.Library.OnlineLibrary.domain.entities.Loan;
import com.Library.OnlineLibrary.domain.entities.Reservation;
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
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toEntity(BookRequest book) {
        if ( book == null ) {
            return null;
        }

        Book book1 = new Book();

        book1.setTitle( book.getTitle() );
        book1.setAuthor( book.getAuthor() );
        book1.setPublicationYear( book.getPublicationYear() );
        book1.setGenre( book.getGenre() );
        book1.setIsbn( book.getIsbn() );

        return book1;
    }

    @Override
    public BookResponse toResponseEntity(Book book) {
        if ( book == null ) {
            return null;
        }

        BookResponse bookResponse = new BookResponse();

        bookResponse.setId( book.getId() );
        bookResponse.setTitle( book.getTitle() );
        bookResponse.setAuthor( book.getAuthor() );
        bookResponse.setPublicationYear( book.getPublicationYear() );
        bookResponse.setGenre( book.getGenre() );
        bookResponse.setIsbn( book.getIsbn() );
        bookResponse.setReservations( reservationListToReservationBasicResponseList( book.getReservations() ) );
        bookResponse.setLoans( loanListToLoanBasicResponseList( book.getLoans() ) );

        return bookResponse;
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
