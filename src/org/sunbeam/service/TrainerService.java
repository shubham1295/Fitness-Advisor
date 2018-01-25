package org.sunbeam.service;

import org.sunbeam.pojo.Trainers;

public interface TrainerService {
	String InsertTrainer( Trainers trainer );

	String UpdateProfile(Trainers trainer, int uid);
}

