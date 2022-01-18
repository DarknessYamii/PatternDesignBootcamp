package com.nttdata.singletonPerson;

import com.nttdata.decoratorPerson.PersonDecoratorI;
import com.nttdata.proxyPerson.ProxyI;

import lombok.Builder;




public class Person implements PersonDecoratorI, ProxyI{

//	@Override
//	public PersonI Clone() {
//		Person person = null;
//		try {
//		person = (Person) clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		return person;
//	}
//	
	// singleton method
		private static Person singleton;
		
		private int age;
		private String name;
		public Person () {
			
		}
		public Person(String name, int age) {
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
	        public Person build () {
	            return new Person(this);
	        }
	    }
		public static PersonBuilder builder() {
	        return new PersonBuilder();
	    }
		
		private Person(PersonBuilder personBuilder) {
	        super();
	        this.name = personBuilder.name;
	        this.age = personBuilder.age;
	    }
		
		@Override
		public void SendMessage() {
		System.out.println("Ejecutando proceso");
			
		}
	}



