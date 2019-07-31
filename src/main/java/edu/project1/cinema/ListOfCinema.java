package edu.project1.cinema;

import edu.project1.movies.ListOfMovie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface ListOfCinema extends ListOfMovie {
    List<Cinema> listOfCinema = new ArrayList<>(Arrays.asList(
            new Cinema("Multiplex",
                    new Address("Львів", "Кульпарківська", "226A"), listOfMovies.subList(0, 4)),
            new Cinema("Кінопалац",
                    new Address("Львів", "Театральна", "22"), listOfMovies.subList(2, 7)),
            new Cinema("Коперник",
                    new Address("Львів", "Коперника", "9"), listOfMovies.subList(3, 8)),
            new Cinema("Довженка",
                    new Address("Львів", "Червоної калини", "81"), listOfMovies.subList(5, 11)),
            new Cinema("Планета кіно",
                    new Address("Львів", "Стрийська", "30"), listOfMovies.subList(7, 13)),
            new Cinema("Lviv Film Center",
                    new Address("Львів", "Володимира Великого", "14А"), listOfMovies.subList(9, 14))
    ));
}
