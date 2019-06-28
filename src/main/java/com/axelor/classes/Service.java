package com.axelor.classes;

import java.util.List;

public interface Service {
	public void insert(String name, int age);

	public List<Student> getList();

	public List<Student> update(String name,int age,int id);

	public List<Student> delete(int id);
}
