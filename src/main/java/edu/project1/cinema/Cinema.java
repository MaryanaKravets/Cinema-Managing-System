package edu.project1.cinema;

import lombok.Getter;
import lombok.Setter;
import edu.project1.movies.Movie;
import lombok.ToString;

import java.util.*;


@ToString(includeFieldNames = false)
public class Cinema {
    @Getter
    @ToString.Exclude
    private List<Hall> hallList;
    @Getter
    @Setter
    private String name;
    @Getter
    private Address address;
    @ToString.Exclude
    float reviewPos = 1.0f;
    @ToString.Exclude
    float countReview = 1.0f;
    @Getter
    @Setter
    @ToString.Exclude
    volatile private int rating;
    @ToString.Exclude
    public List<Movie> listOfMovies;

    public int getRating(Cinema cinema) {
        this.rating = Math.round(((5 * cinema.reviewPos) / cinema.countReview));
        return rating;
    }

    Cinema(String name, Address address, List<Movie> listOfMovies) {
        this.hallList = new ArrayList<>(Arrays.asList(
                new Hall(1), new Hall(2), new Hall(3)));
        this.name = name;
        this.address = address;
        this.listOfMovies = listOfMovies;
    }
}




