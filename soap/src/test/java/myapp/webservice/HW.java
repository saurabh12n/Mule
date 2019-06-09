package myapp.webservice;

import javax.jws.WebService;

@WebService
public class HW implements IHW {

	@Override
	public String helloWorldFunc(String name) {
		// TODO Auto-generated method stub
		return "Hello World "+name;
	}

}
