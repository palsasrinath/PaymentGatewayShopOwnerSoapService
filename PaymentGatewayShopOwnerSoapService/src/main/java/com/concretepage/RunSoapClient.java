package com.concretepage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.concretepage.wsdl.GetOwnerResponse;

public class RunSoapClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(ClientAppConfig.class);
	    ctx.refresh();
		OwnerClient ownerClient = ctx.getBean(OwnerClient.class);
		System.out.println("For Owner Id: 1");
		GetOwnerResponse response = ownerClient.getOwnerById(1);
		System.out.println("Name:"+response.getOwner().getOwnerName());
		System.out.println("Age:"+response.getOwner().getStoreId());
	}
}
