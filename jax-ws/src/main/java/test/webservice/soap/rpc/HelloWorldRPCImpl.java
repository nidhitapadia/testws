package test.webservice.soap.rpc;

import test.webservice.soap.HelloWorld;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by nidhitapadia on 02/01/16.
 */
//Service Implementation
@WebService(endpointInterface = "test.webservice.soap.HelloWorld")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloWorldRPCImpl implements HelloWorld {
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS (RPC) " +name;
    }
}
