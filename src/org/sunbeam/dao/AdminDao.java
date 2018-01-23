package org.sunbeam.dao;

import org.sunbeam.pojo.Admin;

public interface AdminDao {
	Integer InsertAdmin ( Admin admin );
	
	Admin validate ( String email, String password );
}
