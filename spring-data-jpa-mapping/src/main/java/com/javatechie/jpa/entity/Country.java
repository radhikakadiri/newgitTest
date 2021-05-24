package com.javatechie.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Country {
   	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String cur; 
	
	@OneToMany(targetEntity = State.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "cs_fk",referencedColumnName = "id")
	private List<State> states;
	
}
