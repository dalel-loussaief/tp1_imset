package com.imset.tp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imset.tp.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> { 
	 
} 