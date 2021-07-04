package de.ddumdi.groovy.first.loops

public class PrintLoop{
	public static void main(def args){
		def list = ["Lars", "Ben", "Jack"]
		// using a variable assignment
		list.each{firstName->
			println firstName
		}
		// using the it variable
		list.each{println it}
	}
}