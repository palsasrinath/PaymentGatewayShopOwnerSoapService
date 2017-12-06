package com.concretepage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ClientAppConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.concretepage.wsdl");
		return marshaller;
	}
	@Bean
	public OwnerClient studentClient(Jaxb2Marshaller marshaller) {
		OwnerClient client = new OwnerClient();
		client.setDefaultUri("http://localhost:8080/spring4soap-1/soapws/owners.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
