package com.zimttech.diabeticscreening.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Ephraim Madodno
 * Entity class to record Address Details
 *
 */
@Data
@NoArgsConstructor
@Entity(name = "addresses")
public class Address {
    @Id
    private Long addressID;

    @Column(name = "address_name")
    private String name;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "zip_code")
    private String zipCode;
}
