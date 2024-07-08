package com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.LoanRequest;
import com.Library.OnlineLibrary.api.dto.response.LoanResponse;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.ICreateService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IDeleteService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IGetByIdService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IUpdateService;

@Service
public interface ILoanService extends
        ICreateService<LoanRequest, LoanResponse>,
        IGetByIdService<LoanResponse, Long>,
        IUpdateService<LoanRequest, LoanResponse, Long>,
        IDeleteService<Long> {
    List<LoanResponse> getAllByUser(Long idUser);
}
