package com.dsi.application.services;

import java.util.List;

import com.dsi.application.entities.Stage;


public interface StageService {
	public boolean saveStage(Stage stage);
	public Stage updateStage(Stage stage, long id );
	public boolean deleteStage(long id );
	public Stage findStage(long id);
	public List<Stage> getAllStage();
	
}
