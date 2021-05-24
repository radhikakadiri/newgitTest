package com.javatechie.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javatechie.jpa.dto.CensusResponse;
import com.javatechie.jpa.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
	
	@Query("SELECT new com.javatechie.jpa.dto.CensusResponse(c.name , s.sname) FROM  Country c JOIN c.states s")
	//@Query("select sum(s.population),c.name  from Country c,state s where c.id = s.cs_fk group by name")
    public List<CensusResponse> getJoinInformation();

}
