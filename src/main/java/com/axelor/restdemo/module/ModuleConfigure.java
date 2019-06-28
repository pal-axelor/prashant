package com.axelor.restdemo.module;

import com.axelor.restdemo.resource.StudentResource;
import com.axelor.restdemo.service.StudentService;
import com.axelor.restdemo.service.StudentServiceImpl;
import com.google.inject.AbstractModule;

public class ModuleConfigure extends AbstractModule {
	@Override
	protected void configure() {
		bind(StudentResource.class);
		bind(StudentService.class).to(StudentServiceImpl.class);
	}
}