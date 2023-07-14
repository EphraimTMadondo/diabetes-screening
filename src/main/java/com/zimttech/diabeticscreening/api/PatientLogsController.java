package com.zimttech.diabeticscreening.api;

import com.zimttech.diabeticscreening.entities.PatientLogs;
import com.zimttech.diabeticscreening.service.patientlogs.PatientLogsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 *
 * @author Ephraim Madodno
 * Patient Rest API Controller - /api/v1/patient-logs
 *
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = {"/api/v1/patient-logs"}, produces = APPLICATION_JSON_VALUE)
public class PatientLogsController {
    private final PatientLogsService patientLogsService;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<PatientLogs> getPatientLogs() {
        return patientLogsService.getAll();
    }
}
