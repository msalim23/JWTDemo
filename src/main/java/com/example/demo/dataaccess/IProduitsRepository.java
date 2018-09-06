package com.example.demo.dataaccess;

import com.example.demo.domain.Produit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProduitsRepository extends JpaRepository<Produit, String> {

}
