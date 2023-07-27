package de.tum.in.ase.eist;

public class LocalTutorGroupMeeting extends TutorGroupMeeting {
    private final String room;

    public LocalTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractise, String room) {
        super(timeSlot, tutorGroup, skillToPractise);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    @Override
    public void practise() {
        Person tutor = getTutorGroup().getTutor();
        tutor.say("Thank you for coming to " + room + " today.");

        Skill skill = getSkillToPractise();
        for (Student student : getTutorGroup().getStudents()) {
            student.learnSkill(skill);
        }

        tutor.say("See you next time!");
    }
}
