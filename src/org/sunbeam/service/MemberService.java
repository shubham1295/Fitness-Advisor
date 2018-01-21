package org.sunbeam.service;

import org.sunbeam.pojo.User;

public interface MemberService {
	String InsertMember( User user );
	
	User validate ( String email, String password );
}

