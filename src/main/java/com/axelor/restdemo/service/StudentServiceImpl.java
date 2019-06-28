package com.axelor.restdemo.service;

import javax.persistence.EntityManager;

import com.axelor.restdemo.db.Student;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

@Singleton
public class StudentServiceImpl implements StudentService {
	@Inject
	Provider<EntityManager> em;

	@Transactional
	public void insertStudent(String name, int age) {
		EntityManager entitymanager = em.get();
		Student student = new Student();
		student.setStudentAge(age);
		student.setStudentName(name);
		entitymanager.persist(student);
	}
}
