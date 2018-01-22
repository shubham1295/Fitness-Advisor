package org.sunbeam.service;

import org.sunbeam.pojo.Admin;

public interface AdminService {
	String InsertAdmin( Admin admin );
	
	Admin validate ( String email, String password );
}

