/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringHibernet1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Isma
 */
public abstract class AbstracSession {

    private SessionFactory sessionFactory;

    protected Session  getSession() {
        return sessionFactory.getCurrentSession();
    }
}
