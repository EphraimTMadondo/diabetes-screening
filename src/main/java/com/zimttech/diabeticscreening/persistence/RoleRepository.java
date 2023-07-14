package com.zimttech.diabeticscreening.persistence;

import com.zimttech.diabeticscreening.entities.Role;
import com.zimttech.diabeticscreening.entities.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 * @author Ephraim Madodno
 * Database Persistence class to manage Users Roles
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(UserRole name);
}
