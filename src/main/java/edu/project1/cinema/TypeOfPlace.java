package edu.project1.cinema;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TypeOfPlace {
    NORMAL(20, 0.8),
    PREMIUM(10, 1.5),
    VIP(5, 2);
    
    private int countOfPlace;
    
    private double ticketCostFactor;
}