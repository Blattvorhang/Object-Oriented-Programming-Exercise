package de.tum.in.ase.eist;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public final class TutorGroupStatistics {

	private TutorGroupStatistics() {

	}

	public static double averageDuration(Stream<TutorGroupMeeting> meetingStream) {
		return meetingStream.mapToLong(meeting -> meeting.getTutorGroup().getTimeSlot().getDuration().toSeconds())
		                    .average()
		                    .orElse(0);
	}

	public static Set<Skill> repeatedSkills(Stream<TutorGroupMeeting> meetings) {
		List<Skill> skillsList = meetings.map(TutorGroupMeeting::getSkillToPractise)
		                                 .toList();
		return skillsList.stream()
		                 .filter(skill -> Collections.frequency(skillsList, skill) > 1)
		                 .collect(Collectors.toSet());
	}
}
