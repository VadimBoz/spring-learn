package ru.gb.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Solution1 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Solution1.class, args);
        TicketNumberGenerator generator = context.getBean(TicketNumberGenerator.class);
        System.out.println(generator.createNewNumber());
        System.out.println(generator.createNewNumber());
        System.out.println(generator.createNewNumber());
        TicketNumberGenerator generator2 = context.getBean(TicketNumberGenerator.class);
        System.out.println(generator2.createNewNumber());

        TicketTerminal terminal = context.getBean(TicketTerminal.class);
        System.out.println(terminal.newTicket());
        System.out.println(terminal.newTicket());
    }


}
