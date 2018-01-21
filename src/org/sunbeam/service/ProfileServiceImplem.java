package org.sunbeam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sunbeam.dao.ProfileDao;
import org.sunbeam.pojo.Members;

@Service
@Transactional
public class ProfileServiceImplem implements ProfileService{
	
	@Autowired
	ProfileDao dao;

	@Override
	public String UpdateProfile(Members member, int uid) {
		this.dao.UpdateProfile(member, uid);
		return "ok";
	}
}
