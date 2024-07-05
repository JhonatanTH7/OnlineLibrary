package com.Library.OnlineLibrary.api.dto.mappers;

import com.Library.OnlineLibrary.api.dto.GetBook;
import com.Library.OnlineLibrary.api.dto.GetLoan;
import com.Library.OnlineLibrary.api.dto.GetReservation;
import com.Library.OnlineLibrary.domain.entities.Book;
import com.Library.OnlineLibrary.domain.entities.Loan;
import com.Library.OnlineLibrary.domain.entities.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-05T07:07:19-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public GetBook toGetDTO(Book book) {
        if ( book == null ) {
            return null;
        }

        GetBook.GetBookBuilder getBook = GetBook.builder();

        getBook.author( book.getAuthor() );
        getBook.genre( book.getGenre() );
        getBook.id( book.getId() );
        getBook.isbn( book.getIsbn() );
        getBook.loans( loanListToGetLoanList( book.getLoans() ) );
        getBook.publicationYear( book.getPublicationYear() );
        getBook.reservations( reservationListToGetReservationList( book.getReservations() ) );
        getBook.title( book.getTitle() );

        return getBook.build();
    }

    @Override
    public Book toEntity(GetBook getBook) {
        if ( getBook == null ) {
            return null;
        }

        Book book = new Book();

        book.setAuthor( getBook.getAuthor() );
        book.setGenre( getBook.getGenre() );
        book.setId( getBook.getId() );
        book.setIsbn( getBook.getIsbn() );
        book.setLoans( getLoanListToLoanList( getBook.getLoans() ) );
        book.setPublicationYear( getBook.getPublicationYear() );
        book.setReservations( getReservationListToReservationList( getBook.getReservations() ) );
        book.setTitle( getBook.getTitle() );

        return book;
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
        getLoan.status( loan.getStatus() );
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
        getReservation.status( reservation.getStatus() );
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

        Loan.LoanBuilder loan = Loan.builder();

        loan.book( getLoan.getBook() );
        loan.id( getLoan.getId() );
        loan.loanDate( getLoan.getLoanDate() );
        loan.returnDate( getLoan.getReturnDate() );
        loan.status( getLoan.getStatus() );
        loan.user( getLoan.getUser() );

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

    protected Reservation getReservationToReservation(GetReservation getReservation) {
        if ( getReservation == null ) {
            return null;
        }

        Reservation.ReservationBuilder reservation = Reservation.builder();

        reservation.book( getReservation.getBook() );
        reservation.id( getReservation.getId() );
        reservation.reservationDate( getReservation.getReservationDate() );
        reservation.status( getReservation.getStatus() );
        reservation.user( getReservation.getUser() );

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
}
