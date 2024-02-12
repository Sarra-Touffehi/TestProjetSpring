package com.dsi.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dsi.application.entities.Stage;
import com.dsi.application.repositories.StageRepository;
@Service
public class StageServiceImpl implements StageService{
@Autowired 
StageRepository stagerepository;
	@Override
	public boolean saveStage(Stage stage) {
		if(stagerepository.save(stage)!=null)
			return true;
			else
			return false;
	}

	@Override
	public Stage updateStage(Stage stage, long id) {
		stage.setId_stage(id);
		stagerepository.save(stage);
		return stagerepository.findById(id).get();
	}

	
	@Override
	public boolean deleteStage(long id) {
		stagerepository.deleteById(id);
		return !stagerepository.existsById(id);
	}

	@Override
	public Stage findStage(long id) {
		Optional<Stage> stage=stagerepository.findById(id);
		if(stage.isPresent())
			return stage.get();
		else
		return null;
	}
	

	@Override
	public List<Stage> getAllStage() {
		
		return stagerepository.findAll();
	}

}
