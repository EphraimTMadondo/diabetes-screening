package com.zimttech.diabeticscreening.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Ephraim Madodno
 * Entity class to record Contact Details
 *
 */
@Data
@NoArgsConstructor
@Entity(name = "contacts")
public class Contact {
    @Id
    private Long contactID;

    @Column(name = "contact_name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;
}
