package com.zimttech.diabeticscreening.service.patient;

import com.zimttech.diabeticscreening.entities.Patient;
import com.zimttech.diabeticscreening.persistence.PatientRepository;
import com.zimttech.diabeticscreening.utils.PatientNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;
    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient findPatient(long patientID) {
        Optional<Patient> patient = patientRepository.findById(patientID);
        if (patient.isPresent()) {
            return patient.get();
        }
        throw new PatientNotFoundException();
    }
}
