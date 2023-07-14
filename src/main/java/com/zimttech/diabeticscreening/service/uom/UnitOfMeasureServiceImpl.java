package com.zimttech.diabeticscreening.service.uom;

import com.zimttech.diabeticscreening.entities.UnitOfMeasure;
import com.zimttech.diabeticscreening.persistence.UnitOfMeasureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {
    private final UnitOfMeasureRepository unitOfMeasureRepository;
    @Override
    public List<UnitOfMeasure> getAll() {
        return unitOfMeasureRepository.findAll();
    }
}
