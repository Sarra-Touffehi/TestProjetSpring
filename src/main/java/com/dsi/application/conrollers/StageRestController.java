package com.dsi.application.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.application.entities.Stage;

import com.dsi.application.services.StageService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StageRestController {
	@Autowired
	StageService stageservice;
	
	@GetMapping("stages")
	public List<Stage> getAll(){
		return stageservice.getAllStage();
	}
	
	@PostMapping("/stages")
	public boolean addStage(@RequestBody Stage stage )
	{
		return stageservice.saveStage(stage);
	}
	@GetMapping("/stages/{id}")
	public Stage getOne(@PathVariable("id")long id) {
		return stageservice.findStage(id);
	}
	@PutMapping("/stages/{id}")
	public Stage updateStage(@RequestBody Stage stage,@PathVariable("id") long id ) {
		return stageservice.updateStage(stage, id);
	}
	@DeleteMapping("/stages/{id}")
	public boolean deleteOne(@PathVariable("id") long id ) {
		return stageservice.deleteStage(id);}

}
