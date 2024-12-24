package com.nguyenducmanh.talkifybackend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegisterDTO {
    @NotBlank(message = "Username is required")
    String username;

    @Email
    @NotBlank(message = "Email is required")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Incorrect email format")
    String email;

    @NotBlank(message = "Password is required")
    @Length(min = 8, max = 12, message = "Password must be between 8 and 12 characters")
    String password;

    @NotBlank(message = "Confirm password is required")
    @Length(min = 8, max = 12, message = "Password must be between 8 and 12 characters")
    String confirmPassword;
}
