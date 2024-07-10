package com.Library.OnlineLibrary.api.dto.response.specific.user_loans;

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
public class UserLoansResponse extends UserBasicResponse {

    private List<LoanInUserLoansResponse> loans;

}
