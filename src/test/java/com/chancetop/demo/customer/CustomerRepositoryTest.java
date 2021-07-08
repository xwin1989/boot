package com.chancetop.demo.customer;

import com.chancetop.demo.item.domain.Customer;
import com.chancetop.demo.item.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Neal
 */
@SpringBootTest
public class CustomerRepositoryTest {
    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void test1() {
        Customer customer = new Customer();
        customer.setFirstName("neal");
        customer.setLastName("xu");
        customerRepository.save(customer);
        Assertions.assertNotNull(customerRepository.findById(1L).orElse(null));

        List<Customer> customers = customerRepository.findByFirstNameOrLastName("neal", "neal");
        Assertions.assertTrue(customers.size() > 0);


        Customer customer2 = customerRepository.findFirstByName("xu", Pageable.ofSize(1)).get(0);
        Assertions.assertNotNull(customer2);

        Customer firstCustomer = customerRepository.findFirstCustomer();
        Assertions.assertNull(firstCustomer);

    }
}
