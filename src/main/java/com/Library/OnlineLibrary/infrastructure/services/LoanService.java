package com.Library.OnlineLibrary.infrastructure.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.LoanRequest;
import com.Library.OnlineLibrary.api.dto.response.LoanResponse;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.ILoanService;

@Service
public class LoanService implements ILoanService {

    @Override
    public LoanResponse create(LoanRequest request) {
        return null;
    }

    @Override
    public LoanResponse findById(Long id) {
        return null;
    }

    @Override
    public LoanResponse update(LoanRequest request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<LoanResponse> getAllByUser(Long idUser) {
        return null;
    }

}
