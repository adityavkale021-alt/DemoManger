package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Manger1;
import com.example.demo.repository.Manger1Repository;


@Service
public class Manger1ServiceImpl implements Manger1Service {

	@Autowired
	private Manger1Repository sr;
	
	@Override
	public void add(Manger1 s) {
		// TODO Auto-generated method stub
         sr.save(s);
	}

	@Override
	public List<Manger1> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
