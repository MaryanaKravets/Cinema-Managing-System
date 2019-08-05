package edu.project1.booking;

import edu.project1.cinema.Cinema;
import edu.project1.cinema.Place;
import edu.project1.cinema.TypeOfPlace;
import edu.project1.clients.Client;
import edu.project1.movies.Movie;
import lombok.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.*;


@NoArgsConstructor
@ToString(includeFieldNames = false)
public class Booking {
    @Getter
    public LocalDate booked_date;
    public Cinema cinemaName;
    public Place bookedPlace;
    List<Movie> bookedMovies = new ArrayList<>();
    int amount = 0;


    private Booking(LocalDate localDate, Client client, Cinema cinema, Movie movie, Place bookedPlace) {
        PaymentStatus payment_status = PaymentStatus.UNPAID;
        this.booked_date = localDate;
        this.cinemaName = cinema;
        this.bookedPlace = bookedPlace;
        client.countUnpaidStatus++;
        client.bookingList.add(this);
        bookedMovies.add(movie);
        amount += 1;
    }

    public void bookingMovieAndPlace(Client client, Cinema cinema, Movie movie) throws IOException {
        try {
            if (client.countUnpaidStatus > 1) {
                System.out.println("You must paid  your previous booking, before booking another place!");
            } else {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter a date in format yyyy-mm-dd");
                LocalDate date = LocalDate.parse(bufferedReader.readLine());
                System.out.println("Choose a number of place");
                int i = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Enter type of place (NORMAL, PREMIUM, VIP)");
                TypeOfPlace sc = TypeOfPlace.valueOf(bufferedReader.readLine());
                Place place = new Place(i, sc);
                if (movie.mapOfBookingPlace.containsKey(i) & movie.mapOfBookingPlace.containsValue(sc)) {
                    System.out.println("This place is already booked!");
                } else {
                    place.reserve();
                    movie.mapOfBookingPlace.put(i, sc);
                    new Booking(date, client, cinema, movie, place);
                    System.out.println("You have to pay the reservation by: " + date.plusDays(2));
                }
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("You entered incorrect data!");
        }
    }

    public void unBooking(Client client, Movie movie) {
        for (Booking booking : client.bookingList) {
            if (booking.getBooked_date().isAfter(LocalDate.now().minusDays(2))) {
                System.out.println("The booking is valid!");
            } else {
                System.out.println("Your reservation has been canceled!");
                booking.bookedPlace.unReserved();
                movie.mapOfBookingPlace.remove(booking.bookedPlace.getNumberOfPlace(), booking
                        .bookedPlace.getType_of_place());
            }
        }
    }
}

