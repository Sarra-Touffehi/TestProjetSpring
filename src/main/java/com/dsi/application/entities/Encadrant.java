package com.dsi.application.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Encadrant")
public class Encadrant extends Personne {

	private double salaire;
	@Column(length=50)
	private String poste;
	public Encadrant (String nom, String prenom, String email, String adresse, LocalDate datenaissance, String telephone,String role,String niveau_etude,double salaire,String poste) {
		super(nom,  prenom,  email,  adresse,  datenaissance,  telephone,role);
		this.poste=poste;
		this.salaire=salaire;
	}
	public Encadrant() {}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	@Override
	public String toString() {
		return "Stagiaire [nom= "+ getNom() + "prenom= " +getPrenom()+ "email=" +getEmail() + "adresse=" +getAdresse() + "datenaissance="+ getDatenaissance()+"telephone="+getTelephone()+ "role="+getRole()+ "salaire"+ getSalaire()+ "poste"+getPoste() +"]";
	}
	@OneToOne
    @JoinColumn(name = "idStage")
    private Stage stage;
}
