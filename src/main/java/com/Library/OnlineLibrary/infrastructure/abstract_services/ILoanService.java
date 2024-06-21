package com.Library.OnlineLibrary.infrastructure.abstract_services;

import com.Library.OnlineLibrary.api.dto.GetLoan;
import com.Library.OnlineLibrary.domain.entities.Loan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ILoanService extends CrudService<GetLoan, Long> {

    List<GetLoan> getLoansByUserId();

}
