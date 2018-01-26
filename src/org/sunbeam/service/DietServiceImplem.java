package org.sunbeam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sunbeam.dao.AdminDao;
import org.sunbeam.dao.DietDao;
import org.sunbeam.dao.HealthDao;
import org.sunbeam.pojo.Admin;
import org.sunbeam.pojo.DietPlan;
import org.sunbeam.pojo.Health;

@Service
@Transactional
public class DietServiceImplem implements DietService{
	
	@Autowired
	DietDao dao;

	@Override
	public DietPlan GetDpid(Integer id) {
		return dao.GetDiet(id);
	}

}
