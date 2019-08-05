package edu.project1.cinema;

import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
public class Place {
    @Getter
    private int numberOfPlace;
    @Getter
    TypeOfPlace type_of_place;
    @Getter
    private boolean isReserved;

    public Place(int numberOfPlace, TypeOfPlace type_of_place) {
        this.numberOfPlace = numberOfPlace;
        this.type_of_place = type_of_place;
    }

    public void reserve() {
        isReserved = true;
    }

    public void unReserved() {
        isReserved = false;
    }
}
