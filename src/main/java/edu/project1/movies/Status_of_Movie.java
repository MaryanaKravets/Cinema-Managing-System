package edu.project1.movies;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Status_of_Movie {
    PREPREMIERE(1.2),
    PREMIERE(1),
    AVAILABLE(0.8);

    private double costFactor;
}
