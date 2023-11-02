package com.chiorattovinicius.hexagonal.application.ports.in;

import com.chiorattovinicius.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
