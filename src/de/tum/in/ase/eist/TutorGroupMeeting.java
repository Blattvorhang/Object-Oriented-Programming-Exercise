package de.tum.in.ase.eist;

public abstract class TutorGroupMeeting {
	private final TutorGroup tutorGroup;
    private final FixedDateTimeSlot timeSlot;
    private final Skill skillToPractise;

    public TutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractise) {
        this.timeSlot = timeSlot;
    	this.tutorGroup = tutorGroup;
        this.skillToPractise = skillToPractise;
        tutorGroup.addMeeting(this);
    }

    public TutorGroup getTutorGroup() {
    	return tutorGroup;
    }

    public FixedDateTimeSlot getTimeSlot() {
        return timeSlot;
    }

    public Skill getSkillToPractise() {
    	return skillToPractise;
    }

    public abstract void practise();
}
