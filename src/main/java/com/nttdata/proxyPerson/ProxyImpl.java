package com.nttdata.proxyPerson;

import com.nttdata.singletonPerson.Person;

public class ProxyImpl implements ProxyI {

	private Person person;
	
	public ProxyImpl(Person person) {
		this.person = person;
	}
	
	@Override
	public void SendMessage() {
		before();
		this.person.SendMessage();
		after();
	}

	public void before() {
		System.out.println("Iniciando ejecucion " + person.getName());
	}
	public void after() {
		System.out.println("Terminando ejecucion " + person.getName());
	}
}
