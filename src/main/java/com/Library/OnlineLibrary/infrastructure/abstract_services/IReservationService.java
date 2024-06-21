package com.Library.OnlineLibrary.infrastructure.abstract_services;

import com.Library.OnlineLibrary.api.dto.GetLoan;
import com.Library.OnlineLibrary.api.dto.GetReservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IReservationService extends CrudService<GetReservation, Long> {

    List<GetReservation> getReservationsByUserId();

    List<GetReservation> getReservationsByBookId();

}
