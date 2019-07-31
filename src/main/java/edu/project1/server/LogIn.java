package edu.project1.server;

import edu.project1.clients.Client;
import edu.project1.clients.Student;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class LogIn {
    volatile static List<Client> listOfClient = new LinkedList<>();
     
    @SneakyThrows
    static Client logInSystem(List<Client> listOfClient) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String username;
        String password;
        System.out.println("Enter Username: ");
        username = reader.readLine();
        System.out.println("Enter Password: ");
        password = reader.readLine();
        return listOfClient.stream().filter(cl -> (cl.getName().equalsIgnoreCase(username) &
                cl.getEmail().equals(password)))
                .findFirst()
                .orElseThrow(() -> new LogInException("You are not registered. Please register to log in!"));
    }


    static void registrationUser() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your name:(it is your login) ");
            String name = reader.readLine();
            System.out.println("Enter your surname: ");
            String surName = reader.readLine();
            System.out.println("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("Enter your email:(it is your password) ");
            String email = reader.readLine();
            System.out.println("Enter your phone number: ");
            long phone = Long.parseLong(reader.readLine());
            System.out.println("Are you a student? If YES - enter 1, if NO - enter 2");
            int i = Integer.parseInt(reader.readLine());
            if (i == 1) {
                System.out.println("Enter your id:");
                String id = reader.readLine();
                Client client = new Student(name, surName, age, email, phone, id);
                listOfClient.add(client);
            } else {
                Client client = new Client(name, surName, age, email, phone);
                listOfClient.add(client);
            }
        } catch (InputMismatchException | IOException | NumberFormatException ex) {
            System.out.println("You entered incorrect data!");
        }
    }
}



