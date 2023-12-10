package com.example.demo.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.CitizenPlan;
import com.example.demo.repository.CitezenplanRepository;

@SuppressWarnings("unused")
@Component
public class DataLoader implements ApplicationRunner{

	@Autowired
	private CitezenplanRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteAll();
		
		// cash plan
		CitizenPlan citizenPlan1 = new CitizenPlan();
		citizenPlan1.setCitizenName("ABC1");
		citizenPlan1.setGender("Male");
		citizenPlan1.setPlaneName("Cash");
		citizenPlan1.setPlaneStatus("Approved");
		citizenPlan1.setPlaneStartDate(LocalDate.now());
		citizenPlan1.setPlaneEnddate(LocalDate.now().plusMonths(6));
		citizenPlan1.setBenefitAmount(500.00);
//		citizenPlan1.setDenialReason(null);
//		citizenPlan1.setTerminationDate(null);
//		citizenPlan1.setTerminationRsn(null);
	
		//===
		CitizenPlan citizenPlan2 = new CitizenPlan();
		citizenPlan2.setCitizenName("ABC2");
		citizenPlan2.setGender("Male");
		citizenPlan2.setPlaneName("Cash");
		citizenPlan2.setPlaneStatus("Denied");
		citizenPlan2.setPlaneStartDate(LocalDate.now());
		citizenPlan2.setPlaneEnddate(LocalDate.now().plusMonths(6));
//		citizenPlan2.setBenefitAmount(500.00);
		citizenPlan2.setDenialReason("Rent income increses");
//		citizenPlan2.setTerminationDate(null);
//		citizenPlan2.setTerminationRsn(null);
		
		
		//===
		CitizenPlan citizenPlan3 = new CitizenPlan();
		citizenPlan3.setCitizenName("ABC3");
		citizenPlan3.setGender("Fe-male");
		citizenPlan3.setPlaneName("Cash");
		citizenPlan3.setPlaneStatus("Terminated");
		citizenPlan3.setPlaneStartDate(LocalDate.now().minusMonths(4));
		citizenPlan3.setPlaneEnddate(LocalDate.now().plusMonths(6));
		citizenPlan2.setBenefitAmount(400.00);
		citizenPlan3.setDenialReason("Employeed");
		citizenPlan2.setTerminationDate(LocalDate.now());
//		citizenPlan2.setTerminationRsn(null);
		
		
		// food plan
		
		CitizenPlan citizenPlan4 = new CitizenPlan();
		citizenPlan4.setCitizenName("ABC4");
		citizenPlan4.setGender("Male");
		citizenPlan4.setPlaneName("Food");
		citizenPlan4.setPlaneStatus("Approved");
		citizenPlan4.setPlaneStartDate(LocalDate.now());
		citizenPlan4.setPlaneEnddate(LocalDate.now().plusMonths(6));
		citizenPlan4.setBenefitAmount(500.00);
//		citizenPlan4.setDenialReason(null);
//		citizenPlan4.setTerminationDate(null);
//		citizenPlan4.setTerminationRsn(null);
	
		//===
		CitizenPlan citizenPlan5 = new CitizenPlan();
		citizenPlan5.setCitizenName("ABC5");
		citizenPlan5.setGender("Male");
		citizenPlan5.setPlaneName("Food");
		citizenPlan5.setPlaneStatus("Denied");
		citizenPlan5.setPlaneStartDate(LocalDate.now());
		citizenPlan5.setPlaneEnddate(LocalDate.now().plusMonths(6));
//		citizenPlan5.setBenefitAmount(500.00);
		citizenPlan5.setDenialReason("Rent income increses");
//		citizenPlan5.setTerminationDate(null);
//		citizenPlan5.setTerminationRsn(null);
		
		
		//===
		CitizenPlan citizenPlan6 = new CitizenPlan();
		citizenPlan6.setCitizenName("ABC6");
		citizenPlan6.setGender("Fe-male");
		citizenPlan6.setPlaneName("Food");
		citizenPlan6.setPlaneStatus("Terminated");
		citizenPlan6.setPlaneStartDate(LocalDate.now().minusMonths(4));
		citizenPlan6.setPlaneEnddate(LocalDate.now().plusMonths(6));
		citizenPlan5.setBenefitAmount(400.00);
		citizenPlan6.setDenialReason("Employeed");
		citizenPlan6.setTerminationDate(LocalDate.now());
//	    citizenPlan6.setTerminationRsn(null);
		
		
		// Medical plan data
		CitizenPlan citizenPlan7 = new CitizenPlan();
		citizenPlan7.setCitizenName("ABC7");
		citizenPlan7.setGender("Male");
		citizenPlan7.setPlaneName("Medical");
		citizenPlan7.setPlaneStatus("Approved");
		citizenPlan7.setPlaneStartDate(LocalDate.now());
		citizenPlan7.setPlaneEnddate(LocalDate.now().plusMonths(6));
		citizenPlan7.setBenefitAmount(500.00);
//		citizenPlan7.setDenialReason(null);
//		citizenPlan7.setTerminationDate(null);
//		citizenPlan7.setTerminationRsn(null);
	
