package com.Library.OnlineLibrary.api.dto.response.specific.user_reservations;

import java.util.List;

import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserReservationsResponse extends UserBasicResponse {

    private List<ReservationInUserReservationsResponse> reservations;

}
