package com.arccorp.travelagency;

import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@ComponentScan({"com.botham.news.db.jobs"})
//@ComponentScan(basePackageClasses = {JobsController.class})
@RestController
@RequestMapping("/api")

public class TravelAgencyController {

	Logger log = LoggerFactory.getLogger(TravelAgencyController.class);
	
	@Autowired
	public TravelAgencyRepository travelAgencyRepository;
	
   @GetMapping("/hello") 
   public String hello() {
	   System.out.println("hello ran "+new Date());
	   
	   return "{\"message\": \"This is a https:// endpoint\"}";
   }
   
   
// Needs Pagination/Fields/Filters/Sort etc
// https://localhost:8445/api/jobs?fields=name,description&filter=name like 'fred'
// https://localhost:8445/api/jobs?fields=name,description&filter=name like 'fred'&page=1,2,20&sort=name,-description
   
   @GetMapping("/travelagency") 
   public List<TravelAgency> getAllTravelAgency(@RequestParam(value="fields", required=false) String fields,
		                        @RequestParam(value="filter", required=false) String filter,
		                        @RequestParam(value="sort", required=false) String sort,
		                        @RequestParam(value="page", required=false) String page) {	
	   String mName="getAllTravelAgency";
	   if (log.isDebugEnabled()) {
		   log.debug(mName+" Starts");
		   log.debug(mName+" fields="+fields+"*");
		   log.debug(mName+" filter="+filter+"*");
		   log.debug(mName+" sort="+sort+"*");
		   log.debug(mName+" page="+page+"*");
	   }
	   return travelAgencyRepository.findAll();
   }
   
   
   @PostConstruct
   public void afterPropsSet() {
	   System.out.println("travelAgencyRepository="+travelAgencyRepository);
	   /*
	   List<Jobs> jobs = jobsRepository.findAll();
	   for (Jobs j : jobs) {
		   System.out.println("j="+j.toString());
	   }
	   */
	   
   }
}
