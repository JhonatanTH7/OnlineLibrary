package com.Library.OnlineLibrary.api.dto;

import com.Library.OnlineLibrary.domain.entities.Loan;
import com.Library.OnlineLibrary.domain.entities.Reservation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetUser {

    private Long id;
    private String userName;
    private String password;
    private String email;
    private String fullName;
    private String role;
    private List<GetReservation> reservations;
    private List<GetLoan> loans;

}
