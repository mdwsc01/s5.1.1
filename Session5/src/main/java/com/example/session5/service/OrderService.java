package com.example.session5.service;

import com.example.session5.model.Order;
import com.example.session5.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrdersByStatus(String status){
        return orderRepository.findByStatus(status);
    }

    public List<Order> getOrdersByCustomerName(String customerName){
        return orderRepository.findByCustomerNameContaining(customerName);
    }
}
