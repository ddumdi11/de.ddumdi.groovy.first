package de.ddumdi.groovy.first.fileio

class Write2AndReadFromTextFile {
	
	static void main(args) {
		// write the content of the file to the console
		File file = new File("output.txt")
		file.write "Hello\n"
		file.append "Testing\n"
		file << "More appending...\n"
		File result = new File("output.txt")
		println (result.text)
		
		// write the content of the file to the console
		File file2 = new File("output.txt")
		file2.eachLine{ line -> println line }
		
		// adds a line number in front of each line to the console
		def lineNumber = 0
		File file3 = new File("output.txt")
		file3.eachLine{ line ->
			lineNumber++
			println "$lineNumber: $line"
		}
		
		// read the file into a String
		String s = new File("output.txt").text
		println s
		
		// clean-up
		file.delete()
		file2.delete()
		file3.delete()
		
		// Lesen von gespeicherter Textdatei
		// write the content of the file to the console
		File file4 = new File("./src/de/ddumdi/groovy/first/FILES/input.txt")
		file4.eachLine{ line -> println line }
		
		// adds a line number in front of each line to the console
		lineNumber = 0
		file4 = new File("./src/de/ddumdi/groovy/first/FILES/input.txt")
		file4.eachLine{ line ->
			lineNumber++
			println "$lineNumber: $line"
		}
		
		// read the file into a String
		s = new File("./src/de/ddumdi/groovy/first/FILES/input.txt").text
		println s
		
	}
	
}
