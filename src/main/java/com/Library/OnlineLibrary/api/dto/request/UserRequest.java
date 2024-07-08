package com.Library.OnlineLibrary.api.dto.request;

import com.Library.OnlineLibrary.util.enums.Role;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @Schema(description = "User name of the user", example = "JohnDoe1998")
    @NotBlank(message = "The user name is required")
    @Size(message = "The user name have a maximum of 50 characters", max = 50)
    private String userName;
    @Schema(description = "Password of the user", example = "AeX1998Jd")
    @NotBlank(message = "The password of the user is required")
    @Size(message = "The password must have a maximum of 100 characters", max = 100)
    private String password;
    @Schema(description = "Email of the user", example = "JohnDoe@Example.com")
    @NotBlank(message = "The email of the user is required")
    @Size(message = "The email must have a maximum of 100 characters", max = 100)
    @Email(message = "Enter a valid email address")
    private String email;
    @Schema(description = "Full name of the user", example = "John Doe")
    @NotBlank(message = "The full name is required")
    @Size(message = "The full name must have a maximum of 100 characters", max = 100)
    private String fullName;
    @Schema(description = "Role of the user", example = "LIBRARIAN")
    @NotNull(message = "Role is required")
    @Pattern(regexp = "LIBRARIAN|ADMIN|CUSTOMER", message = "Role must be either LIBRARIAN, ADMIN, or CUSTOMER")
    private Role role;

}
