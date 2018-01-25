package org.sunbeam.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
	
	@Override
	public Trainers UpdateProfile(Trainers trainer, int uid) {
		String hql = "update Trainers t set t.name=:name, t.gender=:gender, t.phone=:phone, t.email=:email where t.uid=:uid";
		Query<?> query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("name", trainer.getName());
		query.setParameter("gender", trainer.getGender());
		query.setParameter("phone", trainer.getPhone());
		query.setParameter("email", trainer.getEmail());
		query.setParameter("uid",uid);
		System.out.println(query);
		Trainers memb = (Trainers) query.getSingleResult();		
		return memb;
	}


}
