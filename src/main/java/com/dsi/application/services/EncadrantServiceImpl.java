package com.dsi.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.application.entities.Encadrant;
import com.dsi.application.repositories.EncadrantRepository;
@Service
public class EncadrantServiceImpl implements EncadrantService {
@Autowired
EncadrantRepository encadrantrepository;
	@Override
	public boolean saveEncadrant(Encadrant e) {
		if (encadrantrepository.save(e)!=null)
			return true;
		else
		return false;
	}

	
	@Override
	public Encadrant updateEncadrant(Encadrant e, long id) {
		e.setId(id);
		encadrantrepository.save(e);
		return encadrantrepository.findById(id).get();
	}


	@Override
	public boolean deleteEncadrant(long id) {
		encadrantrepository.deleteById(id);
		return !encadrantrepository.existsById(id);
	}

	
	@Override
	public Encadrant findEncadrant(long id) {
		Optional<Encadrant> e=encadrantrepository.findById(id);
		if(e.isPresent())
			return e.get();
		else
		return null;
	}

	@Override
	public List<Encadrant> getAllEncadrant() {
		return encadrantrepository.findAll();
	}

}
