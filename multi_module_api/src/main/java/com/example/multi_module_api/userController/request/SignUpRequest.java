package com.example.multi_module_api.userController.request;

import com.example.multi_module_database.user.entity.User;
import jakarta.validation.constraints.NotBlank;

public record SignUpRequest(

    @NotBlank(message = "사용자의 이메일은 필수 입니다.")
    String email,

    @NotBlank(message = "사용자의 비밀번호는 필수 입니다.")
    String password
) {
    public User toEntity() {
        return new User(email, password);
    }
}
