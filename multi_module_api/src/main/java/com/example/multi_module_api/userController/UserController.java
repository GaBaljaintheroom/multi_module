package com.example.multi_module_api.userController;


import com.example.multi_module_api.userController.request.SignUpRequest;
import com.example.multi_module_database.user.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/sign-up")
    public ResponseEntity<String> signUp(@Valid @RequestBody SignUpRequest request) {
        userRepository.save(request.toEntity());

        return ResponseEntity.ok("사용자 생성 성공!");
    }

}
