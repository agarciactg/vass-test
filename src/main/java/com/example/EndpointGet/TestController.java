package com.example.EndpointGet;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {
    @GetMapping("/Test/Status")
    public String getStatus(@RequestParam("value") int value) {
        if (value >= 3) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}
