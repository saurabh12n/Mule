package myapp.webservice;

import javax.jws.WebService;

@WebService
public class HelloWorldService implements IHelloWorldService  {

	@Override
	public String helloWorldFunc(String name) {
		// TODO Auto-generated method stub
		return "Hello World" + name;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
