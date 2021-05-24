package com.javatechie.jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.javatechie.jpa.entity.Country;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CensusRequest {
   
	private Country country;



	public Country getCountry() {
		//auto added
		return country;
	}
	
}
