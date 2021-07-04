package de.ddumdi.groovy.first.datatypes

public class ListMapTest2{

	public static void main(args){
		List<Person> persons = []
		persons[0] = new Person("Jim", "Knopf")
		persons[1] = new Person("Test", "Test")
		println persons.firstName
		println persons.lastName
	}
}