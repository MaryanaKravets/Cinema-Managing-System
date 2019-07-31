package edu.project1.movies;

import edu.project1.cinema.Type_Of_Place;

public interface CalculateTicketPrice {
    default double getPrice(Type_Of_Place tp) {
        final int initialPriceOfTicket = 100;
        return initialPriceOfTicket * tp.getTicketCostFactor();
    }
}
