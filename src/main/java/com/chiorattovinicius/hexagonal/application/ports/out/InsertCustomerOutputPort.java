package com.chiorattovinicius.hexagonal.application.ports.out;

import com.chiorattovinicius.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
