package com.zimttech.diabeticscreening.persistence;

import com.zimttech.diabeticscreening.entities.PatientLogs;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Ephraim Madodno
 * Database Persistence class to manage Patient PatientLogs Database Records
 *
 */
public interface PatientLogsRepository extends JpaRepository<PatientLogs, Long> {
}
