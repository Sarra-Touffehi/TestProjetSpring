package com.dsi.application.services;

import java.util.List;

import com.dsi.application.entities.Entreprise;

public interface EntrepriseService {
	public boolean saveEntreprise(Entreprise ent);
	public Entreprise updateEntreprise(Entreprise ent, long id );
	public boolean deleteEntreprise(long id );
	public Entreprise findEntreprise(long id);
	public List<Entreprise> getAllEntreprise();
	

}
