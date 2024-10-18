package com.scrt.security.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
@RequiredArgsConstructor
public class TokenTestController {

    @GetMapping()
    public ResponseEntity<String> testToken() {
        return ResponseEntity.ok("Token is correct");
    }
}
