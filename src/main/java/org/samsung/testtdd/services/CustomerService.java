package org.samsung.testtdd.services;

import org.samsung.testtdd.repository.AccountRepository;
import org.samsung.testtdd.repository.models.Customer;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(String name, String number, String email) {
        if (isEmailUnique(email)) {
            Customer customer = new Customer(name, number, email);
            customers.add(customer);
            System.out.println("Customer added successfully!");
        } else {
            System.out.println("Email already exists. Customer not added.");
        }
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    private boolean isEmailUnique(String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }
}
