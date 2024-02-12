package com.dsi.application.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Stagiaire")
public class Stagiaire extends Personne {

	

	@Column(length=50)
	private String niveau_etude;

	
	public Stagiaire(String nom, String prenom, String email, String adresse, LocalDate datenaissance, String telephone,String role,String niveau_etude) {
		super(nom,  prenom,  email,  adresse,  datenaissance,  telephone,role);
		this.niveau_etude=niveau_etude;
	}
	public Stagiaire() {}
	public String getNiveau_etude() {
		return niveau_etude;
	}

	public void setNiveau_etude(String niveau_etude) {
		this.niveau_etude = niveau_etude;
	}
	
	
	@Override
	public String toString() {
		return "Stagiaire [nom= "+ getNom() + "prenom= " +getPrenom()+ "email=" +getEmail() + "adresse=" +getAdresse() + "datenaissance="+ getDatenaissance()+"telephone="+getTelephone()+ "role="+getRole()+ "niveau_etude"+ getNiveau_etude()+"]";
	}
	
	
	 @OneToOne
	    @JoinColumn(name = "idStage")
	    private Stage stage;

}
