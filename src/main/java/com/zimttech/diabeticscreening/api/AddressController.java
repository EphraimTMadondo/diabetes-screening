package com.zimttech.diabeticscreening.api;

import com.zimttech.diabeticscreening.entities.Address;
import com.zimttech.diabeticscreening.service.address.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 *
 * @author Ephraim Madodno
 * Patient Rest API Controller - /api/v1/addressbook
 *
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = {"/api/v1/addressbook"}, produces = APPLICATION_JSON_VALUE)
public class AddressController {
    private final AddressService addressService;

    @GetMapping
    public List<Address> getAddress() {
        return addressService.getAll();
    }
}
