package com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.ReservationRequest;
import com.Library.OnlineLibrary.api.dto.response.LoanResponse;
import com.Library.OnlineLibrary.api.dto.response.ReservationResponse;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.ICreateService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IDeleteService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IGetByIdService;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEndpointsServices.IUpdateService;

@Service
public interface IReservationService extends
        ICreateService<ReservationRequest, ReservationResponse>,
        IGetByIdService<ReservationResponse, Long>,
        IUpdateService<ReservationRequest, ReservationResponse, Long>,
        IDeleteService<Long> {
    List<LoanResponse> getAllByUser(Long idUser);

    List<LoanResponse> getAllByBook(Long idBook);
}
