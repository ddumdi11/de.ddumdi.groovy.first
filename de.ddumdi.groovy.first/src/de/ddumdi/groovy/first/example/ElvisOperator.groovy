package de.ddumdi.groovy.first.example

class ElvisOperator {
	
	static void main(args) {
		// if user exists, return it, otherwise create a new User
		
		// Groovy with the Elvis operator
		String test = null
		String result2 = test ?: new String()
		
		// Java version
		String user = null;
		String result1 = user!=null ? user : new String();
	}
	
}
