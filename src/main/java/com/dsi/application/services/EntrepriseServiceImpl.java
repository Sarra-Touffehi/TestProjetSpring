package com.dsi.application.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dsi.application.entities.Entreprise;
import com.dsi.application.repositories.EntrepriseRepository;

@Service
public class EntrepriseServiceImpl implements EntrepriseService{
@Autowired
EntrepriseRepository  entrepriserepository;

@Override
	public boolean saveEntreprise(Entreprise ent) {
	if(entrepriserepository.save(ent)!=null)
		return true;
	else
		return false;
	}

	@Override
	public Entreprise updateEntreprise(Entreprise ent, long id) {
		ent.setId_entreprise(id);
		entrepriserepository.save(ent);
		
		return entrepriserepository.findById(id).get();
	}

	@Override
	public boolean deleteEntreprise(long id) {
		entrepriserepository.deleteById(id);
		return  !entrepriserepository.existsById(id);
	}

	@Override
	public Entreprise findEntreprise(long id) {
		Optional<Entreprise> ent=entrepriserepository.findById(id);
		if(ent.isPresent())
			return ent.get();
		else
		return null;
	}

	@Override
	public List<Entreprise> getAllEntreprise() {
		
		return entrepriserepository.findAll();
	}
	

}
