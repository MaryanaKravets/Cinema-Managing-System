package edu.project1.cinema;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TypeOfPlace {
    NORMAL(20, 0.8),
    PREMIUM(10, 1.5),
    VIP(5, 2);

    @Getter
    private int countOfPlace;
    @Getter(AccessLevel.PUBLIC)
    private double ticketCostFactor;
}