package com.zimttech.diabeticscreening.service;

import com.zimttech.diabeticscreening.entities.Patient;
import com.zimttech.diabeticscreening.persistence.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;
    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }
}