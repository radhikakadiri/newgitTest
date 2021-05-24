package com.javatechie.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.jpa.repository.CountryRepository;
import com.javatechie.jpa.repository.StateRepository;

import com.javatechie.jpa.entity.Country;
import com.javatechie.jpa.dto.CensusRequest;
import com.javatechie.jpa.dto.CensusResponse;

@RestController
public class CensusController {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@PostMapping("/placeCensus")
	public Country placeCensus(@RequestBody CensusRequest request){
		return countryRepository.save(request.getCountry());
		
	}
	
	@GetMapping("/findAllCensus")
	public List<Country> findAllCensus(){
		return countryRepository.findAll();
	}
	
	 @GetMapping("/getInfo")
	    public List<CensusResponse> getJoinInformation(){
	        return countryRepository.getJoinInformation();
	    }

}
