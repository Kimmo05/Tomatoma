package com.min.toma.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class LoadbalancerCheckController {
    @RestController
    @RequestMapping("/")
    public class LoadbalancerCheckerController {
        @GetMapping("/chk")
        public ResponseEntity chk() {
            return ResponseEntity.ok().build();
        }
    }
}