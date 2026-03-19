package com.cg.dto;

import com.cg.entity.Trainee;

public class Mapper {
	
	public static TraineeDTO convertEntityToDto(Trainee t) {
		
		
		return new TraineeDTO(t.getTaineeName() , t.getTraineeDomain() , t.getTarineeLocation());
	}
	
	public static Trainee convertDtoToEntity(TraineeDTO tdto) {
		return new Trainee(tdto.getName() , tdto.getDomain() , tdto.getLoc());
	}
}
