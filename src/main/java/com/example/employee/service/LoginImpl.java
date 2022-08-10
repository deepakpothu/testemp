package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.LoginDao;
import com.example.employee.entity.Login;

@Service
public class LoginImpl implements LoginService{
	
	@Autowired
	LoginDao logd;

	@Override
	public Login authenticate(Login login) {
		// TODO Auto-generated method stub
		return logd.findByUsernameAndPassword(login.getUsername(), login.getPassword());
		
	}

	@Override
	public String add(Login login) {
		// TODO Auto-generated method stub
		logd.save(login);
		return "Admin added";
		
	}

	@Override
	public Login check(Login login) {
		// TODO Auto-generated method stub
		return logd.findByUsername(login.getUsername());
		
	}

	@Override
	public List<Login> getAll() {
		// TODO Auto-generated method stub
		return logd.findAll();
		
	}

}
