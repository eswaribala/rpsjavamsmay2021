package com.boa.upload.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.upload.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
