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

import com.dsi.application.entities.Encadrant;

import com.dsi.application.services.EncadrantService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EncadrantRestController {
	@Autowired
	EncadrantService encadrantservice;
	
	@GetMapping("encadrants")
	public List<Encadrant> getAll(){
		return encadrantservice.getAllEncadrant();
	}
	
	@GetMapping("/encadrants/{id}")
	public Encadrant getOne(@PathVariable("id")long id) {
		return encadrantservice.findEncadrant(id);
	}
	
	@PostMapping("/encadrants")
	public boolean addEncadrant(@RequestBody Encadrant e)
	{
		return encadrantservice.saveEncadrant(e);
	}
	
	@PutMapping("/encadrants/{id}")
	public Encadrant updateEncadrant(@RequestBody Encadrant e,@PathVariable("id") long id ) {
		return encadrantservice.updateEncadrant(e, id);}
		
	@DeleteMapping("/encadrants/{id}")
		public boolean deleteOne(@PathVariable("id") long id ) {
			return encadrantservice.deleteEncadrant(id);}
	}

