package com.nttdata.singletonPerson;

public class PersonSingleton {

	private static Person personSingleton;
	
	public static Person getSingletonPerson() {
		if(personSingleton == null) {
			personSingleton = new Person();
		}
		return personSingleton;
	}
	
	
	
}
