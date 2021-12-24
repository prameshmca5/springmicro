package service;

import entity.Contacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ContactsRepository;

import java.util.List;

@Service
public class ContactService {
	@Autowired
	private ContactsRepository contactsRepository;
	
	private Contacts saveContact(Contacts contacts) {
		return contactsRepository.save(contacts);
	}

	private List<Contacts> getContacts(){
		return contactsRepository.findAll();
	}
	
	private Contacts getContactById(int id) {
		return contactsRepository.findById(id).orElse(null);
	}
	
	private Contacts getContactByName(String name) {
		return contactsRepository.findByName(name);
	}
	
	// Delete Contacts
	private String deleteContacts(int id) {
		contactsRepository.deleteById(id);
		return "Delete Contact !! "+id; 
	}
	
	/*
	// update Contacts
	public Contacts updateContact(Contacts contact) {
		Contacts existingContact = contactsRepository.findById(contact.getId()).orElse(null);
		existingContact.setName(contact.getName());
		existingContact.setEmail(contact.getEmail());
		existingContact.setMessage(contact.getMessage());
		existingContact.setNumber(contact.getNumber());
		return contactsRepository.save(existingContact);
	}
	*/


}
