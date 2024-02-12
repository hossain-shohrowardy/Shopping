package com.example.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring.model.PlaceOrder;

@Repository
@Transactional
public interface OrderRepository extends JpaRepository<PlaceOrder, Long> {

	PlaceOrder findByOrderId(int orderId);

	List<PlaceOrder> findAll();

}
