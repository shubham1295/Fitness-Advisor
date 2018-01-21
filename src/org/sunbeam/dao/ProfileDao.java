package org.sunbeam.dao;

import org.sunbeam.pojo.Members;

public interface ProfileDao {
	Members UpdateProfile ( Members member, int uid );
}
