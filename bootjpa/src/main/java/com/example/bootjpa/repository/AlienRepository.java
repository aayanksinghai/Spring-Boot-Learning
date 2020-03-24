package com.example.bootjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.bootjpa.model.Alien;

public interface AlienRepository extends CrudRepository<Alien, Integer> 
{
	List<Alien> findByTech(String tech);
	List<Alien> findByAidGreaterThan(int aid);
	List<Alien> findByAidLessThan(int aid);
	
	//Custom Query
	
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech);

	
}
