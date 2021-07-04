package de.ddumdi.groovy.first.example

class ControlStructure {

	static void main(args) {
		def map = [:]
		assert !map

		def list = ["Ubuntu", "Android"]
		assert list
		assert !0
		assert 1
		assert -1
		assert !""
		assert "Hello"
		def test = null
		assert !test
	}
}
