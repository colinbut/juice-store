/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.juice;

import com.google.inject.AbstractModule;
import com.mycompany.juice.dao.JuiceDao;
import com.mycompany.juice.dao.JuiceDaoImpl;

public class JuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(JuiceDao.class).to(JuiceDaoImpl.class);
    }
}
