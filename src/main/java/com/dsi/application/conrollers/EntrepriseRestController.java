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

import com.dsi.application.entities.Entreprise;
import com.dsi.application.services.EntrepriseService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EntrepriseRestController {
@Autowired
EntrepriseService entrepriseservice;

@GetMapping("entreprises")
public List<Entreprise> getAll(){
	return entrepriseservice.getAllEntreprise();
}

@PostMapping("/entreprises")
public boolean addEntreprise(@RequestBody Entreprise ent)
{
	return entrepriseservice.saveEntreprise(ent);
}
@GetMapping("/entreprises/{id}")
public Entreprise getOne(@PathVariable("id")long id) {
	return entrepriseservice.findEntreprise(id);
}
@PutMapping("/entreprises/{id}")
public Entreprise updateEntreprise(@RequestBody Entreprise ent,@PathVariable("id") long id ) {
	return entrepriseservice.updateEntreprise(ent, id);
}
@DeleteMapping("/entreprises/{id}")
public boolean deleteOne(@PathVariable("id") long id ) {
	return entrepriseservice.deleteEntreprise(id);}

}
