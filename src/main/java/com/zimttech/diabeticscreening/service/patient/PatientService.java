package com.zimttech.diabeticscreening.service.patient;

import com.zimttech.diabeticscreening.entities.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAll();

    Patient findPatient(long patientID);

    Patient createPatient(Patient drone);
    Patient updatePatient(Long patientID, Patient patient);

    boolean deletePatient(Long patientID);
}
