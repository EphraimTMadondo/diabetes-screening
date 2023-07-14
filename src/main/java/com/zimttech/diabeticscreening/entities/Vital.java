package com.zimttech.diabeticscreening.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import java.time.Instant;

/**
 *
 * @author Ephraim Madodno
 * Entity class to record Vital Signs (BP, Weight, Height)
 *
 */
@Data
@NoArgsConstructor
@Entity(name = "patient_vitals")
public class Vital {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="vital_name")
    private String name;

    @Column(name="vital_value")
    private Double value;

    @OneToOne
    private UnitOfMeasure uom;

    @Column(name="createdon")
    @CreationTimestamp
    private Instant createdOn;
}
