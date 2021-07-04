package de.ddumdi.groovy.first.networkio

class ProcessingHTTPGetRequests {

	static void main(args) {

		def data = new URL("http://www.vogella.com").text
		println data

		// alternatively use Groovy JDK methods
		println "Alternative:"
		println 'http://www.vogella.com'.toURL().text
	}
	
}
