package com.dsi.application.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Entreprise")
public class Entreprise {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_entreprise;
@Column(length=50)
private String nom;
@Column(length=50)
private String adresse;
@Column(length=50)
private String email;
@Column(length=8)
private String telephone;
private int nombre_employes;
@Temporal(TemporalType.DATE)
private LocalDate date_creation;

public Entreprise() {
	super();
	
}
public Entreprise(String nom, String adresse, String email, String telephone, int nombre_employes,
		LocalDate date_craetion) {
	super();
	this.nom = nom;
	this.adresse = adresse;
	this.email = email;
	this.telephone = telephone;
	this.nombre_employes = nombre_employes;
	this.date_creation = date_craetion;
}
@Override
public String toString() {
	return "Entreprise [id_entreprise=" + id_entreprise + ", nom=" + nom + ", adresse=" + adresse + ", email=" + email
			+ ", telephone=" + telephone + ", nombre_employes=" + nombre_employes + ", date_creation=" + date_creation
			+ "]";
}
public long getId_entreprise() {
	return id_entreprise;
}
public void setId_entreprise(long id_entreprise) {
	this.id_entreprise = id_entreprise;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public int getNombre_employes() {
	return nombre_employes;
}
public void setNombre_employes(int nombre_employes) {
	this.nombre_employes = nombre_employes;
}
public LocalDate getDate_creation() {
	return date_creation;
}
public void setDate_creation(LocalDate date_creation) {
	this.date_creation = date_creation;
}
@OneToMany(mappedBy = "entreprise")
private List<Stage> stages;

public List<Stage> getStages() {
    return stages;
}

public void setStages(List<Stage> stages) {
    this.stages = stages;
}

}
