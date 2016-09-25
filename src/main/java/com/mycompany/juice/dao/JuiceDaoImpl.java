/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.juice.dao;

import com.mycompany.juice.model.Juice;

import java.util.ArrayList;
import java.util.List;

public class JuiceDaoImpl implements JuiceDao {

    private List<Juice> juices = new ArrayList<>();

    public JuiceDaoImpl() {
        Juice juice = new Juice();
        juice.setId(1);
        juice.setName("Orange Juice");
        juice.setPrice(2.50);

        juices.add(juice);
    }

    @Override
    public List<Juice> getJuices() {
        return juices;
    }

    @Override
    public Juice getJuice(String name) {
        for (Juice juice : juices) {
            if (juice.getName().equals(name)) {
                return juice;
            }
        }
        return null;
    }

    @Override
    public Juice getJuice(int id) {
        for (Juice juice : juices) {
            if (juice.getId() == id) {
                return juice;
            }
        }
        return null;
    }

    @Override
    public void addJuice(Juice juice) {
        juices.add(juice);
    }

    @Override
    public void removeJuice(int id) {
        Juice juice = getJuice(id);
        juices.remove(juice);
    }

    @Override
    public void removeJuice(String name) {
        Juice juice = getJuice(name);
        juices.remove(juice);
    }
}
