package com.axelor.MiniProject.db;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int contactId;
	
	String contactName;

	@OneToMany(mappedBy = "contact",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	List<Phone> listOfPhone;
	
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}


	public List<Phone> getListOfPhone() {
		return listOfPhone;
	}

	public void setListOfPhone(List<Phone> listOfPhone) {
		this.listOfPhone = listOfPhone;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
}
