package com.nttdata.TeoryPerson;

public class Unit {

	private String name;
	private Unit subordinate;
	public Unit() {
		
	}
	public Unit(String name, Unit subordinate) {
		this.name = name;
		this.subordinate = subordinate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Unit getSubordinate() {
		return subordinate;
	}
	public void setSubordinate(Unit subordinate) {
		this.subordinate = subordinate;
	}
	public void executeCommand(String command) {
		if(subordinate == null) {
			System.out.println(name + " ha realizado el comando" +" "+ command);
		}else {
			System.out.println("Orden traspada a " + subordinate.name );
			subordinate.executeCommand(command);
		}
	}
}