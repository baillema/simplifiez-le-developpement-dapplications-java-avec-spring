package org.example.demo.ticket.business.manager;

public class ManagerFactory {

    private ProjetManager projetManager;
    private TicketManager ticketManager;

    public ProjetManager getProjetManager() {
        return this.projetManager;
    }

    public void setProjetManager(ProjetManager projetManager) {
        this.projetManager = projetManager;
    }

    public TicketManager getTicketManager() {
        return this.ticketManager;
    }

    public void setTicketManager(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }
}
