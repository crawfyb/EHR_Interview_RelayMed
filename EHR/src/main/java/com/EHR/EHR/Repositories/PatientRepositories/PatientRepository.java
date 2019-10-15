package com.EHR.EHR.Repositories.PatientRepositories;
import org.springframework.data.jpa.repository.JpaRepository;



import com.EHR.EHR.Models.Patient;

import java.util.List;

public interface PatientRepository  extends JpaRepository<Patient, Long>, PatientRepositoryCustom {
    List<Patient> findPatientByMRN(String mRN);
}
