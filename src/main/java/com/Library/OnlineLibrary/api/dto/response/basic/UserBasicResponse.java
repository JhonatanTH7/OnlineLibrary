package com.Library.OnlineLibrary.api.dto.response.basic;

import com.Library.OnlineLibrary.util.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicResponse {

    private Long id;
    private String userName;
    private String password;
    private String email;
    private String fullName;
    private Role role;

}
