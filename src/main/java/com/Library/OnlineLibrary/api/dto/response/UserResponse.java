package com.Library.OnlineLibrary.api.dto.response;

import java.util.List;

import com.Library.OnlineLibrary.api.dto.response.basic.LoanBasicResponse;
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
public class UserResponse extends UserBasicResponse {

    private List<ReservationBasicResponse> reservations;
    private List<LoanBasicResponse> loans;

}
