package edu.project1.server;

import edu.project1.booking.Booking;
import edu.project1.cinema.*;
import edu.project1.clients.Client;
import edu.project1.movies.FindMovie;
import edu.project1.movies.ListOfMovie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;


public class Server {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void menuStepOne() throws IOException, LogInException {
        int choice = 0;
        System.out.println("===========Hey! I know all about cinema in your city!==========");
        System.out.println("===================PLEASE CHOOSE AN ACTION=============");
        System.out.println("1) - Registration;\n" +
                "2) - List of cinema in your city;\n" +
                "3) - Personal cabinet;\n" +
                "4) - Exit.");
        do {
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (java.util.InputMismatchException | IllegalStateException exception) {
                System.out.println("You have entered incorrect data, please try again.");
                break;
            }
        } while ((choice <= 0) || (choice > 4));
        switch (choice) {
            case 1:
                LogIn.registrationUser();
                menuStepTwo(LogIn.listOfClient.get(LogIn.listOfClient.size() - 1));
                break;
            case 2:
                PrintListInterface printInterface = new PrintList();
                printInterface.printList(ListOfCinema.listOfCinema);
                menuStepOne();
                break;
            case 3:
                menuStepTwo(LogIn.logInSystem(LogIn.listOfClient));
                break;
            case 4:
                Thread.interrupted();
        }
    }

    private void menuStepTwo(Client client) throws IOException, LogInException {
        int choice = 0;
        System.out.println("===========It is cabinet of user: " + client.getName() + "=======");
        System.out.println("=============PLEASE CHOOSE AN ACTION===============");
        System.out.println("1) - List of cinema in your city;\n" +
                "2) - Choose cinema by rating;\n" +
                "3) - All information about the user;"
        );
        do {
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (java.util.InputMismatchException | IllegalStateException exception) {
                System.out.println("You have entered incorrect data, please try again.");
                break;
            }
        } while ((choice <= 0) || (choice > 3));
        switch (choice) {
            case 1:
                PrintListInterface printInterface = new PrintList();
                printInterface.printList(ListOfCinema.listOfCinema);
                menuStepThree(client);
                break;
            case 2:
                System.out.println(ListOfCinema.listOfCinema.stream()
                        .collect(Collectors.toMap(Cinema::getName, n -> n.getRating(n))));
                System.out.println("Enter cinema rating(from 0 to 5)");
                int rating = Integer.parseInt(reader.readLine());
                System.out.println(FindCinema.searchCinemaByRating(rating));
                menuStepOne();
                break;
            case 3:
                System.out.println(client.toString());
                menuStepTwo(client);
        }
    }

    private void menuStepThree(Client client) throws IOException, LogInException {
        int number = Integer.parseInt(reader.readLine());
        int choice = 0;
        System.out.println("===========It is cabinet of user: " + client.getName() + "==========");
        System.out.println("=============PLEASE CHOOSE AN ACTION================");
        System.out.println("1) - List of all movie in this cinema;\n" +
                "2) - Choose film by category;\n" +
                "3) - Leave review about cinema;\n" +
                "4) - Reviews about cinema; \n" +
                "5) - Exit."
        );
        do {
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (java.util.InputMismatchException | IllegalStateException exception) {
                System.out.println("You have entered incorrect data, please try again.");
                break;
            }

        } while ((choice <= 0) || (choice > 5));
        switch (choice) {
            case 1:
                menuStepFour(client, ListOfCinema.listOfCinema.get(number - 1));
                break;
            case 2:
                System.out.println("Enter film category(сімейний, триллер, пригоди, " +
                        "комідія, бойовик, мелодрама, драма, мультфільм)");
                String category = reader.readLine();
                System.out.println(FindMovie.findMovieByCategory(category));
                break;
            case 3:
                Review.leaveReviewAboutCinema(ListOfCinema.listOfCinema.get(number - 1));
                menuStepTwo(client);
                break;
            case 4:
                System.out.println(Review.listOfReviewAboutCinema);
                menuStepTwo(client);
                break;
            case 5:
                Thread.interrupted();
                //System.exit(0);
        }
        menuStepOne();
    }

    private void menuStepFour(Client client, Cinema cinema) throws IOException, LogInException {
        PrintListInterface printListInterface = new PrintList();
        printListInterface.printList(cinema.listOfMovies);
        System.out.println("Choose a movie");
        int numberOfMovie = Integer.parseInt(reader.readLine());
        int choice = 0;
        System.out.println("===========It is cabinet of user!======");
        System.out.println("==============PLEASE CHOOSE AN ACTION=============");
        System.out.println("1) - Book a place;\n" +
                "2) - Discount system;\n" +
                "3) - Paid for ticket\n" +
                "4) - All information about the user;\n" +
                "5) - Exit."
        );
        do {
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (java.util.InputMismatchException | IllegalStateException exception) {
                System.out.println("You have entered incorrect data, please try again.");
                break;
            }
        } while ((choice <= 0) || (choice > 5));
        switch (choice) {
            case 1:
                cinema.getHallList().get(cinema.listOfMovies.get(numberOfMovie - 1).getNumberOfHall().getNumber())
                        .printAllAvailablePlaces(cinema.listOfMovies.get(numberOfMovie - 1));
                Booking booking = new Booking();
                booking.bookingMovieAndPlace(client, cinema, ListOfMovie.listOfMovies.get(numberOfMovie - 1));
                System.out.println("Booking check....");
                booking.unBooking(client, ListOfMovie.listOfMovies.get(numberOfMovie - 1));
                break;
            case 2:
                client.discountSystem(cinema.listOfMovies.get(numberOfMovie));
                break;
            case 3:
                Client.changeUnPaidStatus(client);
                break;
            case 4:
                System.out.println(client.toString());
                menuStepFour(client, cinema);
                break;
            case 5:
                Thread.interrupted();
        }
        menuStepTwo(client);
    }
}
