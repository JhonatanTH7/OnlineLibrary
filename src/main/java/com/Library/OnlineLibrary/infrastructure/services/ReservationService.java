package com.Library.OnlineLibrary.infrastructure.services;

import com.Library.OnlineLibrary.api.dto.GetReservation;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService implements IReservationService {
    @Override
    public List<GetReservation> getReservationsByUserId() {
        return List.of();
    }

    @Override
    public List<GetReservation> getReservationsByBookId() {
        return List.of();
    }

    @Override
    public GetReservation getById(Long id) {
        return null;
    }

    @Override
    public GetReservation create(GetReservation request) {
        return null;
    }

    @Override
    public GetReservation update(GetReservation request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
