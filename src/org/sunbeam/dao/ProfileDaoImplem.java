package org.sunbeam.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sunbeam.pojo.Members;

@Repository
public class ProfileDaoImplem implements ProfileDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Members UpdateProfile(Members member, int uid) {
		String hql = "update Members m set m.name=:name, m.gender=:gender, m.height=:height, m.weight=:weight, m.phone=:phone, m.address=:address, m.age=:age, m.emai=:email where m.uid=:uid";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("name", member.getName());
		query.setParameter("gender", member.getGender());
		query.setParameter("height", member.getHeight());
		query.setParameter("weight", member.getWeight());
		query.setParameter("phone", member.getPhone());
		query.setParameter("address", member.getAddress());
		query.setParameter("age", member.getAge());
		query.setParameter("email", member.getEmail());
		query.setParameter("uid",uid);
		System.out.println(query);
		Members memb = (Members) query.getSingleResult();		
		return memb;
	}

	@Override
	public Members GetMember(Integer uid) {
		String hql = "select m from Members m where m.uid=:uid";
		Query<Members> query = this.sessionFactory.getCurrentSession().createQuery(hql, Members.class);
		query.setParameter("uid", uid );		
		Members m = query.getSingleResult();		
		return m;
	}
}
