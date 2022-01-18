package com.nttdata.prototypePerson;

public class PersonPrototype implements PersonI {

	private int age;
	private String name;

	public PersonPrototype () {
				
			}

	public PersonPrototype(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public PersonI Clone() {
		PersonPrototype person = null;
		try {
			person = (PersonPrototype) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return person;
		
	}

}
