package com.namphan.spotify.controller;

import com.namphan.spotify.dto.AccountsDTO;
import com.namphan.spotify.request.LoginRequest;
import com.namphan.spotify.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public/course")
public class AccountController {
    private final IAccountService accountService;

    @Autowired
    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody LoginRequest loginRequest) {
        AccountsDTO accountsDTO = accountService.Login(loginRequest.getUsername(), loginRequest.getPassword());
        if (accountsDTO != null) {
            // Đăng nhập thành công, trả về thông tin tài khoản hoặc token JWT
            return new ResponseEntity<>(accountsDTO, HttpStatus.OK);
        } else {
            // Đăng nhập thất bại, trả về mã lỗi 401 (UNAUTHORIZED) cùng với thông báo lỗi
            return new ResponseEntity<>("Invalid credentials", HttpStatus.UNAUTHORIZED);
        }
    }
}
