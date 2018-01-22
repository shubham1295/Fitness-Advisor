package org.sunbeam.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sunbeam.pojo.Admin;

@Repository
public class AdminDaoImplem implements AdminDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Integer InsertAdmin(Admin admin) {
		return (Integer) sessionFactory.getCurrentSession().save(admin) ;
	}

	@Override
	public Admin validate(String email, String password) {
		String hql = "select c from Admin c where c.email=:email and c.password=:password";
		Query<Admin> query = this.sessionFactory.getCurrentSession().createQuery(hql, Admin.class);
		query.setParameter("email", email);
		query.setParameter("password", password);		
		Admin admin= query.getSingleResult();		
		return admin;
	}


}
