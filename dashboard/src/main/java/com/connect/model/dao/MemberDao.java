package com.connect.model.dao;

import com.connect.model.Member;

public interface MemberDao {
	
	void save(Member member);

	void update(Member member);

	void delete(Member member);

	Member findByMemberName(String memberName);

}
