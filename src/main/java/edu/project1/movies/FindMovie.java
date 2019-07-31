package edu.project1.movies;


import java.util.Map;
import java.util.stream.Collectors;

public class FindMovie implements ListOfMovie {
    public static Map<String, String> findMovieByCategory(String category) {

        return listOfMovies.stream()
                .filter(m -> m.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toMap(Movie::getName, Movie::getCategory));
    }
}

