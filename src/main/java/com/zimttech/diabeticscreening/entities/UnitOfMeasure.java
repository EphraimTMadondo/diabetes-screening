package com.zimttech.diabeticscreening.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Ephraim Madodno
 * Entity class to record Unit of Measure
 *
 */
@Data
@NoArgsConstructor
@Entity(name = "unit_of_measure")
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uomID;

    @Column(name="uom_name")
    private String name;

    @Column(name="uom_ratio")
    private String ratio;

    @Column(name="uom_is_default")
    private Boolean isDefault;
}
