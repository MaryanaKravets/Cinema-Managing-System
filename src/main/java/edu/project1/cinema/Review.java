package edu.project1.cinema;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Review {
    public static List<String> listOfReviewAboutCinema = new ArrayList<>();


    public static void leaveReviewAboutCinema(Cinema cinema) throws IOException {
        System.out.println("You want leave positive comment(enter 1) or negative(enter 2)?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(bufferedReader.readLine());
            cinema.countReview++;
            if (a == 1) {
                cinema.reviewPos++;
            }
            System.out.println("Please enter your comment(max 100 symbols)!");
            String s = bufferedReader.readLine();
            listOfReviewAboutCinema.add(s);
            System.out.println("Your comment has been successfully added!");
        } catch (InputMismatchException ex) {
            System.err.println("You entered incorrect data!");
        }
    }
}
