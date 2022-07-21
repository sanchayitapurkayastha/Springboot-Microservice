package com.example.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack() {
        return "UserService is taking longer than expected." + "Please try later.";
    }

    @GetMapping("/deptServiceFallBack")
    public String deptServiceFallBack() {
        return "DeptService is taking longer than expected." + "Please try later.";
    }
}
