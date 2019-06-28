package com.axelor.MiniProject.module;

import com.axelor.MiniProject.resources.ContactResource;
import com.axelor.MiniProject.services.ContactService;
import com.axelor.MiniProject.services.ContactServiceImpl;
import com.google.inject.AbstractModule;

public class ModuleConfig extends AbstractModule {
	@Override
	protected void configure() {
		bind(ContactResource.class);
		bind(ContactService.class).to(ContactServiceImpl.class);
	}
}