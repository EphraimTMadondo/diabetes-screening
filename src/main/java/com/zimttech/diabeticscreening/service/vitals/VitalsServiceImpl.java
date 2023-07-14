package com.zimttech.diabeticscreening.service.vitals;

import com.zimttech.diabeticscreening.entities.Vital;
import com.zimttech.diabeticscreening.persistence.VitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VitalsServiceImpl implements VitalsService {
    private final VitalRepository vitalRepository;
    @Override
    public List<Vital> getAll() {
        return vitalRepository.findAll();
    }
}
