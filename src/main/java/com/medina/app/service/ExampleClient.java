package com.medina.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("exampleclient")
public class ExampleClient {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> sayHelloClient() {
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/rest/example")
				.request()
				.get(Response.class);
		System.out.println("RESPONSE STATUS: " + response.getStatus());
		//if (response.getStatus() == 200) {
		List<String> list = response.readEntity(new GenericType<List<String>>(){});
		return list;
		/*} else {
			return new ArrayList<String>();
		}*/
	}

}

