package com.zimttech.diabeticscreening.entities;

import com.zimttech.diabeticscreening.entities.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 *
 * @author Ephraim Madodno
 * Entity class to record Patient Details
 *
 */
@Data
@NoArgsConstructor
@Entity(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientID;

    @Column(name="national_identification_number")
    private String nidNumber;

    @Column(name="full_name")
    private String fullName;

    @Column(name="gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(name="date_of_birth")
    private LocalDateTime dateOfBirth;

    @OneToOne
    private Address address;

    @OneToOne
    private Contact contact_details;

    @OneToOne
    private Contact next_off_keen;

    @Column(name="created_on")
    @CreationTimestamp
    private Instant createdOn;

    @Column(name="last_updated_on")
    @UpdateTimestamp
    private Instant lastUpdatedOn;
}
