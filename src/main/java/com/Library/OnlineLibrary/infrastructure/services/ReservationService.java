package com.Library.OnlineLibrary.infrastructure.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.ReservationRequest;
import com.Library.OnlineLibrary.api.dto.response.LoanResponse;
import com.Library.OnlineLibrary.api.dto.response.ReservationResponse;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.IReservationService;

@Service
public class ReservationService implements IReservationService {

    @Override
    public ReservationResponse create(ReservationRequest request) {
        return null;
    }

    @Override
    public ReservationResponse getById(Long id) {
        return null;
    }

    @Override
    public ReservationResponse update(ReservationRequest request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<LoanResponse> getAllByUser(Long idUser) {
        return null;
    }

    @Override
    public List<LoanResponse> getAllByBook(Long idBook) {
        return null;
    }

}
