package com.zimttech.diabeticscreening.persistence;

import com.zimttech.diabeticscreening.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Ephraim Madodno
 * Database Persistence class to manage Address Database Records
 *
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
}
