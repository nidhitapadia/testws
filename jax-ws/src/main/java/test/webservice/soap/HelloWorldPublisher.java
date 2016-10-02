package test.webservice.soap;

import test.webservice.soap.document.HelloWorldDocumentImpl;
import test.webservice.soap.rpc.HelloWorldRPCImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by nidhitapadia on 02/01/16.
 */
public class HelloWorldPublisher {
    public static void main(String args[]){
        Endpoint.publish("http://localhost:7779/ws/hellorpc", new HelloWorldRPCImpl());
        Endpoint.publish("http://localhost:7779/ws/hellodocument", new HelloWorldDocumentImpl());
    }
}
