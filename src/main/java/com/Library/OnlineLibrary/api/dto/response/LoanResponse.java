package com.Library.OnlineLibrary.api.dto.response;

import com.Library.OnlineLibrary.api.dto.response.basic.BookBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.LoanBasicResponse;
import com.Library.OnlineLibrary.api.dto.response.basic.UserBasicResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponse extends LoanBasicResponse {

    private UserBasicResponse user;
    private BookBasicResponse book;

}
