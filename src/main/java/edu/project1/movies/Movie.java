package edu.project1.movies;

import edu.project1.cinema.*;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString(includeFieldNames = false)
public class Movie implements CalculateTicketPrice {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Hall numberOfHall;
    @Getter
    @Setter
    private String category;
    public Type_Of_Movie type_of_movie;
    @Getter
    public Status_of_Movie status_of_movie;
    public Duration_Of_Movie duration_of_movie;
    @ToString.Exclude
    public Map<Integer, Type_Of_Place> mapOfBookingPlace = new HashMap<>();

    Movie(String name, Hall numberOfHall, String category, Type_Of_Movie type_of_movie, Status_of_Movie status_of_movie, Duration_Of_Movie duration_of_movie) {
        this.name = name;
        this.numberOfHall = numberOfHall;
        this.category = category;
        this.type_of_movie = type_of_movie;
        this.status_of_movie = status_of_movie;
        this.duration_of_movie = duration_of_movie;
    }
}

