package com.chiorattovinicius.hexagonal.application.ports.out;

import com.chiorattovinicius.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
