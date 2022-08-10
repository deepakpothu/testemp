package com.example.employee.service;

import java.util.List;

import javax.security.auth.login.FailedLoginException;

import com.example.employee.entity.Login;

public interface LoginService {

	public String add(Login login);
	public Login authenticate(Login login);
	public Login check(Login login);
	public List<Login> getAll();
}
