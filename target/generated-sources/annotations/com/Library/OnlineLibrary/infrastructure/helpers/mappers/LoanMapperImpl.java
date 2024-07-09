package com.Library.OnlineLibrary.infrastructure.helpers.mappers;

import com.Library.OnlineLibrary.api.dto.request.LoanRequest;
import com.Library.OnlineLibrary.api.dto.response.LoanResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;
import com.Library.OnlineLibrary.domain.entities.Book;
import com.Library.OnlineLibrary.domain.entities.Loan;
import com.Library.OnlineLibrary.domain.entities.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-09T11:48:48-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class LoanMapperImpl implements LoanMapper {

    @Override
    public Loan toEntity(LoanRequest loan) {
        if ( loan == null ) {
            return null;
        }

        Loan loan1 = new Loan();

        loan1.setBook( loanRequestToBook( loan ) );
        loan1.setUser( loanRequestToUser( loan ) );
        loan1.setLoanDate( loan.getLoanDate() );
        loan1.setReturnDate( loan.getReturnDate() );
        loan1.setStatus( loan.getStatus() );

        return loan1;
    }

    @Override
    public LoanResponse toEntityResponse(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        LoanResponse loanResponse = new LoanResponse();

        loanResponse.setId( loan.getId() );
        loanResponse.setLoanDate( loan.getLoanDate() );
        loanResponse.setReturnDate( loan.getReturnDate() );
        loanResponse.setStatus( loan.getStatus() );
        loanResponse.setBook( bookToBookBasicResponse( loan.getBook() ) );
        loanResponse.setUser( userToUserBasicResponse( loan.getUser() ) );

        return loanResponse;
    }

    @Override
    public void toExistingEntity(LoanRequest request, Loan loan) {
        if ( request == null ) {
            return;
        }

        loan.setLoanDate( request.getLoanDate() );
        loan.setReturnDate( request.getReturnDate() );
        loan.setStatus( request.getStatus() );
    }

    protected Book loanRequestToBook(LoanRequest loanRequest) {
        if ( loanRequest == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( loanRequest.getBookId() );

        return book;
    }

    protected User loanRequestToUser(LoanRequest loanRequest) {
        if ( loanRequest == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( loanRequest.getUserId() );

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
