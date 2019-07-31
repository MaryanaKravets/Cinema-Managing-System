package edu.project1.cinema;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString(includeFieldNames = false)
class Address {
    private String city;
    private String street;
    private String number;
}

