package com.dairy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.repository.UserRepository;

@RestController
public class ApplicationController {
	
	@Autowired
	private UserRepository repository;

	@RequestMapping(value="/data",method = RequestMethod.GET)
	public Object getData() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", repository.findAll());
		return model;
	}
	
}
