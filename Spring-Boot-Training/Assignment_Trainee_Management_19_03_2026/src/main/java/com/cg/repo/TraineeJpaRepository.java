package com.cg.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;


@Repository
public interface TraineeJpaRepository extends JpaRepository<Trainee, Integer>{
	
	public List<Trainee> findByTaineeName(String name);
}
