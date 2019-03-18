package org.example.demo.ticket.webapp.listener;

import org.example.demo.ticket.business.manager.ManagerFactory;
import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // Création de l'instance de ManagerFactory
        ManagerFactory managerFactory = new ManagerFactory();

        // Injection des managers dans la factory
        managerFactory.setProjetManager(new ProjetManager());
        managerFactory.setTicketManager(new TicketManager());

        // Injection de la factory dans la classe AbstractResource
        AbstractResource.setManagerFactory(managerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
