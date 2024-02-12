package com.dsi.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.application.entities.Stagiaire;
import com.dsi.application.repositories.StagiaireRepository;

@Service
public class StagiaireServiceImpl implements StagiaireService{
	@Autowired
	StagiaireRepository stagiairerepository;

	@Override
	public boolean saveStagiaire(Stagiaire s) {
		if(stagiairerepository.save(s)!=null)
			return true;
		else
		return false;
	}

	@Override
	public Stagiaire updateStagiaire(Stagiaire s, long id) {
		s.setId(id);
		stagiairerepository.save(s);
		return stagiairerepository.findById(id).get();
		
	}

	@Override
	public boolean deleteStagiaire(long id) {
		stagiairerepository.deleteById(id);
		return !stagiairerepository.existsById(id);
	}

	@Override
	public Stagiaire findStagiaire(long id) {
	Optional<Stagiaire> s=stagiairerepository.findById(id);
	if(s.isPresent()) 
		return s.get();
		else 
			return null;
	
	}

	@Override
	public List<Stagiaire> getAllStagiaire() {
		return stagiairerepository.findAll();
	}

}
