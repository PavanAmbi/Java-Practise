package com.example.demo;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class SpringBootThymleafApplication  implements Cloneable{

	public static void main(String[] args) {
		
		
		Person personabc = Stream.of(new Person(1,"dbc"), new Person(7,"xyz"), new Person(3,"abc")).
		filter(p -> p.getName().equalsIgnoreCase("abc")).findAny().orElseThrow(IllegalArgumentException::new);
		System.out.println(personabc.getName());
		
		
		//SpringApplication.run(SpringBootThymleafApplication.class, args);
	}

}


class Person {
	
	private int id;
	private String name;
	
	
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}