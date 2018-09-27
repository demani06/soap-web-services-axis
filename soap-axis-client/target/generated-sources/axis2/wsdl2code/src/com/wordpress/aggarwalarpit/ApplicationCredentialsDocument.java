/*
 * An XML document type.
 * Localname: ApplicationCredentials
 * Namespace: https://aggarwalarpit.wordpress.com
 * Java type: com.wordpress.aggarwalarpit.ApplicationCredentialsDocument
 *
 * Automatically generated - do not modify.
 */
package com.wordpress.aggarwalarpit;


/**
 * A document containing one ApplicationCredentials(@https://aggarwalarpit.wordpress.com) element.
 *
 * This is a complex type.
 */
public interface ApplicationCredentialsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApplicationCredentialsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2BC491A4E8997E6EE634D49C602F90C3").resolveHandle("applicationcredentialse02edoctype");
    
    /**
     * Gets the "ApplicationCredentials" element
     */
    com.arpit.soap.server.service.ApplicationCredentials getApplicationCredentials();
    
    /**
     * Sets the "ApplicationCredentials" element
     */
    void setApplicationCredentials(com.arpit.soap.server.service.ApplicationCredentials applicationCredentials);
    
    /**
     * Appends and returns a new empty "ApplicationCredentials" element
     */
    com.arpit.soap.server.service.ApplicationCredentials addNewApplicationCredentials();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument newInstance() {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.wordpress.aggarwalarpit.ApplicationCredentialsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.wordpress.aggarwalarpit.ApplicationCredentialsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
