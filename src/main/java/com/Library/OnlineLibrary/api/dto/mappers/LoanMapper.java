package com.Library.OnlineLibrary.api.dto.mappers;

import com.Library.OnlineLibrary.api.dto.GetLoan;
import com.Library.OnlineLibrary.domain.entities.Loan;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {

    GetLoan toGetDTO(Loan loan);

    @InheritInverseConfiguration
    Loan toEntity(GetLoan getLoan);

    List<GetLoan> toGetLoanList(List<Loan> loans);

    List<Loan> toEntityList(List<GetLoan> loans);

}
