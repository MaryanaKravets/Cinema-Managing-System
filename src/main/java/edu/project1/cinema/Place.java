package edu.project1.cinema;

import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
public class Place {
    @Getter
    private int numberOfPlace;
    @Getter
    Type_Of_Place type_of_place;
    @Getter
    private boolean isReserved;

    public Place(int numberOfPlace, Type_Of_Place type_of_place) {
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
