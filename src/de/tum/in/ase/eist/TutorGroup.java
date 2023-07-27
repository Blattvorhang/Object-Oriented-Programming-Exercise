package de.tum.in.ase.eist;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class TutorGroup {
	private final Set<Student> students;
    private final String id;
    private final WeeklyTimeSlot timeSlot;
    private final Person tutor;
    private final List<TutorGroupMeeting> meetings;

    public TutorGroup(String id, WeeklyTimeSlot timeSlot, Person tutor) {
    	this.id = id;
        this.timeSlot = timeSlot;
    	this.tutor = tutor;
        this.students = new HashSet<>();
        this.meetings = new ArrayList<>();
    }

    public String getId() {
    	return id;
    }

    public WeeklyTimeSlot getTimeSlot() {
    	return timeSlot;
    }

    public Person getTutor() {
    	return tutor;
    }

    public Set<Student> getStudents() {
    	return students;
    }

    public List<TutorGroupMeeting> getMeetings() {
    	return meetings;
    }

    void addMeeting(TutorGroupMeeting meeting) {
    	meetings.add(meeting);
    }

    public void register(Student student) {
    	students.add(student);
    }
}
