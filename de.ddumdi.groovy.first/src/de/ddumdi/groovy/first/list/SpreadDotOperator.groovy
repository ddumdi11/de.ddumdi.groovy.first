package de.ddumdi.groovy.first.list

class SpreadDotOperator {
	
	static void main(args) {
		def list = ["Hello", "Test", "Lars"]
		
		// calculate the length of every String in the list
		def sizeList = list*.size()
		assert sizeList == [5, 4, 4]
		if ((sizeList == [5, 4, 4])) {
			println("Annahme ist richtig.")
		}		
	}
	
}
