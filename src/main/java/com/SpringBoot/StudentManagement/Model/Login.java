package com.SpringBoot.StudentManagement.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Login {

    @NotBlank(message = " Email is Mandatory ......! ")
    @Email(message = " Email is Invalid .......! ")
    private String email;

    @NotBlank(message = " Password is Mandatory ......! ")
    @Size(min = 8,message = " Too Weak .......! ")
    private String password;
}

