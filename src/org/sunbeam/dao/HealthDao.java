package org.sunbeam.dao;

import java.util.List;
import org.sunbeam.pojo.Health;

public interface HealthDao {
	List<Integer> GetDpid (Health health);
}
