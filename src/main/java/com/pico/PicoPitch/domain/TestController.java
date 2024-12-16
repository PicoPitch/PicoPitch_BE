package com.pico.PicoPitch.domain;

import com.pico.PicoPitch.global.common.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<ApiResponse<String>> test(){
        return ApiResponse.of(HttpStatus.OK, "it's test!");
    }

}
