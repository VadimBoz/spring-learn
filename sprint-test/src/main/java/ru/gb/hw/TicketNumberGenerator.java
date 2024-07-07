package ru.gb.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Scope(ConfigurableListableBeanFactory.SCOPE_SINGLETON)
@Component
public class TicketNumberGenerator {
    private static int countTicket;
    public TicketNumberGenerator(){}

    public String createNewNumber() {
        String res  = countTicket +  " Number ticker is " + UUID.randomUUID();
        countTicket++;
        return res;

    }
}
