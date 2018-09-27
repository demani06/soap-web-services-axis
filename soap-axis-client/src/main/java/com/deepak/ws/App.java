package com.deepak.ws;

import com.arpit.soap.server.service.*;
import com.generated.axis2.HelloWorldServiceImplServiceStub;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        try {
            HelloWorldServiceImplServiceStub stub = new HelloWorldServiceImplServiceStub();
            HelloWorldDocument document = HelloWorldDocument.Factory.newInstance();
            HelloWorld helloWorld = HelloWorld.Factory.newInstance();
            helloWorld.setArg0("Vasudevan");
            document.setHelloWorld(helloWorld);

            Arg1Document arg1Document = Arg1Document.Factory.newInstance();
            ApplicationCredentials credentials = ApplicationCredentials.Factory.newInstance();
            credentials.setUserId("Deepak");
            credentials.setPassword("Deepak");
            arg1Document.setArg1(credentials);
            //Arg1Document arg1Document = Arg1Document.Factory.newInstance();
            HelloWorldResponseDocument response = stub.helloWorld(document,arg1Document);
            System.out.println("response="+response);
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
