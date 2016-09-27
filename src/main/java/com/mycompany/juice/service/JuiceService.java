/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.juice.service;

import com.mycompany.juice.model.Juice;

import java.util.List;

public interface JuiceService {

    List<Juice> getJuiceList();

    Juice getJuiceByName(String name);

    Juice getJuiceById(int id);

    void addJuice(Juice juice);

    void deleteJuiceByName(String name);

    void deleteJuiceById(int id);
}
