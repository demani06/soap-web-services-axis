/*
 * An XML document type.
 * Localname: helloWorld
 * Namespace: http://service.server.soap.arpit.com/
 * Java type: com.arpit.soap.server.service.HelloWorldDocument
 *
 * Automatically generated - do not modify.
 */
package com.arpit.soap.server.service.impl;
/**
 * A document containing one helloWorld(@http://service.server.soap.arpit.com/) element.
 *
 * This is a complex type.
 */
public class HelloWorldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.arpit.soap.server.service.HelloWorldDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelloWorldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELLOWORLD$0 = 
        new javax.xml.namespace.QName("http://service.server.soap.arpit.com/", "helloWorld");
    
    
    /**
     * Gets the "helloWorld" element
     */
    public com.arpit.soap.server.service.HelloWorld getHelloWorld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.arpit.soap.server.service.HelloWorld target = null;
            target = (com.arpit.soap.server.service.HelloWorld)get_store().find_element_user(HELLOWORLD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "helloWorld" element
     */
    public void setHelloWorld(com.arpit.soap.server.service.HelloWorld helloWorld)
    {
        generatedSetterHelperImpl(helloWorld, HELLOWORLD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "helloWorld" element
     */
    public com.arpit.soap.server.service.HelloWorld addNewHelloWorld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.arpit.soap.server.service.HelloWorld target = null;
            target = (com.arpit.soap.server.service.HelloWorld)get_store().add_element_user(HELLOWORLD$0);
            return target;
        }
    }
}
