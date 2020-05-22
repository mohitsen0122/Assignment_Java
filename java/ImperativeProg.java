package com.my.functionalProg;

import java.util.ArrayList;
import java.util.List;

public class ImperativeProg {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Mohit", Gender.MALE) );
		people.add(new Person("Manali", Gender.FEMALE) );
		people.add(new Person("Sushma", Gender.FEMALE) );
		people.add(new Person("Rohit", Gender.MALE) );
		people.add(new Person("Diksha", Gender.FEMALE) );
		people.add(new Person("Sohit", Gender.MALE) );
		
		ArrayList<Person> females = new  ArrayList<Person>();
		ArrayList<Person> males = new  ArrayList<Person>();
		for(Person person : people) {
			if(Gender.FEMALE.equals(person.gender))
					females.add(person);
			else
				males.add(person);
		}
		for(Person female : females) {
			System.out.println(female);
		}
		for(Person male : males) {
			System.out.println(male);
		}
	}
	static class Person	{
		private final String name;
		private final Gender gender;
		public Person(String name , Gender gender) {
			this.name = name;
			this.gender = gender;
		}
		
		public String toString()
		{
			return name+" "+gender;
		}
	}
	enum Gender {
		MALE, FEMALE;
	}
}
