package org.sunbeam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sunbeam.dao.MemberDao;
import org.sunbeam.pojo.User;

@Service
@Transactional
public class MemberServiceImplem implements MemberService{
	
	@Autowired
	MemberDao dao;

	@Override
	public String InsertMember(User user) {
		this.dao.InsertMember(user);
		return "ok";
	}

	@Override
	public User validate(String email, String password) {
		return dao.validate(email, password);
	}
}
