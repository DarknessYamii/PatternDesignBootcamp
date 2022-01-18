package com.nttdata.singletonPerson;

public class PersonSingletonEager {
	  public static final Person INSTANCE = new Person();
	    private PersonSingletonEager() {
	        super();
	    }
}
