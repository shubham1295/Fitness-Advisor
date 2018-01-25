package org.sunbeam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sunbeam.dao.TrainerDao;
import org.sunbeam.pojo.Members;
import org.sunbeam.pojo.Trainers;

@Service
@Transactional
public class TrainerServiceImplem implements TrainerService{
	
	@Autowired
	TrainerDao dao;

	@Override
	public String InsertTrainer(Trainers trainer) {
		this.dao.InsertTrainer(trainer);
		return "ok";
	}

	@Override
	
	public String UpdateProfile(Trainers trainer, int uid) {
		this.dao.UpdateProfile(trainer, uid);
		return "ok";
	}
}
