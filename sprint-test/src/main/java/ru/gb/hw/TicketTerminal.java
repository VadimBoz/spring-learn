package ru.gb.hw;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope(ConfigurableListableBeanFactory.SCOPE_SINGLETON)
@Component
public class TicketTerminal {
    private TicketNumberGenerator generator;


    public TicketTerminal(TicketNumberGenerator generator) {
        this.generator = generator;
    }


    public Ticket newTicket() {
        return new Ticket(generator.createNewNumber());
    }
}
