package com.chiorattovinicius.hexagonal.application.ports.in;

import com.chiorattovinicius.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
