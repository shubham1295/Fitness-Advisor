package org.sunbeam.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sunbeam.pojo.Admin;
import org.sunbeam.pojo.Health;

@Repository
public class HealthDaoImplem implements HealthDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Integer> GetDpid(Health health) {
		String hql = "select h.dpid from Health h where h.bmi=:bmi and h.gender=:gender and h.age=:age";
		Query<Integer> query = this.sessionFactory.getCurrentSession().createQuery(hql, Integer.class);
		query.setParameter("bmi", health.getBmi());
		query.setParameter("gender", health.getGender());
		query.setParameter("age", health.getAge());		
		List<Integer> dietplan = query.getResultList();		
		return dietplan;
	}


}
