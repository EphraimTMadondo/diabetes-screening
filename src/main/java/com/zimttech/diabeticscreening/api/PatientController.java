package com.zimttech.diabeticscreening.api;

import com.zimttech.diabeticscreening.entities.Patient;
import com.zimttech.diabeticscreening.service.patient.PatientService;
import com.zimttech.diabeticscreening.utils.MessageResponse;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{patientID}")
    public Patient getPatient(@PathVariable long patientID) {
        return patientService.findPatient(patientID);
    }

    @PostMapping(value="/create",consumes=APPLICATION_JSON_VALUE)
    @Operation(summary = "Create a patient record")
    public ResponseEntity<Patient> crteatePatient(@Valid @RequestBody Patient patient){
        Patient result = patientService.createPatient(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
    @PutMapping(value="/update",consumes=APPLICATION_JSON_VALUE)
    @Operation(summary = "Update a patient record")
    public ResponseEntity<Patient> registerDrone(@Valid @RequestBody Patient patient){
        Patient result = patientService.createPatient(patient);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @DeleteMapping("/{patientID}")
    public ResponseEntity<Object> deletePatient(@PathVariable long patientID) {
        patientService.deletePatient(patientID);
        return ResponseEntity.status(HttpStatus.OK).body(new MessageResponse("Object Successfully removed"));
    }
}
