package com.EHR.EHR;

import com.EHR.EHR.Models.Patient;
import com.EHR.EHR.Repositories.OrderTypeRepositories.OrderTypeRepository;
import com.EHR.EHR.Repositories.PatientOrderReposiotories.PatientOrderRepository;
import com.EHR.EHR.Repositories.PatientRepositories.PatientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EhrApplicationTests {

	@Autowired
	PatientOrderRepository patientOrderRepository;

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	OrderTypeRepository orderTypeRepository;

	@Test
	public void contextLoads() {
	}


//	@Test
//	public void canGetPatientByMRN() {
//		List<Patient> found = patientRepository.findPatientByMRN("OGH00123");
//		assertEquals("12/03/1983", found.get(0).getDateOfBirth());
//	}
}
