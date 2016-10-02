package test.webservice.soap.rpc.client;

import test.webservice.soap.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by nidhitapadia on 03/01/16.
 */
public class HelloWorldClient {
    public static void main(String args[]) {

        try {
            URL urlRpc = new URL("http://localhost:7779/ws/hellorpc?wsdl");
            URL urlDoc = new URL("http://localhost:7779/ws/hellodocument?wsdl");
            QName qNameRpc = new QName("http://rpc.soap.webservice.test/", "HelloWorldRPCImplService");
            QName qNameDoc = new QName("http://document.soap.webservice.test/", "HelloWorldDocumentImplService");
            Service serviceRpc = Service.create(urlRpc, qNameRpc);
            Service serviceDoc = Service.create(urlDoc, qNameDoc);
            HelloWorld helloRpc = serviceRpc.getPort(HelloWorld.class);
            HelloWorld helloDoc = serviceDoc.getPort(HelloWorld.class);
            System.out.println(helloRpc.getHelloWorldAsString("test rpc"));
            System.out.println(helloDoc.getHelloWorldAsString("test document"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
