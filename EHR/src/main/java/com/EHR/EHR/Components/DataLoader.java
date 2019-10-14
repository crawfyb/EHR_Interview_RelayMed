package com.EHR.EHR.Components;

import com.EHR.EHR.Models.OrderType;
import com.EHR.EHR.Models.Patient;
import com.EHR.EHR.Models.PatientOrder;
import com.EHR.EHR.Repositories.OrderTypeRepositories.OrderTypeRepository;
import com.EHR.EHR.Repositories.PatientOrderReposiotories.PatientOrderRepository;
import com.EHR.EHR.Repositories.PatientRepositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class DataLoader {

    @Autowired
    OrderTypeRepository orderTypeRepository;

    @Autowired
    PatientOrderRepository patientOrderRepository;

    @Autowired
    PatientRepository patientRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Patient patient1 = new Patient("OGH00123", "Robert", "Smith", "12/03/1983", "23 London Road, Edinburgh, EH3 1AP");
        patientRepository.save(patient1);


        Patient patient2 = new Patient("OGH00124", "John", "Brown", "02/11/1988", "25 Glasgow Road, Edinburgh, EH3 3FH");
        patientRepository.save(patient2);

        Patient patient3 = new Patient("OGH00154", "Sarah", "Davidson", "02/11/1988", "25 Glasgow Road, Edinburgh, EH3 3FH");
        patientRepository.save(patient3);

        Patient patient4 = new Patient("OGH00223", "Alan", "Wright", "02/11/1988", "25 Glasgow Road, Edinburgh, EH3 3FH");
        patientRepository.save(patient4);

        Patient patient5 = new Patient("OGH00874", "Lea", "Gibson", "02/11/1988", "25 Glasgow Road, Edinburgh, EH3 3FH");
        patientRepository.save(patient5);

        Patient patient6 = new Patient("OGH00191", "Martha", "Johnson", "02/11/1988", "25 Glasgow Road, Edinburgh, EH3 3FH");
        patientRepository.save(patient6);

        OrderType orderType1 = new OrderType(100116, "Basic Metabolic Panel", "Blood");
        orderTypeRepository.save(orderType1);

        OrderType orderType2 = new OrderType(100120, "Comprehensive Metabolic", "Blood");
        orderTypeRepository.save(orderType2);

        OrderType orderType3 = new OrderType(100121, "Electrolyte Panel", "Blood");
        orderTypeRepository.save(orderType3);

        OrderType orderType4 = new OrderType(100124, "General Chemistry 13", "Blood");
        orderTypeRepository.save(orderType4);

        PatientOrder patientOrder1 = new PatientOrder("10/03/2019", "requested");
        patientOrderRepository.save(patientOrder1);

        PatientOrder patientOrder2 = new PatientOrder("11/02/2019", "accepted");
        patientOrderRepository.save(patientOrder2);

        PatientOrder patientOrder3 = new PatientOrder("23/11/2019", "requested");
        patientOrderRepository.save(patientOrder3);

        PatientOrder patientOrder4 = new PatientOrder("18/04/2019", "rejected");
        patientOrderRepository.save(patientOrder4);

        PatientOrder patientOrder5 = new PatientOrder("09/09/2019", "reviewed");
        patientOrderRepository.save(patientOrder5);


    }
}