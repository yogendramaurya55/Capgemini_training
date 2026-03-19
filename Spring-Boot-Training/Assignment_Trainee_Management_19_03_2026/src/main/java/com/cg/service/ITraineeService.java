package com.cg.service;

import java.util.List;

import com.cg.dto.TraineeDTO;

public interface ITraineeService {
	
	public List<TraineeDTO> getAllTrainee();
	public List<TraineeDTO> getTarineeByName(String name);
	public TraineeDTO getById(int id);
	public TraineeDTO updateTrainee(int id ,TraineeDTO trainee);
	public TraineeDTO insertTrainee(TraineeDTO trainee);
	public TraineeDTO deleteTrainee(int id);
}
