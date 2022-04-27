package com.lyh.orderservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class OrderController {

    @GetMapping("/get/{orderId}")
    public ResponseEntity<String> get(@PathVariable("orderId") String orderId) {

        return ResponseEntity.ok("Order " + orderId);
    }
}
