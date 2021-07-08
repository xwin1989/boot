package com.chancetop.demo.item.repository;

import com.chancetop.demo.item.domain.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Neal
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByFirstName(String firstName);

    List<Customer> findByFirstNameOrLastName(String firstName, String lastName);

    @Query("select c from Customer c where c.firstName like ?1% or c.lastName like ?1%")
    List<Customer> findFirstByName(String name, Pageable pageable);

    @Query(value = "select * from customers limit 1", nativeQuery = true)
    Customer findFirstCustomer();
}
