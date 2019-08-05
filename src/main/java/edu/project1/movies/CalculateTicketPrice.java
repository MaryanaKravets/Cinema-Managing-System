package edu.project1.movies;

import edu.project1.cinema.TypeOfPlace;

public interface CalculateTicketPrice {
    default double getPrice(TypeOfPlace tp) {
        final int initialPriceOfTicket = 100;
        return initialPriceOfTicket * tp.getTicketCostFactor();
    }
}
