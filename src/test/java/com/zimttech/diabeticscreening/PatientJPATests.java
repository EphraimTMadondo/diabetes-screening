package com.zimttech.diabeticscreening;

import com.zimttech.diabeticscreening.entities.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PatientJPATests {
	@Autowired
	private TestEntityManager entityManager;

	public PatientJPATests() {
	}

	@Test
	public void whenCreatingEntity_ThenLastUpdatedOnAndCreatedOnIsSetAutomatically() {
		Patient patient = new Patient();
		patient = entityManager.persist(patient);
		Instant createdOnAfterCreation = patient.getCreatedOn();
		Instant lastUpdatedOnAfterCreation = patient.getLastUpdatedOn();
		assertThat(createdOnAfterCreation)
				.isNotNull();
		assertThat(lastUpdatedOnAfterCreation)
				.isNotNull();
	}
}
