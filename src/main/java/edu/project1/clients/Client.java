package edu.project1.clients;

import edu.project1.booking.Booking;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

@NoArgsConstructor
@ToString
public class Client implements DiscountInterface {
    @Getter
    protected String name;
    protected String surName;
    protected int age;
    @Getter
    protected String email;
    protected long phone;

    public int countUnpaidStatus = 0;
    public List<Booking> bookingList = new ArrayList<>();


    public Client(String name, String surName, int age, String email, long phone) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public static void changeUnPaidStatus(Client client) throws IOException {
        System.out.println("You want to paid for the film?");
        System.out.println("Please enter number of your credit card:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numberOfCard = bufferedReader.readLine();
        if (numberOfCard.length() == 12 & client.countUnpaidStatus != 0) {
            System.out.println("You have successfully completed the payment!");
            client.countUnpaidStatus--;
        } else {
            System.out.println("Something went wrong. Try again! Or you don't have booking ticket for payment");
        }
    }
}
