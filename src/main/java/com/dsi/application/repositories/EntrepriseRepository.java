package com.dsi.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsi.application.entities.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise,Long> {

}
