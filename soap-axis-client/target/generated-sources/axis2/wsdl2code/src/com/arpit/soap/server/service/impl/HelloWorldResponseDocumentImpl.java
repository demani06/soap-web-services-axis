/*
 * An XML document type.
 * Localname: helloWorldResponse
 * Namespace: http://service.server.soap.arpit.com/
 * Java type: com.arpit.soap.server.service.HelloWorldResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.arpit.soap.server.service.impl;
/**
 * A document containing one helloWorldResponse(@http://service.server.soap.arpit.com/) element.
 *
 * This is a complex type.
 */
public class HelloWorldResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.arpit.soap.server.service.HelloWorldResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelloWorldResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELLOWORLDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://service.server.soap.arpit.com/", "helloWorldResponse");
    
    
    /**
     * Gets the "helloWorldResponse" element
     */
    public com.arpit.soap.server.service.HelloWorldResponse getHelloWorldResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.arpit.soap.server.service.HelloWorldResponse target = null;
            target = (com.arpit.soap.server.service.HelloWorldResponse)get_store().find_element_user(HELLOWORLDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "helloWorldResponse" element
     */
    public void setHelloWorldResponse(com.arpit.soap.server.service.HelloWorldResponse helloWorldResponse)
    {
        generatedSetterHelperImpl(helloWorldResponse, HELLOWORLDRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "helloWorldResponse" element
     */
    public com.arpit.soap.server.service.HelloWorldResponse addNewHelloWorldResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.arpit.soap.server.service.HelloWorldResponse target = null;
            target = (com.arpit.soap.server.service.HelloWorldResponse)get_store().add_element_user(HELLOWORLDRESPONSE$0);
            return target;
        }
    }
}
