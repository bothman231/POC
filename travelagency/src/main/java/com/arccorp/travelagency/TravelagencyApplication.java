package com.arccorp.travelagency;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class TravelagencyApplication extends SpringBootServletInitializer {

	Logger log = LoggerFactory.getLogger(TravelagencyApplication.class);
	
	
	
	@Autowired
	public TravelAgencyRepository travelAgencyRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TravelagencyApplication.class, args);
	}
	
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TravelagencyApplication.class);
    }
    
    
    
	
	
	@PostConstruct
	public void postConstruct() {
		
		String mName="postConstruct";
		
		if (log.isDebugEnabled()) {
			log.debug(mName+" Starts, "+travelAgencyRepository);
		}
		
		for (TravelAgency ta : travelAgencyRepository.findAll()) {
			if (log.isDebugEnabled()) {
				log.debug(mName+" "+ta.toString());
			}
		}
		
	}
}
