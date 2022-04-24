package com.cagnotte.controller;

import java.util.List;

import com.cagnotte.model.Membre;
import com.cagnotte.repository.MembreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class MembreController {
    @Autowired
    private MembreRepository membreRepository;

    //get all membres
    @GetMapping("/membres")
    public List<Membre> getAllMembres(){
        return membreRepository.findAll();
        
    }
    
}