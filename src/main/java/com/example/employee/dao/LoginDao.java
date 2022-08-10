package com.example.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.entity.Login;

public interface LoginDao extends JpaRepository<Login, Long>{

	Login findByUsernameAndPassword(String username,String password);

	Login findByUsername(String username);
}
