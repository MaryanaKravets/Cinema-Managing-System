package edu.project1;


import edu.project1.server.LogInException;
import edu.project1.server.Server;

import java.io.IOException;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable task = () -> {
            try {
                System.out.println("Execute task inside: " + Thread.currentThread().getName());
                Server server = new Server();
                server.menuStepOne();
            } catch (IOException | LogInException ex) {
                ex.printStackTrace();
            }

        };
        for (int i = 0; i < 2; i++) {
            executorService.submit(task);
        }
        executorService.shutdown();
    }
}

