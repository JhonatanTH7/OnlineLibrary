package com.Library.OnlineLibrary.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import com.Library.OnlineLibrary.util.enums.Status;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {

    @Schema(description = "Date of the reservation", example = "08-10-2024")
    @NotNull(message = "Reservation date is required")
    @FutureOrPresent(message = "The reservation date must be in the present or future")
    private LocalDate reservationDate;
    @Schema(description = "Reservation status", example = "ACTIVE")
    @NotNull(message = "Reservation status is required")
    @Pattern(regexp = "ACTIVE|INACTIVE", message = "Status must be either ACTIVE or INACTIVE")
    private Status status;
    @Schema(description = "ID of the user who made the reservation", example = "1")
    @NotNull(message = "The id of the user is required")
    @Min(value = 1, message = "The id of the user must be greater than zero")
    private Long userId;
    @Schema(description = "ID of the book reserved", example = "1")
    @NotNull(message = "The id of the book is required")
    @Min(value = 1, message = "The id of the book must be greater than zero")
    private Long bookId;

}
