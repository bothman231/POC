package com.arccorp.travelagency;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity 
@Table(name = "travelagency")
public class TravelAgency implements Serializable {

	private static final long serialVersionUID = 8781208166016497520L;
	
	
	
	public TravelAgency() {
// Constructor
		name="";
		
	}
	
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name", length = 50)
	private String name;

	@Column(name = "arcTicketingStatus", length = 1)
	private String arcTicketingStatus;
	
	@Column(name = "airlineTicketingStatus", length = 1)
	private String airlineTicketingStatus;
	
}
