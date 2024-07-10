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

import com.Library.OnlineLibrary.api.dto.request.UserRequest;
import com.Library.OnlineLibrary.api.dto.response.UserResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.specific.user_loans.UserLoansResponse;
import com.Library.OnlineLibrary.api.dto.response.specific.user_reservations.UserReservationsResponse;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.IUserService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "users")
@AllArgsConstructor
public class UserController {

    @Autowired
    private final IUserService iUserService;

    @Operation(summary = "Create a user", description = "Create a user with the sent parameters")
    @PostMapping
    public ResponseEntity<UserBasicResponse> create(
            @Validated @RequestBody UserRequest request) {
        return ResponseEntity.ok(this.iUserService.create(request));
    }

    @Operation(summary = "Search for a user", description = "Displays the user to which the id refers to")
    @GetMapping(path = "/{id}")
    public ResponseEntity<UserResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(this.iUserService.getById(id));
    }

    @Operation(summary = "Update a user", description = "Updates a user with the parameters sent")
    @PutMapping(path = "/{id}")
    public ResponseEntity<UserBasicResponse> update(
            @Validated @RequestBody UserRequest request,
            @PathVariable Long id) {
        return ResponseEntity.ok(this.iUserService.update(request, id));
    }

    @Operation(summary = "Delete a user", description = "Delete the user to which the id refers to")
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.iUserService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Search for all the loans associated to a user", description = "Displays the loans to which the id of the user is related to")
    @GetMapping(path = "/{idUser}/loans")
    public ResponseEntity<UserLoansResponse> getAllLoansByUser(@PathVariable Long idUser) {
        return ResponseEntity.ok(this.iUserService.getAllLoansByUser(idUser));
    }

    @Operation(summary = "Search for all the reservations associated to a user", description = "Displays the reservations to which the id of the user is related to")
    @GetMapping(path = "/{idUser}/reservations")
    public ResponseEntity<UserReservationsResponse> getAllReservationsByUser(@PathVariable Long idUser) {
        return ResponseEntity.ok(this.iUserService.getAllReservationsByUser(idUser));
    }

}
