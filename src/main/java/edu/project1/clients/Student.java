package edu.project1.clients;

import edu.project1.cinema.Type_Of_Place;
import edu.project1.movies.Movie;
import lombok.ToString;


@ToString(callSuper = true)
public class Student extends Client {
    String id;

    public Student(String name, String surName, int age, String email, long phone, String id) {
        super(name, surName, age, email, phone);
        this.id = id;
    }

    @Override
    public void discountSystem(Movie movie) {
        switch (movie.status_of_movie) {
            case PREMIERE:
                System.out.println("Discount for student " + getPrice(Type_Of_Place.NORMAL) * 0.83);
                break;
            case AVAILABLE:
                System.out.println("Discount for student " + getPrice(Type_Of_Place.NORMAL) * 0.75);
                break;
            default:
                System.out.println(" Not Discount for student " + getPrice(Type_Of_Place.NORMAL));
        }
    }
}