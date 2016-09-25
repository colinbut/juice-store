/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.juice.dao;

import com.mycompany.juice.model.Juice;

import java.util.List;

public interface JuiceDao {

    List<Juice> getJuices();

    Juice getJuice(String name);

    Juice getJuice(int id);

    void addJuice(Juice juice);

    void removeJuice(int id);

    void removeJuice(String name);
}
