package org.samsung.testtdd.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
public class CustomerServiceTest
{
    private CustomerService customerService;

    @BeforeEach
    void setUp() {
        customerService = new CustomerService();
    }

    @Test
    public void testAddCustomerWithUniqueEmail() {
        customerService.addCustomer("Duke", "C042", "duke@java.org");
        assertEquals(1, customerService.getCustomers().size());
    }

    @Test
    public void testAddCustomerWithDuplicateEmail() {
        customerService.addCustomer("John", "C001", "john@example.com");
        customerService.addCustomer("Jane", "C002", "john@example.com");
        assertEquals(1, customerService.getCustomers().size());
    }

    @Test
    public void testGetCustomers() {
        customerService.addCustomer("Duke", "C042", "duke@java.org");
        customerService.addCustomer("Mike", "C0124", "mike@java.org");
        assertEquals(2, customerService.getCustomers().size());
    }
}
