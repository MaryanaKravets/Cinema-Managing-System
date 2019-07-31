package edu.project1.movies;

import edu.project1.cinema.Hall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface ListOfMovie {
    List<Movie> listOfMovies = new ArrayList<>(Arrays.asList(
            new Movie("Король Лев", new Hall(1), "сімейний", Type_Of_Movie.ORIGINAL, Status_of_Movie.PREMIERE, Duration_Of_Movie.SESSION1),
            new Movie("Анна", new Hall(1), "триллер", Type_Of_Movie.TRANSLATED, Status_of_Movie.PREPREMIERE, Duration_Of_Movie.SESSION1),
            new Movie("Людина-павук", new Hall(3), "пригоди", Type_Of_Movie.ORIGINAL, Status_of_Movie.AVAILABLE, Duration_Of_Movie.SESSION2),
            new Movie("Водій для копа", new Hall(2), "комедія", Type_Of_Movie.TRANSLATED, Status_of_Movie.AVAILABLE, Duration_Of_Movie.SESSION2),
            new Movie("Хижаки", new Hall(1), "бойовик", Type_Of_Movie.TRANSLATED, Status_of_Movie.PREPREMIERE, Duration_Of_Movie.SESSION1),
            new Movie("Крок уперед", new Hall(2), "мелодрама", Type_Of_Movie.TRANSLATED, Status_of_Movie.PREMIERE, Duration_Of_Movie.SESSION2),
            new Movie("Натурал під прикриттяям", new Hall(2), "комедія", Type_Of_Movie.TRANSLATED, Status_of_Movie.AVAILABLE, Duration_Of_Movie.SESSION1),
            new Movie("Алладін", new Hall(3), "сімейний", Type_Of_Movie.TRANSLATED, Status_of_Movie.AVAILABLE, Duration_Of_Movie.SESSION2),
            new Movie("Гуцулка Ксеня", new Hall(1), "комедія", Type_Of_Movie.TRANSLATED, Status_of_Movie.PREMIERE, Duration_Of_Movie.SESSION1),
            new Movie("Французький жиголо", new Hall(2), "комедія", Type_Of_Movie.TRANSLATED, Status_of_Movie.PREMIERE, Duration_Of_Movie.SESSION2),
            new Movie("Біль та слава", new Hall(3), "драма", Type_Of_Movie.TRANSLATED, Status_of_Movie.PREPREMIERE, Duration_Of_Movie.SESSION1),
            new Movie("Секрети домашніх тварин", new Hall(3), "мультфільм", Type_Of_Movie.ORIGINAL, Status_of_Movie.AVAILABLE, Duration_Of_Movie.SESSION2),
            new Movie("Мистецтво обману", new Hall(2), "драма", Type_Of_Movie.TRANSLATED, Status_of_Movie.PREPREMIERE, Duration_Of_Movie.SESSION1),
            new Movie("Ібіца", new Hall(3), "комедія", Type_Of_Movie.TRANSLATED, Status_of_Movie.PREPREMIERE, Duration_Of_Movie.SESSION2),
            new Movie("Подорож хорошого пса", new Hall(1), "сімейний", Type_Of_Movie.ORIGINAL, Status_of_Movie.PREPREMIERE, Duration_Of_Movie.SESSION2)

    ));
}
