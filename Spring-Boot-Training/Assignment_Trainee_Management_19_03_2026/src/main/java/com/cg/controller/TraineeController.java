package com.cg.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.TraineeDTO;
import com.cg.service.TraineeService;

@RestController
@RequestMapping("trainee")
public class TraineeController {
	
	private TraineeService service;
	
	public TraineeController(TraineeService service) {
		this.service = service;
	}
	
	@PostMapping("/create")
	public TraineeDTO createTrainee(@RequestBody TraineeDTO dto) {
		return service.insertTrainee(dto);
	}
	
	@GetMapping("/get-all")
	public List<TraineeDTO> getAll(){
		return service.getAllTrainee();
	}
	
	@GetMapping("/get-by-name/{name}")
	public List<TraineeDTO> getByName(@PathVariable String name){
		return service.getTarineeByName(name);
	}
	
	@GetMapping("/get-by-id/{id}")
	public TraineeDTO getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public TraineeDTO deleteTraineeById(@PathVariable int id) {
		return service.deleteTrainee(id);
	}
	
	@PutMapping("/update/{id}")
	public TraineeDTO updatetrainee(@PathVariable int id , @RequestBody TraineeDTO dto) {
		return service.updateTrainee(id, dto);
	}
}
