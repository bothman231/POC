package com.arccorp.travelagency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TravelagencyApplicationTests {

	
	Logger log = LoggerFactory.getLogger(TravelagencyApplicationTests.class);
	
	
	//@Autowired
	//public TravelAgencyRepository travelAgencyRepository;
	
	//@Test
	public void contextLoads() {
	}
	
	//@Test
	public void getTravelAgencies() {
		String mName="Tests.getTravelAgencies";
		/*
		for (TravelAgency ta : travelAgencyRepository.findAll()) {
			if (log.isDebugEnabled()) {
				log.debug(mName+" "+ta.toString());
			}
		}
		*/
	}
	
	@Test
	public void t() {
		
	}

}
