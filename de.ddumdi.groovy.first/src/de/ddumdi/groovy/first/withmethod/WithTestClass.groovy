package de.ddumdi.groovy.first.withmethod

class WithTestClass {
	String property1
	String property2
	List<String> list = []
	def addElement(value) {
		list << value
	}
	def returnProperties () {
		"Property 1: $property1, Property 2: $property2 "
	}
}
