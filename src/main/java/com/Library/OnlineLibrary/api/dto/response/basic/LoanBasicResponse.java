package com.Library.OnlineLibrary.api.dto.response.basic;

import java.time.LocalDate;

import com.Library.OnlineLibrary.util.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanBasicResponse {

    private Long id;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private Status status;

}
