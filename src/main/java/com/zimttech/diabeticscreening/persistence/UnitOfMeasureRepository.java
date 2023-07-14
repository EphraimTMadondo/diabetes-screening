package com.zimttech.diabeticscreening.persistence;

import com.zimttech.diabeticscreening.entities.UnitOfMeasure;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ephraim Madodno
 * Database Persistence class to manage Patient UnitOfMeasure Database Records
 *
 */
public interface UnitOfMeasureRepository extends JpaRepository<UnitOfMeasure, Long> {
}
