package com.chiorattovinicius.hexagonal.adapters.out;

import com.chiorattovinicius.hexagonal.adapters.out.repository.CustomerRepository;
import com.chiorattovinicius.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.chiorattovinicius.hexagonal.application.core.domain.Customer;
import com.chiorattovinicius.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
