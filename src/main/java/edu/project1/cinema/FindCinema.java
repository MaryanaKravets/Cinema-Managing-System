package edu.project1.cinema;

import java.util.stream.Collectors;
import java.util.Map;

public class FindCinema implements ListOfCinema {
    public static Map<String, Address> searchCinemaByRating(int rating) {
        return listOfCinema.stream()
                .filter(c -> (c.getRating() == rating))
                .collect(Collectors.toMap(Cinema::getName, Cinema::getAddress));
    }
}
