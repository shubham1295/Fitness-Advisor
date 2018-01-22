package org.sunbeam.dao;

import org.sunbeam.pojo.Admin;

public interface AdminDao {
	Integer InsertAdmin ( Admin user );
	
	Admin validate ( String email, String password );
}
