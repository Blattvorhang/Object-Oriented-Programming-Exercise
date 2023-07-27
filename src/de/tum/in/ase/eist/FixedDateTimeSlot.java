package de.tum.in.ase.eist;

import java.time.LocalTime;
import java.time.LocalDate;

public class FixedDateTimeSlot extends TimeSlot {
	private final LocalDate date;

    public FixedDateTimeSlot(LocalDate date, LocalTime startTime, LocalTime endTime) {
        super(startTime, endTime);
        this.date = date;
    }

    public LocalDate getDate() {
    	return date;
    }
}
