package com.Library.OnlineLibrary.infrastructure.services;

import com.Library.OnlineLibrary.api.dto.GetLoan;
import com.Library.OnlineLibrary.infrastructure.abstract_services.ILoanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService implements ILoanService {
    @Override
    public List<GetLoan> getLoansByUserId() {
        return List.of();
    }

    @Override
    public GetLoan getById(Long id) {
        return null;
    }

    @Override
    public GetLoan create(GetLoan request) {
        return null;
    }

    @Override
    public GetLoan update(GetLoan request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
