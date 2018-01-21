package org.sunbeam.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sunbeam.pojo.User;

@Repository
public class MemberDaoImplem implements MemberDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Integer InsertMember(User user) {
		return (Integer) sessionFactory.getCurrentSession().save(user) ;
	}

	@Override
	public User validate(String email, String password) {
		String hql = "select c from User c where c.email=:email and c.password=:password";
		Query<User> query = this.sessionFactory.getCurrentSession().createQuery(hql, User.class);
		query.setParameter("email", email);
		query.setParameter("password", password);		
		User user= query.getSingleResult();		
		return user;
	}

}
