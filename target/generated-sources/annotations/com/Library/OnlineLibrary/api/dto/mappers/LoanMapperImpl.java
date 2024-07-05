package com.Library.OnlineLibrary.api.dto.mappers;

import com.Library.OnlineLibrary.api.dto.GetLoan;
import com.Library.OnlineLibrary.domain.entities.Loan;
import com.Library.OnlineLibrary.util.enums.Status;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-05T08:46:04-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class LoanMapperImpl implements LoanMapper {

    @Override
    public GetLoan toGetDTO(Loan loan) {
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

    @Override
    public Loan toEntity(GetLoan getLoan) {
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

    @Override
    public List<GetLoan> toGetLoanList(List<Loan> loans) {
        if ( loans == null ) {
            return null;
        }

        List<GetLoan> list = new ArrayList<GetLoan>( loans.size() );
        for ( Loan loan : loans ) {
            list.add( toGetDTO( loan ) );
        }

        return list;
    }

    @Override
    public List<Loan> toEntityList(List<GetLoan> loans) {
        if ( loans == null ) {
            return null;
        }

        List<Loan> list = new ArrayList<Loan>( loans.size() );
        for ( GetLoan getLoan : loans ) {
            list.add( toEntity( getLoan ) );
        }

        return list;
    }
}
