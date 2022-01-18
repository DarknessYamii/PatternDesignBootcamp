package com.nttdata.decoratorPerson;

import com.nttdata.singletonPerson.Person;

public class ImplPersonDecorator implements PersonDecoratorI {

	
	private Person person;
	
	public ImplPersonDecorator(Person person) {
		this.person = person;
	}
	
	public String getName() {
		return "Nombre: " + this.person.getName();
	}
	
	public int getAge() {
		return this.person.getAge()*10;
	}

}
