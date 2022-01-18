package com.nttdata.singletonPerson;
public enum PersonSingletonEnum {
    INSTANCE;
    Person person;
    private PersonSingletonEnum() {
        this.person = new Person();
    }
    public Person getPerson() {
        return this.person;
    }
}