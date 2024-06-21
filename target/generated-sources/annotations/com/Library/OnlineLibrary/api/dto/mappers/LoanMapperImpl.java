package com.Library.OnlineLibrary.api.dto.mappers;

import com.Library.OnlineLibrary.api.dto.GetLoan;
import com.Library.OnlineLibrary.domain.entities.Loan;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T12:54:51-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class LoanMapperImpl implements LoanMapper {

    @Override
    public GetLoan toGetDTO(Loan loan) {
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

    @Override
    public Loan toEntity(GetLoan getLoan) {
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
