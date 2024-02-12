package com.dsi.application.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Stage")
public class Stage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_stage;
	@Temporal(TemporalType.DATE)
	private LocalDate date_debut;
	@Temporal(TemporalType.DATE)
	private LocalDate date_fin;
	@Column(length=100)
	private String sujet;
	@Column(length=50)
	private String domaine;
	private double remuneration;
	@Column(length=50)
	private String duree;
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	
	@Override
	public String toString() {
		return "Stage [id_stage=" + id_stage + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", sujet="
				+ sujet + ", domaine=" + domaine + ", remuneration=" + remuneration + ", duree=" + duree + "]";
	}
	public Long getId_stage() {
		return id_stage;
	}
	public void setId_stage(Long id_stage) {
		this.id_stage = id_stage;
	}
	public LocalDate getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(LocalDate date_debut) {
		this.date_debut = date_debut;
	}
	public LocalDate getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(LocalDate date_fin) {
		this.date_fin = date_fin;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public double getRemuneration() {
		return remuneration;
	}
	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public Stage(LocalDate date_debut, LocalDate date_fin, String sujet, String domaine, double remuneration,
			String duree) {
		super();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.sujet = sujet;
		this.domaine = domaine;
		this.remuneration = remuneration;
		this.duree = duree;
	}
	public Stage() {
		super();
		
	}
	
	@OneToOne(mappedBy = "stage")
    private Stagiaire stagiaire;
	
	@OneToOne(mappedBy = "stage")
    private Encadrant encadrant;

	@ManyToOne
    @JoinColumn(name = "identreprise")
    private Entreprise entreprise;

}
