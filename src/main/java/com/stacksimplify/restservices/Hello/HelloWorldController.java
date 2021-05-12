package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	//@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	@GetMapping("Helloworld1")
	public String HelloWorld()
	{
		return "Hello world";
	}
	
	@RequestMapping(method=RequestMethod.GET,path="helloworld-bean")
	public UserDetails helloWorldBean()
	{
		return new UserDetails("Amith","Gupta","Hyderabad");
	}

}
