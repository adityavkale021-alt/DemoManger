package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Manger1;
import com.example.demo.service.Manger1Service;

@RestController
public class Manger1Controller {

	@Autowired
	private Manger1Service ss;
	
	@GetMapping("/display")
	public List<Manger1>displayManger1(){
		return ss.display();
		
	}
	
	@PostMapping("/add")
	public void addManger1(Manger1 s) {
		ss.add(s);
	}
}
