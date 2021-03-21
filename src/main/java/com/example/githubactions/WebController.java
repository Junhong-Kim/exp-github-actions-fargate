package com.example.githubactions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class WebController {

    @Value("${sample.value}")
    private String value;

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return String.format("OK-2 %s", value);
    }

    @GetMapping("/test")
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }
}
