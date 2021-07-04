package de.ddumdi.groovy.first.closures

class UsingLambdasAndClosures {
	
	// return the input, using the implicit variable it
	def static returnInput = {it}	
		
	// return the input without implicit variable
	def static returnInput2 = {s-> s}
	
	// Closure-Definition (?)
	def static multiply = {int a, int  b = 10 -> a * b}
	
	static void main(args) {
		assert 'Test' == returnInput('Test')
		assert 'Test' == returnInput2('Test')
		assert multiply(2) == 20
		assert multiply(2,5) == 10
		
		// Closures in each-Method
		List<Integer> list = [5,6,7,8]
		list.each({line -> println line})
		list.each({println it})		
		
		// calculate the sum of the number up to 10		
		def total = 0
		(1..10).each {total+=it}
		println(total)
	}
}
