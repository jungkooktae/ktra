package org.samsung.testtdd.repository;

import org.samsung.testtdd.repository.models.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
    public Customer getAccountByAccountNumber(String accNumber){
        throw new RuntimeException("Function is not implemented");
    }

    public boolean updateAccount(Customer account)
    {
        throw new RuntimeException("Function is not implemented");
    }
}