package de.ddumdi.groovy.first.first

class Hello {

	static main(args){
		println sum(1,5)
		println sum(1,2,5)
	}

	static sum(a,b,c=0){
		a+b+c;
	}
}