package edu.project1.cinema;

import java.util.List;

public interface PrintListInterface {
    default void printList(List list) {
        for (int i = 1; i <= list.size(); i++) {
            System.out.println(i + ") " + list.get(i - 1));
        }
    }
}
