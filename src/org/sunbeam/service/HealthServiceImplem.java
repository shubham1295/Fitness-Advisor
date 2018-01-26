package org.sunbeam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sunbeam.dao.AdminDao;
import org.sunbeam.dao.HealthDao;
import org.sunbeam.pojo.Admin;
import org.sunbeam.pojo.Health;

@Service
@Transactional
public class HealthServiceImplem implements HealthService{
	
	@Autowired
	HealthDao dao;

	@Override
	public List<Integer> GetDpid(Health health) {
		return dao.GetDpid(health);
	}

}
