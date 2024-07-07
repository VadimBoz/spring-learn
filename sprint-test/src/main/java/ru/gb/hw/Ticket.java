package ru.gb.hw;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketNumber;
    private LocalDateTime createdAt;

    public Ticket(String ticketNumber) {
        createdAt = LocalDateTime.now();
        this.ticketNumber = ticketNumber;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
