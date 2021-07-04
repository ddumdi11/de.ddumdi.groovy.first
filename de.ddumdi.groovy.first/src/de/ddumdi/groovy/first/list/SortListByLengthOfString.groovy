package de.ddumdi.groovy.first.list

class SortListByLengthOfString {
	
	static void main(args) {
		def List strings = "this is a not so very long sentence".split();
		strings.sort({s1, s2 -> s1.size() <=> s2.size()});
		println strings
	}
	
}
