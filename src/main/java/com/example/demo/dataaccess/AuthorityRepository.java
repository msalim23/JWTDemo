package com.example.demo.dataaccess;

import com.example.demo.domain.security.Authority;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorityRepository extends JpaRepository<Authority,Long>{

}
