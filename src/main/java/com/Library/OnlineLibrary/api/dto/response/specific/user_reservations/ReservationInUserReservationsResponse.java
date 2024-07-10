package com.Library.OnlineLibrary.api.dto.response.specific.user_reservations;

import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.ReservationBasicResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationInUserReservationsResponse extends ReservationBasicResponse {

    private BookBasicResponse book;

}
