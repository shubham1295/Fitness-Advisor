package org.sunbeam.dao;

import org.sunbeam.pojo.Members;
import org.sunbeam.pojo.User;

public interface MemberDao {
	Integer InsertMember ( User user );
	
	User validate ( String email, String password );
	
}
