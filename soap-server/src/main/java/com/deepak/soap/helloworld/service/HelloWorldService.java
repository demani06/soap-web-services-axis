package com.deepak.soap.helloworld.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.deepak.soap.helloworld.model.ApplicationCredentials;

@WebService
public interface HelloWorldService {

	@WebMethod(operationName = "helloWorld", action = "https://namespace.test.deepak/hello-world/helloWorld")
	String helloWorld(final String name,
			@WebParam(header = true) final ApplicationCredentials credential);

}
