package com.vitali.database.repositories;

import com.vitali.database.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    Optional<Cart> findCartByOrdersId(Integer id);
    Optional<Cart> findCartByUserId(Integer id);
}
