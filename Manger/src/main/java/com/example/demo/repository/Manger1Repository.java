package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Manger1;

@Repository

public interface Manger1Repository extends JpaRepository<Manger1, Integer> {
	 
	


}
