package org.sunbeam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sunbeam.dao.AdminDao;
import org.sunbeam.pojo.Admin;

@Service
@Transactional
public class AdminServiceImplem implements AdminService{
	
	@Autowired
	AdminDao dao;

	@Override
	public String InsertAdmin(Admin admin) {
		this.dao.InsertAdmin(admin);
		return "ok";
	}

	@Override
	public Admin validate(String email, String password) {
		return dao.validate(email, password);
	}

}
