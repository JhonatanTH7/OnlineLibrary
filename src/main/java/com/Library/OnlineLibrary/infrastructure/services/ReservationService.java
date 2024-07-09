package com.Library.OnlineLibrary.infrastructure.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library.OnlineLibrary.api.dto.request.ReservationRequest;
import com.Library.OnlineLibrary.api.dto.response.LoanResponse;
import com.Library.OnlineLibrary.api.dto.response.ReservationResponse;
import com.Library.OnlineLibrary.domain.entities.Reservation;
import com.Library.OnlineLibrary.domain.repositories.ReservationRepository;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.IReservationService;
import com.Library.OnlineLibrary.infrastructure.helpers.mappers.ReservationMapper;
import com.Library.OnlineLibrary.util.exceptions.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

    @Autowired
    private final ReservationRepository reservationRepository;

    @Autowired
    private final ReservationMapper reservationMapper;

    @Override
    public ReservationResponse create(ReservationRequest request) {
        return null;
    }

    @Override
    public ReservationResponse getById(Long id) {
        return this.reservationMapper.toEntityResponse(this.find(id));
    }

    @Override
    public ReservationResponse update(ReservationRequest request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {
        this.reservationRepository.delete(this.find(id));
    }

    @Override
    public List<LoanResponse> getAllByUser(Long idUser) {
        return null;
    }

    @Override
    public List<LoanResponse> getAllByBook(Long idBook) {
        return null;
    }

    public Reservation find(Long id) {
        return this.reservationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No reservations found with the id: " + id));
    }

}
