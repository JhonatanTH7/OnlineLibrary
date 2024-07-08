package com.Library.OnlineLibrary.api.dto.response.basic;

import java.util.Date;

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
    private Date loanDate;
    private Date returnDate;
    private Status status;

}
