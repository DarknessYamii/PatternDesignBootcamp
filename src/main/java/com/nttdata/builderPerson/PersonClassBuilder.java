package com.nttdata.builderPerson;

import com.nttdata.singletonPerson.Person;

public class PersonClassBuilder {
	
	private int age;
	private String name;
	public PersonClassBuilder () {
		
	}
	public PersonClassBuilder(String name, int age) {
		this.name=name;
		this.age=age;
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
	public static class PersonBuilder {
        private String name;
        private int age;
        public PersonBuilder name (String name) {
            this.name = name;
            return this;
        }
        public PersonBuilder age (int age) {
            this.age = age;
            return this;
        }
        public PersonClassBuilder build () {
            return new PersonClassBuilder(this);
        }
    }
	public static PersonBuilder builder() {
        return new PersonBuilder();
    }
	
	private PersonClassBuilder(PersonBuilder personBuilder) {
        super();
        this.name = personBuilder.name;
        this.age = personBuilder.age;
    }
}

