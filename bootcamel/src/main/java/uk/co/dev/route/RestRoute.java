package uk.co.dev.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RestRoute extends RouteBuilder {

	@Override
	public void configure() {
		// Access us using http://localhost:8080/camel/hello
		from("servlet:///hello").transform().constant("Hello from Camel!");

		// Trigger run right after startup. No Servlet request required.
		from("timer://foo?fixedRate=true&period=10s").log(
				"Camel timer triggered.");
	}

	@Bean
	String myBean() {
		return "I'm Spring bean!";
	}
}
