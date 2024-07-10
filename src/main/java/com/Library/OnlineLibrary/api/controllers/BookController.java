package com.Library.OnlineLibrary.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Library.OnlineLibrary.api.dto.request.BookRequest;
import com.Library.OnlineLibrary.api.dto.response.BookResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.specific.book_reservations.BookReservationsResponse;
import com.Library.OnlineLibrary.infrastructure.abstract_services.IEntityService.IBookService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "books")
@AllArgsConstructor
public class BookController {

    @Autowired
    private final IBookService iBookService;

    @Operation(summary = "Create a book", description = "Create a book with the sent parameters")
    @PostMapping
    public ResponseEntity<BookBasicResponse> create(
            @Validated @RequestBody BookRequest request) {
        return ResponseEntity.ok(this.iBookService.create(request));
    }

    @Operation(summary = "Search for a book", description = "Displays the book to which the id refers to")
    @GetMapping(path = "/{id}")
    public ResponseEntity<BookResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(this.iBookService.getById(id));
    }

    @Operation(summary = "Update a book", description = "Updates a book with the parameters sent")
    @PutMapping(path = "/{id}")
    public ResponseEntity<BookBasicResponse> update(
            @Validated @RequestBody BookRequest request,
            @PathVariable Long id) {
        return ResponseEntity.ok(this.iBookService.update(request, id));
    }

    @Operation(summary = "Delete a book", description = "Delete the book to which the id refers to")
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.iBookService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Shows all books", description = "Displays all books that have been saved in the database")
    @GetMapping
    public ResponseEntity<Page<BookBasicResponse>> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {
        Pageable pageable = PageRequest.of(page, size);
        if (page != 0)
            pageable = PageRequest.of(page - 1, size);
        return ResponseEntity.ok(this.iBookService.getAll(pageable));
    }

    @Operation(summary = "Search for all the reservations associated to a book", description = "Displays the reservations to which the id of the book is related to")
    @GetMapping(path = "/{idBook}/reservations")
    public ResponseEntity<BookReservationsResponse> getAllReservationsByBook(@PathVariable Long idBook) {
        return ResponseEntity.ok(this.iBookService.getAllReservationsByBook(idBook));
    }

}
