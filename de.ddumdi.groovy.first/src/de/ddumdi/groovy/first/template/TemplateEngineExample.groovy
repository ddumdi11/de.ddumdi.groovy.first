package de.ddumdi.groovy.first.template

import de.ddumdi.groovy.first.first.Task2
import groovy.text.SimpleTemplateEngine


class TemplateEngineExample {

	static void main(args) {
		String templateText = '''Project report:

We have currently ${tasks.size} number of items with a total duration of $duration.
<% tasks.each { %>- $it.summary
<% } %>

'''

		def list = [
			new Task2(summary:"Learn Groovy", duration:4),
			new Task2(summary:"Learn Grails", duration:12)
		]
		def totalDuration = 0
		list.each {
			totalDuration += it.duration
		}
		def engine = new SimpleTemplateEngine()
		def template = engine.createTemplate(templateText)
		def binding = [
			duration: "$totalDuration",
			tasks: list]

		println template.make(binding).toString()
	}
}
