package com.example.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Login;
import com.example.employee.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginservice;

	@PostMapping("/add")
	public String add(@Valid @RequestBody Login login) throws Exception {
		if(loginservice.check(login)!=null) {
			throw new Exception("username already exist");
		}
		return loginservice.add(login);
	}
	
	
	
	@GetMapping("/")
	public List<Login> check() {
		/*Login lg=loginservice.authenticate(login);
		
		if(lg==null) {
			return false;
		}
		else {
			return true;
		}*/
		return loginservice.getAll();
	}
}
