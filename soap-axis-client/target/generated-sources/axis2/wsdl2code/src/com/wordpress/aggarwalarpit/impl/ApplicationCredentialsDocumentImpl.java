/*
 * An XML document type.
 * Localname: ApplicationCredentials
 * Namespace: https://aggarwalarpit.wordpress.com
 * Java type: com.wordpress.aggarwalarpit.ApplicationCredentialsDocument
 *
 * Automatically generated - do not modify.
 */
package com.wordpress.aggarwalarpit.impl;
/**
 * A document containing one ApplicationCredentials(@https://aggarwalarpit.wordpress.com) element.
 *
 * This is a complex type.
 */
public class ApplicationCredentialsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.wordpress.aggarwalarpit.ApplicationCredentialsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApplicationCredentialsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLICATIONCREDENTIALS$0 = 
        new javax.xml.namespace.QName("https://aggarwalarpit.wordpress.com", "ApplicationCredentials");
    
    
    /**
     * Gets the "ApplicationCredentials" element
     */
    public com.arpit.soap.server.service.ApplicationCredentials getApplicationCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.arpit.soap.server.service.ApplicationCredentials target = null;
            target = (com.arpit.soap.server.service.ApplicationCredentials)get_store().find_element_user(APPLICATIONCREDENTIALS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ApplicationCredentials" element
     */
    public void setApplicationCredentials(com.arpit.soap.server.service.ApplicationCredentials applicationCredentials)
    {
        generatedSetterHelperImpl(applicationCredentials, APPLICATIONCREDENTIALS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ApplicationCredentials" element
     */
    public com.arpit.soap.server.service.ApplicationCredentials addNewApplicationCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.arpit.soap.server.service.ApplicationCredentials target = null;
            target = (com.arpit.soap.server.service.ApplicationCredentials)get_store().add_element_user(APPLICATIONCREDENTIALS$0);
            return target;
        }
    }
}
