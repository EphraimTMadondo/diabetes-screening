package com.zimttech.diabeticscreening.persistence;

import com.zimttech.diabeticscreening.entities.Vital;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ephraim Madodno
 * Database Persistence class to manage Patient Vitals Database Records
 *
 */
public interface VitalRepository extends JpaRepository<Vital, Long> {
}
