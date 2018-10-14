/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringHibernet1.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Isma
 */
@Entity
@Table(name="persona")
public class Persona implements Serializable{
    
    @Id
    private int idPersona;
    private String name;
    private String lname;

    public Persona() {
    }

    public Persona(int idPersona, String name, String lname) {
        this.idPersona = idPersona;
        this.name = name;
        this.lname = lname;
    }
    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
