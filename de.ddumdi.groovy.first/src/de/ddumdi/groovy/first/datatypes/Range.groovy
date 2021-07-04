package de.ddumdi.groovy.first.datatypes

class Range {

	static void main(args) {
		for (i in 0..9) {
			println ("Hello $i" )
		}
		println("assert 'B'..'E' == ['B', 'C', 'D', 'E']")
		assert 'B'..'E' == ['B', 'C', 'D', 'E']
	}
}
