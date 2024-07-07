package ru.gb.hw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TicketConfiguration {

    @Bean
    public Ticket getTicket() {
        TicketNumberGenerator generator = new TicketNumberGenerator();
        return new Ticket(generator.createNewNumber());
    }
}
