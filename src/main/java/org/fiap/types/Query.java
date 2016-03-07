
/**
 * Query.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package org.fiap.types;
            

            /**
            *  Query bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Query
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = query
                Namespace URI = http://gutp.jp/fiap/2009/11/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Key
                        * This was an Array!
                        */

                        
                                    protected org.fiap.types.Key[] localKey ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeyTracker = false ;

                           public boolean isKeySpecified(){
                               return localKeyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return jp.gutp.fiap._2009._11.Key[]
                           */
                           public  org.fiap.types.Key[] getKey(){
                               return localKey;
                           }

                           
                        


                               
                              /**
                               * validate the array for Key
                               */
                              protected void validateKey(org.fiap.types.Key[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Key
                              */
                              public void setKey(org.fiap.types.Key[] param){
                              
                                   validateKey(param);

                               localKeyTracker = param != null;
                                      
                                      this.localKey=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param jp.gutp.fiap._2009._11.Key
                             */
                             public void addKey(org.fiap.types.Key param){
                                   if (localKey == null){
                                   localKey = new org.fiap.types.Key[]{};
                                   }

                            
                                 //update the setting tracker
                                localKeyTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localKey);
                               list.add(param);
                               this.localKey =
                             (org.fiap.types.Key[])list.toArray(
                            new org.fiap.types.Key[list.size()]);

                             }
                             

                        /**
                        * field for Id
                        * This was an Attribute!
                        */

                        
                                    protected org.fiap.types.Uuid localId ;
                                

                           /**
                           * Auto generated getter method
                           * @return jp.gutp.fiap._2009._11.Uuid
                           */
                           public  org.fiap.types.Uuid getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(org.fiap.types.Uuid param){
                            
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for Type
                        * This was an Attribute!
                        */

                        
                                    protected org.fiap.types.QueryType localType ;
                                

                           /**
                           * Auto generated getter method
                           * @return jp.gutp.fiap._2009._11.QueryType
                           */
                           public  org.fiap.types.QueryType getType(){
                               return localType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Type
                               */
                               public void setType(org.fiap.types.QueryType param){
                            
                                            this.localType=param;
                                    

                               }
                            

                        /**
                        * field for Cursor
                        * This was an Attribute!
                        */

                        
                                    protected org.fiap.types.Uuid localCursor ;
                                

                           /**
                           * Auto generated getter method
                           * @return jp.gutp.fiap._2009._11.Uuid
                           */
                           public  org.fiap.types.Uuid getCursor(){
                               return localCursor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cursor
                               */
                               public void setCursor(org.fiap.types.Uuid param){
                            
                                            this.localCursor=param;
                                    

                               }
                            

                        /**
                        * field for Ttl
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localTtl ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getTtl(){
                               return localTtl;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ttl
                               */
                               public void setTtl(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localTtl=param;
                                    

                               }
                            

                        /**
                        * field for AcceptableSize
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.PositiveInteger localAcceptableSize ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.PositiveInteger
                           */
                           public  org.apache.axis2.databinding.types.PositiveInteger getAcceptableSize(){
                               return localAcceptableSize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AcceptableSize
                               */
                               public void setAcceptableSize(org.apache.axis2.databinding.types.PositiveInteger param){
                            
                                            this.localAcceptableSize=param;
                                    

                               }
                            

                        /**
                        * field for CallbackData
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.URI localCallbackData ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.URI
                           */
                           public  org.apache.axis2.databinding.types.URI getCallbackData(){
                               return localCallbackData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CallbackData
                               */
                               public void setCallbackData(org.apache.axis2.databinding.types.URI param){
                            
                                            this.localCallbackData=param;
                                    

                               }
                            

                        /**
                        * field for CallbackControl
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.URI localCallbackControl ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.URI
                           */
                           public  org.apache.axis2.databinding.types.URI getCallbackControl(){
                               return localCallbackControl;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CallbackControl
                               */
                               public void setCallbackControl(org.apache.axis2.databinding.types.URI param){
                            
                                            this.localCallbackControl=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://gutp.jp/fiap/2009/11/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":query",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "query",
                           xmlWriter);
                   }

               
                   }
               
                                    
                                    if (localId != null){
                                        writeAttribute("",
                                           "id",
                                           localId.toString(), xmlWriter);
                                    }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localId is null");
                                      }
                                    
                                    
                                    if (localType != null){
                                        writeAttribute("",
                                           "type",
                                           localType.toString(), xmlWriter);
                                    }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localType is null");
                                      }
                                    
                                    
                                    if (localCursor != null){
                                        writeAttribute("",
                                           "cursor",
                                           localCursor.toString(), xmlWriter);
                                    }
                                    
                                            if (localTtl != null){
                                        
                                                writeAttribute("",
                                                         "ttl",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTtl), xmlWriter);

                                            
                                      }
                                    
                                            if (localAcceptableSize != null){
                                        
                                                writeAttribute("",
                                                         "acceptableSize",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAcceptableSize), xmlWriter);

                                            
                                      }
                                    
                                            if (localCallbackData != null){
                                        
                                                writeAttribute("",
                                                         "callbackData",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCallbackData), xmlWriter);

                                            
                                      }
                                    
                                            if (localCallbackControl != null){
                                        
                                                writeAttribute("",
                                                         "callbackControl",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCallbackControl), xmlWriter);

                                            
                                      }
                                     if (localKeyTracker){
                                       if (localKey!=null){
                                            for (int i = 0;i < localKey.length;i++){
                                                if (localKey[i] != null){
                                                 localKey[i].serialize(new javax.xml.namespace.QName("http://gutp.jp/fiap/2009/11/","key"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("key cannot be null!!");
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://gutp.jp/fiap/2009/11/")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localKeyTracker){
                             if (localKey!=null) {
                                 for (int i = 0;i < localKey.length;i++){

                                    if (localKey[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://gutp.jp/fiap/2009/11/",
                                                                          "key"));
                                         elementList.add(localKey[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("key cannot be null!!");
                                    
                             }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","id"));
                            
                                      attribList.add(localId.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","type"));
                            
                                      attribList.add(localType.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","cursor"));
                            
                                      attribList.add(localCursor.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ttl"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTtl));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","acceptableSize"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAcceptableSize));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","callbackData"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCallbackData));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","callbackControl"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCallbackControl));
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static Query parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Query object =
                new Query();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"query".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Query)org.fiap.types.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "id"
                    java.lang.String tempAttribId =
                        
                                reader.getAttributeValue(null,"id");
                            
                   if (tempAttribId!=null){
                         java.lang.String content = tempAttribId;
                        
                                                  object.setId(
                                                        org.fiap.types.Uuid.Factory.fromString(reader,tempAttribId));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute id is missing");
                           
                    }
                    handledAttributes.add("id");
                    
                    // handle attribute "type"
                    java.lang.String tempAttribType =
                        
                                reader.getAttributeValue(null,"type");
                            
                   if (tempAttribType!=null){
                         java.lang.String content = tempAttribType;
                        
                                                  object.setType(
                                                        org.fiap.types.QueryType.Factory.fromString(reader,tempAttribType));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute type is missing");
                           
                    }
                    handledAttributes.add("type");
                    
                    // handle attribute "cursor"
                    java.lang.String tempAttribCursor =
                        
                                reader.getAttributeValue(null,"cursor");
                            
                   if (tempAttribCursor!=null){
                         java.lang.String content = tempAttribCursor;
                        
                                                  object.setCursor(
                                                        org.fiap.types.Uuid.Factory.fromString(reader,tempAttribCursor));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("cursor");
                    
                    // handle attribute "ttl"
                    java.lang.String tempAttribTtl =
                        
                                reader.getAttributeValue(null,"ttl");
                            
                   if (tempAttribTtl!=null){
                         java.lang.String content = tempAttribTtl;
                        
                                                 object.setTtl(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribTtl));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ttl");
                    
                    // handle attribute "acceptableSize"
                    java.lang.String tempAttribAcceptableSize =
                        
                                reader.getAttributeValue(null,"acceptableSize");
                            
                   if (tempAttribAcceptableSize!=null){
                         java.lang.String content = tempAttribAcceptableSize;
                        
                                                 object.setAcceptableSize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToPositiveInteger(tempAttribAcceptableSize));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("acceptableSize");
                    
                    // handle attribute "callbackData"
                    java.lang.String tempAttribCallbackData =
                        
                                reader.getAttributeValue(null,"callbackData");
                            
                   if (tempAttribCallbackData!=null){
                         java.lang.String content = tempAttribCallbackData;
                        
                                                 object.setCallbackData(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToAnyURI(tempAttribCallbackData));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("callbackData");
                    
                    // handle attribute "callbackControl"
                    java.lang.String tempAttribCallbackControl =
                        
                                reader.getAttributeValue(null,"callbackControl");
                            
                   if (tempAttribCallbackControl!=null){
                         java.lang.String content = tempAttribCallbackControl;
                        
                                                 object.setCallbackControl(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToAnyURI(tempAttribCallbackControl));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("callbackControl");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://gutp.jp/fiap/2009/11/","key").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(org.fiap.types.Key.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://gutp.jp/fiap/2009/11/","key").equals(reader.getName())){
                                                                    list1.add(org.fiap.types.Key.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setKey((org.fiap.types.Key[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.fiap.types.Key.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    