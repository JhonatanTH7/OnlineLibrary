package com.Library.OnlineLibrary.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Library.OnlineLibrary.api.dto.request.ReservationRequest;
import com.Library.OnlineLibrary.api.dto.response.ReservationResponse;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.IReservationService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "reservations")
@AllArgsConstructor
public class ReservationController {

    @Autowired
    private final IReservationService iReservationService;

    @Operation(summary = "Create a reservation", description = "Create a reservation with the sent parameters")
    @PostMapping
    public ResponseEntity<ReservationResponse> create(
            @Validated @RequestBody ReservationRequest request) {
        return ResponseEntity.ok(this.iReservationService.create(request));
    }

    @Operation(summary = "Search for a reservation", description = "Displays the reservation to which the id refers to")
    @GetMapping(path = "/{id}")
    public ResponseEntity<ReservationResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(this.iReservationService.getById(id));
    }

    @Operation(summary = "Update a reservation", description = "Updates a reservation with the parameters sent")
    @PutMapping(path = "/{id}")
    public ResponseEntity<ReservationResponse> update(
            @Validated @RequestBody ReservationRequest request,
            @PathVariable Long id) {
        return ResponseEntity.ok(this.iReservationService.update(request, id));
    }

    @Operation(summary = "Delete a reservation", description = "Delete the reservation to which the id refers to")
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.iReservationService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
