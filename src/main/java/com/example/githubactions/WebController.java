package com.example.githubactions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WebController {

    @Value("${sample.value}")
    private String value;

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return String.format("OK-2 %s", value);
    }
}
