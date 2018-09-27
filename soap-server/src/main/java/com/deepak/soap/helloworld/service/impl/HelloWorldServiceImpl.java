package com.deepak.soap.helloworld.service.impl;

import javax.jws.WebService;

import com.deepak.soap.helloworld.model.ApplicationCredentials;
import com.deepak.soap.helloworld.service.HelloWorldService;

@WebService(endpointInterface = "HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String helloWorld(final String name,
			final ApplicationCredentials credential) {
		System.out.println("--------------Helloworld called");
		System.out.println("--------------Helloworld called--- with parameter {}"+name);
		return "Hello World from " + name;
	}
}
