package com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService;

import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.UserRequest;
import com.Library.OnlineLibrary.api.dto.response.UserResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.specific.user_loans.UserLoansResponse;
import com.Library.OnlineLibrary.api.dto.response.specific.user_reservations.UserReservationsResponse;
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

        UserLoansResponse getAllLoansByUser(Long idUser);

        UserReservationsResponse getAllReservationsByUser(Long idUser);
}
