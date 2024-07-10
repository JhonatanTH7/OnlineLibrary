package com.Library.OnlineLibrary.api.dto.response.specific.book_reservations;

import java.util.List;

import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookReservationsResponse extends BookBasicResponse {

    private List<ReservationInBookReservationsResponse> reservations;

}
