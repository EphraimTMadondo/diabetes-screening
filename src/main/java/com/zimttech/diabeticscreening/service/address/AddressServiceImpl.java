package com.zimttech.diabeticscreening.service.address;

import com.zimttech.diabeticscreening.entities.Address;
import com.zimttech.diabeticscreening.persistence.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }
}
