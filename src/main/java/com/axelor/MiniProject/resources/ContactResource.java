package com.axelor.MiniProject.resources;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import org.jboss.resteasy.annotations.jaxrs.FormParam;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.axelor.MiniProject.db.Contact;
import com.axelor.MiniProject.db.Phone;
import com.axelor.MiniProject.services.ContactService;
import com.google.inject.Inject;

@Path("/ContactResource")
public class ContactResource {

	@Inject
	ContactService service;

	int contactId;
	List<Phone> listOfPhone;

	String path = "http://localhost:8080";

	@POST
	@Path("/insert")
	public void insert(@FormParam("name") String contactName, @FormParam("phoneno") String[] phoneNumber,
			@FormParam("phonetype") String phoneType, @Context HttpServletRequest request,
			@Context HttpServletResponse response) throws ServletException, IOException {
		for(int i=0;i<phoneNumber.length;i++) { System.out.println(phoneNumber[i]); }
		service.insertContact(contactName, phoneNumber, phoneType);
		response.sendRedirect(request.getContextPath() + "/ContactResource/get");

		/*
		 * 
		 * 
		 * 
		 * 
		 * listOfContact.forEach(contact->{ contactId=contact.getContactId();
		 * listOfPhone=contact.getListOfPhone(); listOfPhone.forEach(phone->{
		 * System.out.println("phone ID is :"+phone.getPhoneId()+"phone no."+phone.
		 * getPhoneNumber()+"phone type is "+phone.getPhoneType()); });
		 * System.out.println("contactid is +"+contact.getContactId()+" contactName is:"
		 * +contact.getContactName()); });
		 */

	}

	@Path("/update")
	public void update(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("contactId");
		int contactId = Integer.parseInt(id);
		String id1 = request.getParameter("phoneId");
		int phoneId = Integer.parseInt(id1);
		String contactName = request.getParameter("contactName");
		String phoneNo = request.getParameter("phoneNo");
		String phoneType = request.getParameter("phoneType");
		// System.out.println(contactId+contactName+phoneNo+phoneType);
		service.updateContact(contactId, phoneId, contactName, phoneNo, phoneType);
		response.sendRedirect(request.getContextPath() + "/ContactResource/get");

		/*
		 * listOfContact.forEach(contact->{
		 * 
		 * listOfPhone=contact.getListOfPhone(); listOfPhone.forEach(phone->{
		 * System.out.println("phone ID is :"+phone.getPhoneId()+"phone no."+phone.
		 * getPhoneNumber()+"phone type is "+phone.getPhoneType()); });
		 * System.out.println("contactid is +"+contact.getContactId()+" contactName is:"
		 * +contact.getContactName()); });
		 */

	}

	@Path("/delete")
	public void delete(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws ServletException, IOException {
		String id1 = request.getParameter("phoneId");
		int phoneId = Integer.parseInt(id1);
		service.deletePhone(phoneId);

		response.sendRedirect(request.getContextPath() + "/ContactResource/get");
	}

	@Path("/get")
	public void getAllRecord(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws ServletException, IOException {
		List<Contact> listOfContact = service.readAllContact();
		request.setAttribute("listContact", listOfContact);

		request.getRequestDispatcher("../showContact.jsp").forward(request, response);
	}

	@POST
	@Path("/search")
	public void search(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws ServletException, IOException {
		String contactName = request.getParameter("searchfor");
		System.out.println(contactName);

		List<Contact> listOfContact = service.searchContact(contactName);
		listOfContact.forEach(contact -> {

			listOfPhone = contact.getListOfPhone();
			listOfPhone.forEach(phone -> {
				System.out.println("phone ID is :" + phone.getPhoneId() + "phone no." + phone.getPhoneNumber()
						+ "phone type is " + phone.getPhoneType());
			});
			System.out
					.println("contactid is +" + contact.getContactId() + " contactName is:" + contact.getContactName());
		});
		request.setAttribute("listContact", listOfContact);

		request.getRequestDispatcher("../showContact.jsp").forward(request, response);
	}

	@Path("/deleteAll/{id}")
	public void deleteAll(@PathParam("id") int contactId, @Context HttpServletRequest request,
			@Context HttpServletResponse response) throws IOException {
		System.out.println("id is" + contactId);
		service.deleteAllContact(contactId);
		response.sendRedirect(request.getContextPath() + "/ContactResource/get");
	}

}
