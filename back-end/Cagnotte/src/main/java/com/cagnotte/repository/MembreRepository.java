package com.cagnotte.repository;

import com.cagnotte.model.Membre;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreRepository extends JpaRepository<Membre, Long>{

}
