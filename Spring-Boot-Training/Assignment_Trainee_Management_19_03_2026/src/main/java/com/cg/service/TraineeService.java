package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.dto.Mapper;
import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;
import com.cg.repo.TraineeJpaRepository;

@Service
public class TraineeService implements ITraineeService {
	
	private TraineeJpaRepository repo;
	
	public TraineeService(TraineeJpaRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<TraineeDTO> getAllTrainee() {
		List<TraineeDTO> ts = new ArrayList();
		repo.findAll().forEach( t -> {
			ts.add(Mapper.convertEntityToDto(t));
		});
		
		return ts;
	}

	@Override
	public List<TraineeDTO> getTarineeByName(String name) {
		List<TraineeDTO> ts = new ArrayList();
		repo.findByTaineeName(name).forEach( t -> {
			ts.add(Mapper.convertEntityToDto(t));
		});
		
		return ts;
	}

	@Override
	public TraineeDTO getById(int id) {
		Optional<Trainee> t = repo.findById(id);
		if(t.get() != null) {
			return Mapper.convertEntityToDto(t.get());
		}
		return null;
	}

	@Override
	public TraineeDTO updateTrainee( int id , TraineeDTO trainee) {
		Trainee t = repo.findById(id).orElse(null);
		
		if(trainee.getName() != null) {
			t.setTaineeName(trainee.getName());
		}
		if(trainee.getLoc() != null) {
			t.setTarineeLocation(trainee.getLoc());
		}
		if(trainee.getDomain() != null) {
			t.setTraineeDomain(trainee.getDomain());
		}
		
	    Trainee res = repo.saveAndFlush(t);
	    TraineeDTO dto = Mapper.convertEntityToDto(res);
	    dto.setId(t.getTarineeId());
		
		return dto;
		
	}

	@Override
	public TraineeDTO insertTrainee(TraineeDTO trainee) {
		Trainee t = Mapper.convertDtoToEntity(trainee);
		
		Trainee res = repo.save(t);
		
		return Mapper.convertEntityToDto(res);
	}

	@Override
	public TraineeDTO deleteTrainee(int id) {
		Optional<Trainee> ot = repo.findById(id);
		
		if(ot.get() != null) {
			TraineeDTO res = Mapper.convertEntityToDto(ot.get());
			repo.deleteById(id);
			
			return res;
		}
		
		return null;
	}
	
}
