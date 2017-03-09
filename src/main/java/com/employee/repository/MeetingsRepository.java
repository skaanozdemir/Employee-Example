package com.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employee.model.Meetings;

public interface MeetingsRepository extends CrudRepository<Meetings, Integer> {
	public void addMeetings(Meetings department);

	public void updateMeetings(Meetings department);

	public List<Meetings> listMeetings();

	public Meetings getMeetingById(int id);

	public void deleteMeetings(int meetingId);
}
