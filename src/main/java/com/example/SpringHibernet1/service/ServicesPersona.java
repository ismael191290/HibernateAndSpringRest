/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringHibernet1.service;

import com.example.SpringHibernet1.dao.PersonaDao;
import com.example.SpringHibernet1.model.Persona;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Isma
 */
@Service("persona")
@Transactional
public class ServicesPersona implements ServicesPersonaI{

    @Autowired
    private PersonaDao _personaDao;
    
    @Override
    public void savePersona(Persona p) {
            _personaDao.savePersona(p);
        }

    @Override
    public List<Persona> findAll() {
       return _personaDao.findAll();
    }

    @Override
    public Persona findById(Long idPersona) {
       return _personaDao.findById(idPersona);
    }

    @Override
    public Persona findByName(String name) {
        return  _personaDao.findByName(name);
    }

    @Override
    public void updatePersona(Persona p) {
        _personaDao.updatePersona(p);
    }

    @Override
    public void deletePersona(Long idPersona) {
        _personaDao.deletePersona(idPersona);
    }
    
}
