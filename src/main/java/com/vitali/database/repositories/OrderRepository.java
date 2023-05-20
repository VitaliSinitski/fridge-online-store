package com.vitali.database.repositories;

import com.vitali.database.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order findFirstByOrderByCreatedDateDesc();
    List<Order> findAllByUserId(Integer Id);
}
