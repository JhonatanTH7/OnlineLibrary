package com.Library.OnlineLibrary.infrastructure.helpers.mappers;

import com.Library.OnlineLibrary.api.dto.request.ReservationRequest;
import com.Library.OnlineLibrary.api.dto.response.ReservationResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;
import com.Library.OnlineLibrary.domain.entities.Book;
import com.Library.OnlineLibrary.domain.entities.Reservation;
import com.Library.OnlineLibrary.domain.entities.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-08T23:17:04-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public Reservation toEntity(ReservationRequest reservation) {
        if ( reservation == null ) {
            return null;
        }

        Reservation reservation1 = new Reservation();

        reservation1.setBook( reservationRequestToBook( reservation ) );
        reservation1.setUser( reservationRequestToUser( reservation ) );
        reservation1.setReservationDate( reservation.getReservationDate() );
        reservation1.setStatus( reservation.getStatus() );

        return reservation1;
    }

    @Override
    public ReservationResponse toEntityResponse(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationResponse reservationResponse = new ReservationResponse();

        reservationResponse.setId( reservation.getId() );
        reservationResponse.setReservationDate( reservation.getReservationDate() );
        reservationResponse.setStatus( reservation.getStatus() );
        reservationResponse.setBook( bookToBookBasicResponse( reservation.getBook() ) );
        reservationResponse.setUser( userToUserBasicResponse( reservation.getUser() ) );

        return reservationResponse;
    }

    @Override
    public void toExistingEntity(ReservationRequest request, Reservation reservation) {
        if ( request == null ) {
            return;
        }

        reservation.setReservationDate( request.getReservationDate() );
        reservation.setStatus( request.getStatus() );
    }

    protected Book reservationRequestToBook(ReservationRequest reservationRequest) {
        if ( reservationRequest == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( reservationRequest.getBookId() );

        return book;
    }

    protected User reservationRequestToUser(ReservationRequest reservationRequest) {
        if ( reservationRequest == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( reservationRequest.getUserId() );

        return user.build();
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
}
