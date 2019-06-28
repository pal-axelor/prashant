package com.axelor.MiniProject.services;

import java.util.List;

import com.axelor.MiniProject.db.Contact;

public interface ContactService {
public void insertContact(String name,String[]  phonenNo,String phoneType);
public void updateContact(int id,int phoneid,String name,String phoneNo,String phoneType);
public void deletePhone(int phoneId);
public List<Contact>  readAllContact();
public List<Contact>  searchContact(String name);
public void deleteAllContact(int id);
}
