package com.chiorattovinicius.hexagonal.config;

import com.chiorattovinicius.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.chiorattovinicius.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.chiorattovinicius.hexagonal.adapters.out.InsertCustomerAdapter;
import com.chiorattovinicius.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.chiorattovinicius.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIDConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
    
}
