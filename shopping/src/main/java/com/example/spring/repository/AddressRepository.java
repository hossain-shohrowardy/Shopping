package com.example.spring.repository;

import com.example.spring.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring.model.User;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Long> {

	Address findByUser(User user);
}
