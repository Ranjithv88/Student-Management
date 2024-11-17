package com.SpringBoot.StudentManagement.Controller;

import com.SpringBoot.StudentManagement.Model.Login;
import com.SpringBoot.StudentManagement.Model.User;
import com.SpringBoot.StudentManagement.Services.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<String> register (@Valid @RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login ( @Valid @RequestBody Login login) {
        return service.login(login);
    }

    @GetMapping("/user")
    public String test(){
        return "test";
    }

}

