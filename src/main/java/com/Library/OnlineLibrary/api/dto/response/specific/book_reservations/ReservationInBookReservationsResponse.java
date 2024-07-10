package com.Library.OnlineLibrary.api.dto.response.specific.book_reservations;

import com.Library.OnlineLibrary.api.dto.response.basic.ReservationBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationInBookReservationsResponse extends ReservationBasicResponse {

    private UserBasicResponse user;

}
