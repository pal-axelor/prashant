package com.axelor.MiniProject.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.axelor.MiniProject.db.Contact;
import com.axelor.MiniProject.db.Phone;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class ContactServiceImpl implements ContactService {
	@Inject
	Provider<EntityManager> em;

	@Transactional
	public void insertContact(String contactName, String[] phoneNo, String phoneType) {
		EntityManager entitymanager = em.get();

		Query query = entitymanager.createQuery("SELECT s.phoneNumber FROM Phone s");

		
		
		String flag="false";
		List<String> phoneNumber = query.getResultList();
		for(int j=0;j<phoneNo.length;j++) {
			
		if (phoneNumber.contains(phoneNo[j])){
			flag="true";
		} 
		}
		 if(flag=="false") {
			System.out.println("phone length is "+phoneNo.length);
			Phone [] phone=new Phone[phoneNo.length];
			ArrayList<Phone> listOfPhone = new ArrayList<Phone>();
			Contact contact = new Contact();
			contact.setContactName(contactName);
			for(int i=0;i<phone.length;i++) {
				phone[i] = new Phone();
				phone[i].setPhoneNumber(phoneNo[i]);
				phone[i].setPhoneType(phoneType);
				listOfPhone.add(phone[i]);
				phone[i].setContact(contact);
				entitymanager.persist(phone[i]);
				
				
			}
			
			contact.setListOfPhone(listOfPhone);
			entitymanager.persist(contact);
		}
		 else {
			 System.out.println("can not insert contact");
		 }
	}

	@Transactional
	public void updateContact(int contactId, int phoneId, String contactName, String phoneNo, String phoneType) {
		EntityManager entitymanager = em.get();
		Contact contact = entitymanager.find(Contact.class, contactId);
		Phone phone = entitymanager.find(Phone.class, phoneId);
		contact.setContactName(contactName);
		phone.setPhoneNumber(phoneNo);
		phone.setPhoneType(phoneType);
		phone.setContact(contact);
		entitymanager.persist(phone);
		entitymanager.persist(contact);

	}

	@Transactional
	public void deletePhone(int phoneId) {
		EntityManager entitymanager = em.get();
		Phone phone = entitymanager.find(Phone.class, phoneId);
		phone.setContact(null);
		entitymanager.remove(phone);

	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Contact> readAllContact() {
		EntityManager entitymanager = em.get();
		Query query = entitymanager.createQuery("from Contact");
		List<Contact> listOfContact = query.getResultList();
		return listOfContact;
	}

	@Transactional
	public List<Contact> searchContact(String contactName1) {

		EntityManager entitymanager = em.get();
		Query query = entitymanager
				.createQuery("SELECT s FROM Contact s WHERE s.contactName LIKE '%" + contactName1 + "%'");

		List<Contact> listOfContact = query.getResultList();
		System.out.println(listOfContact.size());
		return listOfContact;
	}

	@Transactional
	public void deleteAllContact(int contactId) {
		EntityManager entitymanager = em.get();
		Contact contact = entitymanager.find(Contact.class, contactId);
		entitymanager.remove(contact);

	}
}
