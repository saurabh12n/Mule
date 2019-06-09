package myapp.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IHelloWorldService {
@WebMethod
String helloWorldFunc(String name);
int add(int a , int b);
}
