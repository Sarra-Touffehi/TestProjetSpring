package com.dsi.application.services;

import java.util.List;

import com.dsi.application.entities.Stagiaire;

public interface StagiaireService {
	public boolean saveStagiaire(Stagiaire s);
	public Stagiaire updateStagiaire(Stagiaire s, long id );
	public boolean deleteStagiaire(long id );
	public Stagiaire findStagiaire(long id);
	public List<Stagiaire> getAllStagiaire();
	

}
