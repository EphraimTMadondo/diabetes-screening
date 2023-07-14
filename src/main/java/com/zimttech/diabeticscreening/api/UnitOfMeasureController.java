package com.zimttech.diabeticscreening.api;

import com.zimttech.diabeticscreening.entities.UnitOfMeasure;
import com.zimttech.diabeticscreening.service.uom.UnitOfMeasureService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 *
 * @author Ephraim Madodno
 * Patient Rest API Controller - /api/v1/uom
 *
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = {"/api/v1/uom"}, produces = APPLICATION_JSON_VALUE)
public class UnitOfMeasureController {
    private final UnitOfMeasureService unitOfMeasureService;

    @GetMapping
    public List<UnitOfMeasure> getUoms() {
        return unitOfMeasureService.getAll();
    }
}
