package org.sunbeam.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sunbeam.pojo.Trainers;

@Repository
public class TrainerDaoImplem implements TrainerDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Integer InsertTrainer(Trainers trainer) {
		return (Integer) sessionFactory.getCurrentSession().save(trainer) ;
	}

}
