package com.chiorattovinicius.hexagonal.application.ports.out;

import com.chiorattovinicius.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
