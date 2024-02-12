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

import com.dsi.application.entities.Stagiaire;
import com.dsi.application.services.StagiaireService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StagiaireRestController {
	@Autowired
	StagiaireService stagiaireservice;
	
	@GetMapping("stagiaires")
	public List<Stagiaire> getAll(){
		return stagiaireservice.getAllStagiaire();
	}
	
	@PostMapping("/stagiaires")
	public boolean addStagiaire(@RequestBody Stagiaire s )
	{
		return stagiaireservice.saveStagiaire(s);
	}
	@GetMapping("/stagiaires/{id}")
	public Stagiaire getOne(@PathVariable("id")long id) {
		return stagiaireservice.findStagiaire(id);
	}
	@PutMapping("/stagiaires/{id}")
	public Stagiaire updateStagiaire(@RequestBody Stagiaire s,@PathVariable("id") long id ) {
		return stagiaireservice.updateStagiaire(s, id);	
	}
	@DeleteMapping("/stagiaires/{id}")
	public boolean deleteOne(@PathVariable("id") long id ) {
		return stagiaireservice.deleteStagiaire(id);}

}
 