package dev.java10x.user.controller;

import dev.java10x.user.domain.UserModel;
import dev.java10x.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<UserModel> createUser(UserModel userModel) {
        UserModel savedUser = userService.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }
}
