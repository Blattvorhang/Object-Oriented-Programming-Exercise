package de.tum.in.ase.eist;

import java.util.HashSet;
import java.util.Set;

public class Student extends Person {
	private final String matriculationNumber;
    private final StudyLevel studyLevel;
    private int semester;
    private final Set<Skill> skills;
    private final Set<String> knowledge;

    public Student(String name, int age, String tumId, String matriculationNumber, StudyLevel studyLevel, int semester) {
    	super(name, age, tumId);
    	this.matriculationNumber = matriculationNumber;
        this.studyLevel = studyLevel;
    	this.semester = semester;
        this.skills = new HashSet<>();
    	this.knowledge = new HashSet<>();
    }

    public final String getMatriculationNumber() {
    	return matriculationNumber;
    }

    public final StudyLevel getStudyLevel() {
    	return studyLevel;
    }

    public final int getSemester() {
    	return semester;
    }

    public final Set<Skill> getSkills() {
    	return skills;
    }

    public final Set<String> getKnowledge() {
    	return knowledge;
    }

    public void learnSkill(Skill newSkill) {
    	skills.add(newSkill);
    }

    public void acquireKnowledge(String newKnowledge) {
    	knowledge.add(newKnowledge);
    }
}
