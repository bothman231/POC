package com.arccorp.travelagency;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.core.env.Environment;



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
    
    
    @Autowired
    private Environment environment;
	
	
	@PostConstruct
	public void postConstruct() {
		
		String mName="postConstruct";
		
		if (log.isDebugEnabled()) {
			log.debug(mName+" Starts, "+travelAgencyRepository);
			log.debug(mName+" config.id="+environment.getProperty("config.id"));
			
		}
		
		
		
		int travelAgencies=0;
		for (TravelAgency ta : travelAgencyRepository.findAll()) {
			
			travelAgencies++;
			
			if (log.isDebugEnabled()) {
				log.debug(mName+" "+ta.toString());
			}
		}
		
		if (log.isDebugEnabled()) {
			log.debug(mName+" found "+travelAgencies+" travel agencies");
		}
		
	}
}
