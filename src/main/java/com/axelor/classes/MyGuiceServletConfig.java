package com.axelor.classes;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class MyGuiceServletConfig extends GuiceServletContextListener {

  @Override
  protected Injector getInjector() {
    return Guice.createInjector(new ServletModule()
    { @Override
    	    protected void configureServlets() {
        serve("/prashant").with(MyServlet.class);
        serve("/abc").with(MyServlet.class);
        serve("/kangen").with(MyServlet.class);
        bind(Service.class).to(ServiceImpl.class);
        install(new JpaPersistModule("jpa_unit"));  // like we saw earlier.

        filter("/*").through(PersistFilter.class);
    }
      });
  }
  
  }
  
  