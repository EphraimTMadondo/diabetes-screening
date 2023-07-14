package com.zimttech.diabeticscreening.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 *
 * @author Ephraim Madodno
 * Patient Rest API Controller - /api/v1/patients
 *
 */
@RestController
@RequestMapping(path = {"/api/v1/patients"}, produces = APPLICATION_JSON_VALUE)
public class PatientController {
}
