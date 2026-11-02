package com.example.session5.controller;

import com.example.session5.model.Order;
import com.example.session5.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/searchStatus")
    public ResponseEntity<List<Order>> searchByStatus(@RequestParam String status){
        List<Order> orders = orderService.getOrdersByStatus(status);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/searchCustomer")
    public ResponseEntity<List<Order>> searchByCustomer(@RequestParam String customerName){
        List<Order> orders = orderService.getOrdersByCustomerName(customerName);
        return ResponseEntity.ok(orders);
    }
}
