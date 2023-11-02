package com.chiorattovinicius.hexagonal.application.ports.in;

import com.chiorattovinicius.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
