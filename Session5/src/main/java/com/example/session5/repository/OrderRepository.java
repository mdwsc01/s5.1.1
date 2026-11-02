package com.example.session5.repository;

import com.example.session5.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByStatus(String status);
    List<Order> findByCustomerNameContaining(String customerName);
}
