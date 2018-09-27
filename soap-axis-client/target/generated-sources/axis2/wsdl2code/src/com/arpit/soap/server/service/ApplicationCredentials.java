/*
 * XML Type:  applicationCredentials
 * Namespace: http://service.server.soap.arpit.com/
 * Java type: com.arpit.soap.server.service.ApplicationCredentials
 *
 * Automatically generated - do not modify.
 */
package com.arpit.soap.server.service;


/**
 * An XML applicationCredentials(@http://service.server.soap.arpit.com/).
 *
 * This is a complex type.
 */
public interface ApplicationCredentials extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApplicationCredentials.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2BC491A4E8997E6EE634D49C602F90C3").resolveHandle("applicationcredentials1f2atype");
    
    /**
     * Gets the "userId" element
     */
    java.lang.String getUserId();
    
    /**
     * Gets (as xml) the "userId" element
     */
    org.apache.xmlbeans.XmlString xgetUserId();
    
    /**
     * Sets the "userId" element
     */
    void setUserId(java.lang.String userId);
    
    /**
     * Sets (as xml) the "userId" element
     */
    void xsetUserId(org.apache.xmlbeans.XmlString userId);
    
    /**
     * Gets the "password" element
     */
    java.lang.String getPassword();
    
    /**
     * Gets (as xml) the "password" element
     */
    org.apache.xmlbeans.XmlString xgetPassword();
    
    /**
     * Sets the "password" element
     */
    void setPassword(java.lang.String password);
    
    /**
     * Sets (as xml) the "password" element
     */
    void xsetPassword(org.apache.xmlbeans.XmlString password);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.arpit.soap.server.service.ApplicationCredentials newInstance() {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.arpit.soap.server.service.ApplicationCredentials parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.arpit.soap.server.service.ApplicationCredentials parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.arpit.soap.server.service.ApplicationCredentials parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.arpit.soap.server.service.ApplicationCredentials parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.arpit.soap.server.service.ApplicationCredentials parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.arpit.soap.server.service.ApplicationCredentials) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
