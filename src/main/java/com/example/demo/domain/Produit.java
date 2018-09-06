package com.example.demo.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PRODUITS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Produit {
	
	@Id
	private String code;
	
	private String titre;
	private BigDecimal prixUnitaire;
	

}