		//===
		CitizenPlan citizenPlan8 = new CitizenPlan();
		citizenPlan8.setCitizenName("ABC8");
		citizenPlan8.setGender("Male");
		citizenPlan8.setPlaneName("Medical");
		citizenPlan8.setPlaneStatus("Denied");
		citizenPlan8.setPlaneStartDate(LocalDate.now());
		citizenPlan8.setPlaneEnddate(LocalDate.now().plusMonths(6));
//		citizenPlan7.setBenefitAmount(500.00);
		citizenPlan8.setDenialReason("Rent income increses");
//		citizenPlan7.setTerminationDate(null);
//		citizenPlan7.setTerminationRsn(null);
		
		
		//===
		CitizenPlan citizenPlan9 = new CitizenPlan();
		citizenPlan9.setCitizenName("ABC9");
		citizenPlan9.setGender("Fe-male");
		citizenPlan9.setPlaneName("Medical");
		citizenPlan9.setPlaneStatus("Terminated");
		citizenPlan9.setPlaneStartDate(LocalDate.now().minusMonths(4));
		citizenPlan9.setPlaneEnddate(LocalDate.now().plusMonths(6));
		citizenPlan9.setBenefitAmount(400.00);
		citizenPlan9.setDenialReason("Employeed");
		citizenPlan9.setTerminationDate(LocalDate.now());
//		citizenPlan9.setTerminationRsn(null);
		
		
		
		// Employment plan data
				CitizenPlan citizenPlan10 = new CitizenPlan();
				citizenPlan10.setCitizenName("ABC10");
				citizenPlan10.setGender("Male");
				citizenPlan10.setPlaneName("Employment");
				citizenPlan10.setPlaneStatus("Approved");
				citizenPlan10.setPlaneStartDate(LocalDate.now());
				citizenPlan10.setPlaneEnddate(LocalDate.now().plusMonths(6));
				citizenPlan10.setBenefitAmount(500.00);
//				citizenPlan10.setDenialReason(null);
//				citizenPlan10.setTerminationDate(null);
//				citizenPlan10.setTerminationRsn(null);
			
				//===
				CitizenPlan citizenPlan11 = new CitizenPlan();
				citizenPlan11.setCitizenName("ABC11");
				citizenPlan11.setGender("Male");
				citizenPlan11.setPlaneName("Employment");
				citizenPlan11.setPlaneStatus("Denied");
				citizenPlan11.setPlaneStartDate(LocalDate.now());
				citizenPlan11.setPlaneEnddate(LocalDate.now().plusMonths(6));
//				citizenPlan11.setBenefitAmount(500.00);
				citizenPlan11.setDenialReason("Rent income increses");
//				citizenPlan11.setTerminationDate(null);
//				citizenPlan11.setTerminationRsn(null);
				
				
				//===
				CitizenPlan citizenPlan12 = new CitizenPlan();
				citizenPlan12.setCitizenName("ABC12");
				citizenPlan12.setGender("Fe-male");
				citizenPlan12.setPlaneName("Employment");
				citizenPlan12.setPlaneStatus("Terminated");
				citizenPlan12.setPlaneStartDate(LocalDate.now().minusMonths(4));
				citizenPlan12.setPlaneEnddate(LocalDate.now().plusMonths(6));
				citizenPlan12.setBenefitAmount(400.00);
				citizenPlan12.setDenialReason("Employeed");
				citizenPlan12.setTerminationDate(LocalDate.now());
//				citizenPlan12.setTerminationRsn(null);
		
				
				List<CitizenPlan> citizenList = Arrays.asList(citizenPlan1,citizenPlan2,citizenPlan3,citizenPlan4,citizenPlan5,citizenPlan6,citizenPlan7,citizenPlan8,citizenPlan9,citizenPlan10,citizenPlan11,citizenPlan12);
				
				repo.saveAll(citizenList);
		
	}

}
