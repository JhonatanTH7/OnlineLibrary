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

import com.Library.OnlineLibrary.api.dto.request.LoanRequest;
import com.Library.OnlineLibrary.api.dto.response.LoanResponse;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.ILoanService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "loans")
@AllArgsConstructor
public class LoanController {

    @Autowired
    private final ILoanService iLoanService;

    @Operation(summary = "Create a loan", description = "Create a loan with the sent parameters")
    @PostMapping
    public ResponseEntity<LoanResponse> create(
            @Validated @RequestBody LoanRequest request) {
        return ResponseEntity.ok(this.iLoanService.create(request));
    }

    @Operation(summary = "Search for a loan", description = "Displays the loan to which the id refers to")
    @GetMapping(path = "/{id}")
    public ResponseEntity<LoanResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(this.iLoanService.getById(id));
    }

    @Operation(summary = "Update a loan", description = "Updates a loan with the parameters sent")
    @PutMapping(path = "/{id}")
    public ResponseEntity<LoanResponse> update(
            @Validated @RequestBody LoanRequest request,
            @PathVariable Long id) {
        return ResponseEntity.ok(this.iLoanService.update(request, id));
    }

    @Operation(summary = "Delete a loan", description = "Delete the loan to which the id refers to")
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.iLoanService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
