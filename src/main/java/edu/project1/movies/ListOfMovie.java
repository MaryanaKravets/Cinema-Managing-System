package edu.project1.movies;

import edu.project1.cinema.Hall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface ListOfMovie {
    List<Movie> listOfMovies = new ArrayList<>(Arrays.asList(
            new Movie("Король Лев", new Hall(1), "сімейний", TypeOfMovie.ORIGINAL, StatusOfMovie.PREMIERE, DurationOfMovie.SESSION1),
            new Movie("Анна", new Hall(1), "триллер", TypeOfMovie.TRANSLATED, StatusOfMovie.PREPREMIERE, DurationOfMovie.SESSION1),
            new Movie("Людина-павук", new Hall(3), "пригоди", TypeOfMovie.ORIGINAL, StatusOfMovie.AVAILABLE, DurationOfMovie.SESSION2),
            new Movie("Водій для копа", new Hall(2), "комедія", TypeOfMovie.TRANSLATED, StatusOfMovie.AVAILABLE, DurationOfMovie.SESSION2),
            new Movie("Хижаки", new Hall(1), "бойовик", TypeOfMovie.TRANSLATED, StatusOfMovie.PREPREMIERE, DurationOfMovie.SESSION1),
            new Movie("Крок уперед", new Hall(2), "мелодрама", TypeOfMovie.TRANSLATED, StatusOfMovie.PREMIERE, DurationOfMovie.SESSION2),
            new Movie("Натурал під прикриттяям", new Hall(2), "комедія", TypeOfMovie.TRANSLATED, StatusOfMovie.AVAILABLE, DurationOfMovie.SESSION1),
            new Movie("Алладін", new Hall(3), "сімейний", TypeOfMovie.TRANSLATED, StatusOfMovie.AVAILABLE, DurationOfMovie.SESSION2),
            new Movie("Гуцулка Ксеня", new Hall(1), "комедія", TypeOfMovie.TRANSLATED, StatusOfMovie.PREMIERE, DurationOfMovie.SESSION1),
            new Movie("Французький жиголо", new Hall(2), "комедія", TypeOfMovie.TRANSLATED, StatusOfMovie.PREMIERE, DurationOfMovie.SESSION2),
            new Movie("Біль та слава", new Hall(3), "драма", TypeOfMovie.TRANSLATED, StatusOfMovie.PREPREMIERE, DurationOfMovie.SESSION1),
            new Movie("Секрети домашніх тварин", new Hall(3), "мультфільм", TypeOfMovie.ORIGINAL, StatusOfMovie.AVAILABLE, DurationOfMovie.SESSION2),
            new Movie("Мистецтво обману", new Hall(2), "драма", TypeOfMovie.TRANSLATED, StatusOfMovie.PREPREMIERE, DurationOfMovie.SESSION1),
            new Movie("Ібіца", new Hall(3), "комедія", TypeOfMovie.TRANSLATED, StatusOfMovie.PREPREMIERE, DurationOfMovie.SESSION2),
            new Movie("Подорож хорошого пса", new Hall(1), "сімейний", TypeOfMovie.ORIGINAL, StatusOfMovie.PREPREMIERE, DurationOfMovie.SESSION2)

    ));
}
