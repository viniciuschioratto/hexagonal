package com.chiorattovinicius.hexagonal.adapters.out;

import com.chiorattovinicius.hexagonal.adapters.out.repository.CustomerRepository;
import com.chiorattovinicius.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.chiorattovinicius.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.chiorattovinicius.hexagonal.application.core.domain.Customer;
import com.chiorattovinicius.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {

        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);

        customerRepository.save(customerEntity);

    }
}
