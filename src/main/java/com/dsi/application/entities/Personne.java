package com.dsi.application.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@MappedSuperclass
public abstract class Personne {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Column(length=50)
private String nom;
@Column(length=50)
private String prenom;
@Column(length=50)
private String email;
@Column(length=50)
private String adresse;
@Temporal(TemporalType.DATE)
private LocalDate Datenaissance;
@Column(length=8)
private String telephone;
private String role;
public Personne() {
	super();

}
public Personne(String nom, String prenom, String email, String adresse, LocalDate datenaissance, String telephone,String role) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.adresse = adresse;
	Datenaissance = datenaissance;
	this.telephone = telephone;
	this.role=role;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public LocalDate getDatenaissance() {
	return Datenaissance;
}
public void setDatenaissance(LocalDate datenaissance) {
	Datenaissance = datenaissance;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}

}
