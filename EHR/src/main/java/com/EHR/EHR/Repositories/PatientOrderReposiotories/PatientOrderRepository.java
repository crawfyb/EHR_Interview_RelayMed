package com.EHR.EHR.Repositories.PatientOrderReposiotories;

import com.EHR.EHR.Models.PatientOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientOrderRepository extends JpaRepository<PatientOrder, Long>, PatientOrderRepositoryCustom {
}
