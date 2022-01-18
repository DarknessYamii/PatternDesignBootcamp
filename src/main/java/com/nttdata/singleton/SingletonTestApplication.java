package com.nttdata.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nttdata.TeoryPerson.Unit;
import com.nttdata.builderPerson.PersonClassBuilder;
import com.nttdata.decoratorPerson.ImplPersonDecorator;
import com.nttdata.lombokPerson.PersonLombok;
import com.nttdata.prototypePerson.PersonPrototype;
import com.nttdata.proxyPerson.ProxyImpl;
import com.nttdata.singletonPerson.Person;
import com.nttdata.singletonPerson.PersonSingleton;
import com.nttdata.singletonPerson.PersonSingletonEnum;

@SpringBootApplication
public class SingletonTestApplication implements CommandLineRunner
{

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(SingletonTestApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("==========================================\n"
				+ "===================SINGLETON SYSOUT=======================\n"
				+ "==========================================\\n");
	PersonSingleton.getSingletonPerson().setName("Andres");	
	PersonSingleton.getSingletonPerson().setAge(19);	
	PersonSingletonEnum.INSTANCE.getPerson();

	System.out.println(PersonSingleton.getSingletonPerson().getAge());
	System.out.println(PersonSingleton.getSingletonPerson().getName());
	System.out.println(PersonSingletonEnum.INSTANCE.getPerson().getAge());
	
	System.out.println("==========================================\n"
			+ "===================PROTOTYPE SYSOUT=======================\n"
			+ "==========================================\\n");
	
	PersonPrototype p = new PersonPrototype();
	p.setName("Andrelillo");
	System.out.println(p.getName());
	PersonPrototype p3 = new PersonPrototype();
	p3 = (PersonPrototype) p.Clone();
	
	System.out.println(p3.getName());


	/**
	 * Da error a la hora de buscar el BEAN, pone que no existe ninguno con ese nombre
	 */
	
//	System.out.println("==========================================\n"
//			+ "===================SINGLETON/PROTOTYPE SYSOUT=======================\n"
//			+ "==========================================\\n");
//	System.out.println("Prototype Item Name -> " + ((Person)context.getBean("personPrototype")).getName());
//	System.out.println("Prototype Item ID -> " + context.getBean("personPrototype").hashCode());
//	
//	System.out.println("Prototype Item Name -> " + ((Person)context.getBean("personSingleton")).getName());
//	System.out.println("Prototype Item ID -> " + context.getBean("personPrototype").hashCode());
	
	
	System.out.println("==========================================\n"
			+ "===================BUILDER SYSOUT=======================\n"
			+ "==========================================\\n");
	PersonClassBuilder personBuilder = PersonClassBuilder.builder().age(45).name("Alfonso").build();
	System.out.println("Name " + personBuilder.getName() +
					" Age " + personBuilder.getAge()
			
			);

	PersonLombok plombok = PersonLombok.builder().name("Andresito").age(19).build();
	System.out.println(plombok.getName());
	System.out.println("==========================================\n"
			+ "===================DECORATOR SYSOUT=======================\n"
			+ "==========================================\\n");
	Person person1 = new Person();
	person1.setAge(19);
	person1.setName("ANDRES");
	ImplPersonDecorator person4 = new ImplPersonDecorator(person1);
	System.out.println(person4.getName());
	System.out.println(person4.getAge());
	
	System.out.println("==========================================\n"
			+ "===================PROXY SYSOUT=======================\n"
			+ "==========================================\\n");

	ProxyImpl proxyPerson = new ProxyImpl(person1) ;
	proxyPerson.SendMessage();
	
	
	System.out.println("==========================================\n"
			+ "===================Teory SYSOUT=======================\n"
			+ "==========================================\\n");
	
	Unit capitan = new Unit();
	capitan.setName("Javier");
	Unit sargento = new Unit();
	sargento.setName("Andres");
	Unit soldado = new Unit();
	soldado.setName("Manuel");
	capitan.setSubordinate(sargento);
	sargento.setSubordinate(soldado);
	capitan.executeCommand("Accion");
	}
	
	
	
}
