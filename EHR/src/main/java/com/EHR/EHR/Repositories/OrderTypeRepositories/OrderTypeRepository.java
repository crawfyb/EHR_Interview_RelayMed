package com.EHR.EHR.Repositories.OrderTypeRepositories;

import com.EHR.EHR.Models.OrderType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTypeRepository extends JpaRepository<OrderType, Long>, OrderTypeRepositoryCustom {


}
