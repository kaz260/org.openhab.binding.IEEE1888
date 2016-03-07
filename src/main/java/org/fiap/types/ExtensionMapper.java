
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.fiap.types;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "queryType".equals(typeName)){
                   
                            return  org.fiap.types.QueryType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "point".equals(typeName)){
                   
                            return  org.fiap.types.Point.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "uuid".equals(typeName)){
                   
                            return  org.fiap.types.Uuid.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "error".equals(typeName)){
                   
                            return  org.fiap.types.Error.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "body".equals(typeName)){
                   
                            return  org.fiap.types.Body.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "transport".equals(typeName)){
                   
                            return  org.fiap.types.Transport.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "query".equals(typeName)){
                   
                            return  org.fiap.types.Query.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "trapType".equals(typeName)){
                   
                            return  org.fiap.types.TrapType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "key".equals(typeName)){
                   
                            return  org.fiap.types.Key.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "value".equals(typeName)){
                   
                            return  org.fiap.types.Value.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "OK".equals(typeName)){
                   
                            return  org.fiap.types.OK.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "pointSet".equals(typeName)){
                   
                            return  org.fiap.types.PointSet.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://gutp.jp/fiap/2009/11/".equals(namespaceURI) &&
                  "header".equals(typeName)){
                   
                            return  org.fiap.types.Header.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    