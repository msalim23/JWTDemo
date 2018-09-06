package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import com.example.demo.dataaccess.IProduitsRepository;
import com.example.demo.domain.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produits")
@CrossOrigin(origins="*") // CROSS pour tout le monde !
public class ProduitsRestController {
	
	@Autowired
	private IProduitsRepository repo;
	
	@GetMapping(value= {"", "/"})
	public List<Produit> getAll() {
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Produit> getProduitById(@PathVariable String id) {
		
		Optional<Produit> result = repo.findById(id);
		 
		 return (result.isPresent())? 
				   new ResponseEntity<>(result.get(), HttpStatus.OK)
				   :
				   new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	public void addProduit( @RequestBody Produit p) {
		 repo.save(p);
	}

}
