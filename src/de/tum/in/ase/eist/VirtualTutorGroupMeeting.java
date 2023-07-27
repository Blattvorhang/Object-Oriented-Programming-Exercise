package de.tum.in.ase.eist;

public class VirtualTutorGroupMeeting extends TutorGroupMeeting {
    private final String url;

    public VirtualTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractise, String url) {
        super(timeSlot, tutorGroup, skillToPractise);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void practise() {
        Person tutor = getTutorGroup().getTutor();
        tutor.say("Thank you for joining using " + url + " today.");

        Skill skill = getSkillToPractise();
        for (Student student : getTutorGroup().getStudents()) {
            student.learnSkill(skill);
        }

        tutor.say("See you next time!");
    }
}
