package com.axelor.classes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class ServiceImpl implements Service {
	@Inject
	//Provider<EntityManager> em1;
	EntityManager em;
	
	@Transactional
	public void insert(String name, int age) {
		
		Student student = new Student();
		student.setStudentAge(age);
		student.setStudentName(name);
		em.getTransaction().begin();
		 em.persist(student);
		em.getTransaction().commit();

	}

	public List<Student> getList() {
		em.getTransaction().begin();
		Query query = em.createQuery("from Student");
		@SuppressWarnings("unchecked")
		List<Student> listOfStudent = query.getResultList();
		em.getTransaction().commit();

		return listOfStudent;
	}

	public List<Student> update(String studentName1,int studentAge1,int studentid) {
		em.getTransaction().begin();
		Student student=em.find(Student.class, studentid);
		//int c=request.getAttribute()
		student.setStudentAge(studentAge1);
		student.setStudentName(studentName1);
		em.persist(student);
		em.getTransaction().commit();
		em.getTransaction().begin();
		Query query = em.createQuery("from Student");
		@SuppressWarnings("unchecked")
		List<Student> listOfStudent = query.getResultList();
		em.getTransaction().commit();

		return listOfStudent;
	}

	public List<Student> delete(int studentid) {
		em.getTransaction().begin();
		Student student=em.find(Student.class, studentid);
		em.remove(student);
		em.getTransaction().commit();
		em.getTransaction().begin();
		Query query = em.createQuery("from Student");
		@SuppressWarnings("unchecked")
		List<Student> listOfStudent = query.getResultList();
//		em.getTransaction().commit();

		return listOfStudent;
		
	}

}
