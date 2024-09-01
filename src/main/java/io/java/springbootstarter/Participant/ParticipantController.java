package io.java.springbootstarter.Participant;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParticipantController {

	 @Autowired
	 private ParticipantService  participantService;
	 
	 @GetMapping("/participants")
	 public List<Participant> getAllParticipants(){
		 return participantService.getAllParticipants();
	 }
	 
	 @GetMapping("/participants{id}")
	 public Optional<Participant> getParticipant(@PathVariable int id){
		 return participantService.getParticipant(id);
	 }
	 
	 @PostMapping("/participants")
	 public void addParticipant(@RequestBody Participant participant) {
		 participantService.addParticipant(participant);
	 }
	 
	 @PutMapping("/participants/{id}")
	 public void updateParticipant(@PathVariable int id, @RequestBody Participant participant) {
		 participantService.updateParticipant(participant, id);
	 }
	 
	 @DeleteMapping("/participants/{id}")
	 public void deleteParticipant(@PathVariable int id) {
		 participantService.deleteParticipant(id);
	 }
	 
	 
}
