package com.connect.model.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.connect.model.Member;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void save(Member member) {
		this.sessionFactory.getCurrentSession().save(member);
	}

	public void update(Member member) {
		this.sessionFactory.getCurrentSession().update(member);
	}

	public void delete(Member member) {
		this.sessionFactory.getCurrentSession().delete(member);
	}

	public Member findByMemberName(String memberName) {
		String hql = "FROM tmember as p WHERE p.memberName = ?";  
	    Query q = this.sessionFactory.getCurrentSession().createQuery(hql);  
	    q.setString(0, memberName); 
	    @SuppressWarnings("unchecked")
		List<Member> list = q.list();
	    if(list.size()>0){
	    	return list.get(0);
	    }
		return null;
	}

}
