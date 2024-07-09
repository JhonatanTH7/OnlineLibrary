package com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.UserRequest;
import com.Library.OnlineLibrary.api.dto.response.LoanResponse;
import com.Library.OnlineLibrary.api.dto.response.UserResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;
import com.Library.OnlineLibrary.domain.entities.User;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.ICreateService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IDeleteService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IGetByIdService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IUpdateService;

@Service
public interface IUserService
                extends ICreateService<UserRequest, UserBasicResponse>,
                IGetByIdService<UserResponse, Long>,
                IUpdateService<UserRequest, UserBasicResponse, Long>,
                IDeleteService<Long> {
        User find(Long id);

        List<LoanResponse> getAllLoansByUser(Long idUser);
}
