package com.chiorattovinicius.hexagonal.adapters.out.client.mapper;

import com.chiorattovinicius.hexagonal.adapters.out.client.response.AddressResponse;
import com.chiorattovinicius.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
