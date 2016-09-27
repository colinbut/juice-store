/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.juice.service;

import com.google.inject.Inject;
import com.mycompany.juice.dao.JuiceDao;
import com.mycompany.juice.model.Juice;

import java.util.List;

public class JuiceServiceImpl implements JuiceService {

    private JuiceDao juiceDao;

    @Inject
    public JuiceServiceImpl(JuiceDao juiceDao) {
        this.juiceDao = juiceDao;
    }

    @Override
    public List<Juice> getJuiceList() {
        return juiceDao.getJuices();
    }

    @Override
    public Juice getJuiceByName(String name) {
        return juiceDao.getJuice(name);
    }

    @Override
    public Juice getJuiceById(int id) {
        return juiceDao.getJuice(id);
    }

    @Override
    public void addJuice(Juice juice) {
        juiceDao.addJuice(juice);
    }

    @Override
    public void deleteJuiceByName(String name) {
        juiceDao.removeJuice(name);
    }

    @Override
    public void deleteJuiceById(int id) {
        juiceDao.removeJuice(id);
    }
}
