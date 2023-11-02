package com.chiorattovinicius.hexagonal.application.ports.out;

import com.chiorattovinicius.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
