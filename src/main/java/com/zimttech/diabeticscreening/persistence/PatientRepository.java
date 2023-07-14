package com.zimttech.diabeticscreening.persistence;

import com.zimttech.diabeticscreening.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ephraim Madodno
 * Database Persistence class to manage Patient Database Records
 *
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
