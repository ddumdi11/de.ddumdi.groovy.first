package de.ddumdi.groovy.first.namedarguments


class Person {
	String name
	Address address
	String phoneNumber

	def moveToNewPlace(inputAsMap, newPhoneNumber) {
		address.street = inputAsMap.street
		address.city   = inputAsMap.city
		phoneNumber = newPhoneNumber
	}
}