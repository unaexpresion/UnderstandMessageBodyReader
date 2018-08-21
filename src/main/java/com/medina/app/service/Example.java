package com.medina.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("example")
public class Example {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> sayHello() {
		List<String> list = new ArrayList<String>();
		list.add("uno");
		list.add("dos");
		list.add("tres");
		//return list;
		throw new NullPointerException();
	}

}
