/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringHibernet1.service;

import com.example.SpringHibernet1.model.Persona;
import java.util.List;

/**
 *
 * @author Isma
 */
public interface ServicesPersonaI {
    
    void savePersona(Persona p);
    
    List<Persona> findAll();
    
    Persona findById(Long idPersona);
    
    Persona findByName(String name);
    
    void updatePersona(Persona p);

    void deletePersona(Long idPersona); 
    
}
