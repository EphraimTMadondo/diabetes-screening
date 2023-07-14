package com.zimttech.diabeticscreening.service.patientlogs;

import com.zimttech.diabeticscreening.entities.PatientLogs;
import com.zimttech.diabeticscreening.persistence.PatientLogsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientLogsServiceImpl implements PatientLogsService {
    private final PatientLogsRepository patientLogsRepository;
    @Override
    public List<PatientLogs> getAll() {
        return patientLogsRepository.findAll();
    }
}
