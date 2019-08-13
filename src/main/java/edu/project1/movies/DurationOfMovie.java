package edu.project1.movies;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalTime;

@AllArgsConstructor
@ToString
@Getter
public enum DurationOfMovie {
    SESSION1(LocalTime.of(16, 00), LocalTime.of(18, 00)),
    SESSION2(LocalTime.of(19, 30), LocalTime.of(21, 00));

    private LocalTime from;
    
    private LocalTime to;

}
