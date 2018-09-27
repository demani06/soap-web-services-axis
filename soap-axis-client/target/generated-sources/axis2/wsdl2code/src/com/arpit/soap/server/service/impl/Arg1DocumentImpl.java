/*
 * An XML document type.
 * Localname: arg1
 * Namespace: http://service.server.soap.arpit.com/
 * Java type: com.arpit.soap.server.service.Arg1Document
 *
 * Automatically generated - do not modify.
 */
package com.arpit.soap.server.service.impl;
/**
 * A document containing one arg1(@http://service.server.soap.arpit.com/) element.
 *
 * This is a complex type.
 */
public class Arg1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.arpit.soap.server.service.Arg1Document
{
    private static final long serialVersionUID = 1L;
    
    public Arg1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARG1$0 = 
        new javax.xml.namespace.QName("http://service.server.soap.arpit.com/", "arg1");
    
    
    /**
     * Gets the "arg1" element
     */
    public com.arpit.soap.server.service.ApplicationCredentials getArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.arpit.soap.server.service.ApplicationCredentials target = null;
            target = (com.arpit.soap.server.service.ApplicationCredentials)get_store().find_element_user(ARG1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "arg1" element
     */
    public boolean isNilArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.arpit.soap.server.service.ApplicationCredentials target = null;
            target = (com.arpit.soap.server.service.ApplicationCredentials)get_store().find_element_user(ARG1$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "arg1" element
     */
    public void setArg1(com.arpit.soap.server.service.ApplicationCredentials arg1)
    {
        generatedSetterHelperImpl(arg1, ARG1$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "arg1" element
     */
    public com.arpit.soap.server.service.ApplicationCredentials addNewArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.arpit.soap.server.service.ApplicationCredentials target = null;
            target = (com.arpit.soap.server.service.ApplicationCredentials)get_store().add_element_user(ARG1$0);
            return target;
        }
    }
    
    /**
     * Nils the "arg1" element
     */
    public void setNilArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.arpit.soap.server.service.ApplicationCredentials target = null;
            target = (com.arpit.soap.server.service.ApplicationCredentials)get_store().find_element_user(ARG1$0, 0);
            if (target == null)
            {
                target = (com.arpit.soap.server.service.ApplicationCredentials)get_store().add_element_user(ARG1$0);
            }
            target.setNil();
        }
    }
}
