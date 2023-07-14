package com.zimttech.diabeticscreening.persistence;

import com.zimttech.diabeticscreening.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Ephraim Madodno
 * Database Persistence class to manage Contacts Database Records
 *
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
