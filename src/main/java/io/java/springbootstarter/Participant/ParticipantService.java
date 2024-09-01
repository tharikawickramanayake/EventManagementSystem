package io.java.springbootstarter.Participant;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	public List<Participant> getAllParticipants(){
		return (List<Participant>) participantRepository.findAll();
	}
	
	public Optional<Participant> getParticipant(int id){
		return participantRepository.findById(id);
	}
	
	public void addParticipant(Participant participant) {
		participantRepository.save(participant);
	}
	
	public void deleteParticipant(int id) {
		participantRepository.deleteById(id);
	}

	public void updateParticipant(Participant participant, int id) {
		// TODO Auto-generated method stub
		participant.setId(id);
		participantRepository.save(participant);
	}

}
