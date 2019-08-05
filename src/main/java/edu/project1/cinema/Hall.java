package edu.project1.cinema;

import edu.project1.movies.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString(includeFieldNames = false)
public class Hall {
    @Getter
    public int number;

    public void printAllAvailablePlaces(Movie movie) {
        System.out.println("All available places:");
        for (TypeOfPlace tp : TypeOfPlace.values()) {
            for (int i = 1; i <= tp.getCountOfPlace(); i++) {
                if (
                        movie.mapOfBookingPlace.containsKey(i) & movie.mapOfBookingPlace.get(i) == tp) continue;
                System.out.println("[" + tp + i + "]");
            }
        }
    }
}

        

