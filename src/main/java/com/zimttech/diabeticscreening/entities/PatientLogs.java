package com.zimttech.diabeticscreening.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 * @author Ephraim Madodno
 * Entity class to record Patient Logs
 *
 */
@Data
@NoArgsConstructor
@Entity(name = "patient_logs")
public class PatientLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientLogID;

    @ManyToOne
    private Patient patient;

    @OneToMany
    private List<Vital> vitals;
}
