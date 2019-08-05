package edu.project1.clients;

import edu.project1.cinema.TypeOfPlace;
import edu.project1.movies.CalculateTicketPrice;
import edu.project1.movies.Movie;

public interface DiscountInterface extends CalculateTicketPrice {
    default void discountSystem(Movie movie) {
        switch (movie.status_of_movie) {
            case AVAILABLE:
                for (TypeOfPlace tp : TypeOfPlace.values()) {
                    System.out.println("Discount price: for " + tp + " place " + getPrice(tp) * 0.85);
                }
                break;
            case PREMIERE:
                for (TypeOfPlace tp : TypeOfPlace.values()) {
                    System.out.println("Discount price: for " + tp + " place " + getPrice(tp) * 0.93);
                }
                break;
            default:
                System.out.println("Currently has no discount on this movie!");
        }
    }
}
