package com.hackerrank.stereotypes.service;

import org.springframework.stereotype.Service;

import com.hackerrank.stereotypes.model.Person;
import com.hackerrank.stereotypes.repository.ContactRepository;

@Service
public class ContactService {
    ContactRepository contactRepository;
    
    public ContactService(ContactRepository contactRepository) {
    	this.contactRepository = contactRepository;
    }

    public Person retrieve(Integer id){
        return contactRepository.findById(id).get();
    }

    public Person save(Person person){
        return contactRepository.save(person);
    }
}
