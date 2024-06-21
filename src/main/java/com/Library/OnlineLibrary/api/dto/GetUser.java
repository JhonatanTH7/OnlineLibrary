package com.Library.OnlineLibrary.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class GetUser {
    
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String fullName;
    private String role;

}
