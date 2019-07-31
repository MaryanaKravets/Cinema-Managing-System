package edu.project1.clients;

import edu.project1.cinema.Type_Of_Place;
import edu.project1.movies.CalculateTicketPrice;
import edu.project1.movies.Movie;

public interface DiscountInterface extends CalculateTicketPrice {
    default void discountSystem(Movie movie) {
        switch (movie.status_of_movie) {
            case AVAILABLE:
                for (Type_Of_Place tp : Type_Of_Place.values()) {
                    System.out.println("Discount price: for " + tp + " place " + getPrice(tp) * 0.85);
                }
                break;
            case PREMIERE:
                for (Type_Of_Place tp : Type_Of_Place.values()) {
                    System.out.println("Discount price: for " + tp + " place " + getPrice(tp) * 0.93);
                }
                break;
            default:
                System.out.println("Currently has no discount on this movie!");
        }
    }
}