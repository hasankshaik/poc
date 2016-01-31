package uk.co.dev;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CamelHttpTransportServlet camelServlet() {

		final CamelHttpTransportServlet servlet = new CamelHttpTransportServlet();
		servlet.setServletName("CamelServlet");

		return servlet;
	}

	@Bean
	public ServletRegistrationBean camelServletRegistrationBean() {

		final ServletRegistrationBean registration = new ServletRegistrationBean(
				this.camelServlet());
		registration.setName("CamelServlet");
		registration.addUrlMappings("/rest/*");

		return registration;
	}

	@Override
	protected SpringApplicationBuilder configure(
			final SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
}
