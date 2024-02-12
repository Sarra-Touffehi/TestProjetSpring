package com.dsi.application.services;

import java.util.List;

import com.dsi.application.entities.Encadrant;

public interface EncadrantService {
	public boolean saveEncadrant(Encadrant e);
	public Encadrant updateEncadrant(Encadrant e, long id );
	public boolean deleteEncadrant(long id );
	public Encadrant findEncadrant(long id);
	public List<Encadrant> getAllEncadrant();
	
}
