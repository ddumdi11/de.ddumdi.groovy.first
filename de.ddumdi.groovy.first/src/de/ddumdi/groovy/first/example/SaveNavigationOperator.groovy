package de.ddumdi.groovy.first.example

class SaveNavigationOperator {
	
	// firstName is null, if user is null. No NPE
	def firstName = user?.firstName
	
	static void main(args) {
		println("Verstehe ich noch nicht ;-)")		
	}
	
}
