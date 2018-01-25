package org.sunbeam.dao;

import org.sunbeam.pojo.Trainers;

public interface TrainerDao {
	Integer InsertTrainer ( Trainers trainer );

	Trainers UpdateProfile(Trainers trainer, int uid);
}
