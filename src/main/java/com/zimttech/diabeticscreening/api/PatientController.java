package com.zimttech.diabeticscreening.api;

import com.zimttech.diabeticscreening.entities.Patient;
import com.zimttech.diabeticscreening.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 *
 * @author Ephraim Madodno
 * Patient Rest API Controller - /api/v1/patients
 *
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = {"/api/v1/patients"}, produces = APPLICATION_JSON_VALUE)
public class PatientController {
    private final PatientService patientService;

    @GetMapping
    public List<Patient> getPatients() {
        return patientService.getAll();
    }
}
