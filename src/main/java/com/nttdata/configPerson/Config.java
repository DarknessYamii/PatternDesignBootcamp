package com.nttdata.configPerson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nttdata.singletonPerson.Person;

@Configuration
public class Config {

	
	@Bean(name = "personPrototype")
	@Scope("ConfigurableBeanFactory.SCOPE_PROTOTYPE")
	public Person personPrototype() {
		return Person.builder().name("Mari Carmen Proto").age(22).build();
	}
	

	@Bean(name = "personSingleton")
	@Scope("ConfigurableBeanFactory.SCOPE_SINGLETON")
	public Person personSingleton() {
		return Person.builder().name("Mari Carmen Single").age(22).build();
	}
}
