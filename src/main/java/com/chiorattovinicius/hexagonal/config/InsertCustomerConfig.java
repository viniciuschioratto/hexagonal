package com.chiorattovinicius.hexagonal.config;

import com.chiorattovinicius.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.chiorattovinicius.hexagonal.adapters.out.InsertCustomerAdapter;
import com.chiorattovinicius.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.chiorattovinicius.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }

}
