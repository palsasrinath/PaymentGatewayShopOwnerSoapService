package com.concretepage;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.concretepage.wsdl.GetOwnerRequest;
import com.concretepage.wsdl.GetOwnerResponse;

public class OwnerClient extends WebServiceGatewaySupport  {
	public GetOwnerResponse getOwnerById(int ownerId) {
		GetOwnerRequest request = new GetOwnerRequest();
		request.setOwnerId(ownerId);
		GetOwnerResponse response = (GetOwnerResponse) getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://localhost:8080/spring4soap-1/soapws/getOwnerResponse"));
		return response;
	}
}
