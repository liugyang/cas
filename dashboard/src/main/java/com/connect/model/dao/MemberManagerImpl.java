package com.connect.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connect.model.Member;

@Service
public class MemberManagerImpl implements MemberManager {

	@Autowired
	private MemberDao memberDao;
	
	public void save(Member member) {
		memberDao.save(member);
	}

	public void update(Member member) {
		memberDao.update(member);
	}

	public void delete(Member member) {
		memberDao.delete(member);
	}

	public Member findByMemberName(String memberName) {
		return memberDao.findByMemberName(memberName);
	}

}
