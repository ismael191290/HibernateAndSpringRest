/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringHibernet1.dao;

import com.example.SpringHibernet1.model.Persona;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Isma
 */
@Repository
@Transactional
public  class PersonaDao extends AbstracSession implements PersonaDaoI {

    @Override
    public void savePersona(Persona p) {
        getSession().persist(p);
    }

    @Override
    public List<Persona> findAll() {
        return getSession().createQuery("from persona").list();
        
    }

    @Override
    public Persona findById(Long idPersona) {
        return getSession().get(Persona.class, idPersona);
    }

    @Override
    public Persona findByName(String name) {
        return (Persona)getSession().createQuery("from persona where name = :name").setParameter("name", name).uniqueResult();
    }

    @Override
    public void updatePersona(Persona p) {
        getSession().update(p);
    }

    @Override
    public void deletePersona(Long idPersona) {
        Persona p = findById(idPersona);
        if(p !=null){
            getSession().delete(p);
        }
    }

   
    
    
    
}
