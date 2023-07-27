package de.tum.in.ase.eist;

import java.time.LocalTime;
import java.time.DayOfWeek;

public class WeeklyTimeSlot extends TimeSlot {
	private final DayOfWeek dayOfWeek;

    public WeeklyTimeSlot(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        super(startTime, endTime);
        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeek getDayOfWeek() {
    	return dayOfWeek;
    }
}
