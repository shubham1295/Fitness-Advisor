package org.sunbeam.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sunbeam.pojo.Admin;
import org.sunbeam.pojo.DietPlan;
import org.sunbeam.pojo.Health;

@Repository
public class DietDaoImplem implements DietDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public DietPlan GetDiet(Integer id) {
		String hql = "select h from DietPlan h where h.dpid=:dpid";
		Query<DietPlan> query = this.sessionFactory.getCurrentSession().createQuery(hql, DietPlan.class);
		query.setParameter("dpid", id);		
		DietPlan dietplan = query.getSingleResult();		
		return dietplan;
	}


}
