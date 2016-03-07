
/**
 * Key.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package org.fiap.types;
            

            /**
            *  Key bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Key
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = key
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

                        
                                    protected org.apache.axis2.databinding.types.URI localId ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.URI
                           */
                           public  org.apache.axis2.databinding.types.URI getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(org.apache.axis2.databinding.types.URI param){
                            
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for AttrName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localAttrName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAttrName(){
                               return localAttrName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AttrName
                               */
                               public void setAttrName(java.lang.String param){
                            
                                            this.localAttrName=param;
                                    

                               }
                            

                        /**
                        * field for Eq
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localEq ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEq(){
                               return localEq;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Eq
                               */
                               public void setEq(java.lang.String param){
                            
                                            this.localEq=param;
                                    

                               }
                            

                        /**
                        * field for Neq
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localNeq ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNeq(){
                               return localNeq;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Neq
                               */
                               public void setNeq(java.lang.String param){
                            
                                            this.localNeq=param;
                                    

                               }
                            

                        /**
                        * field for Lt
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localLt ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLt(){
                               return localLt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Lt
                               */
                               public void setLt(java.lang.String param){
                            
                                            this.localLt=param;
                                    

                               }
                            

                        /**
                        * field for Gt
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localGt ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGt(){
                               return localGt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Gt
                               */
                               public void setGt(java.lang.String param){
                            
                                            this.localGt=param;
                                    

                               }
                            

                        /**
                        * field for Lteq
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localLteq ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLteq(){
                               return localLteq;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Lteq
                               */
                               public void setLteq(java.lang.String param){
                            
                                            this.localLteq=param;
                                    

                               }
                            

                        /**
                        * field for Gteq
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localGteq ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGteq(){
                               return localGteq;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Gteq
                               */
                               public void setGteq(java.lang.String param){
                            
                                            this.localGteq=param;
                                    

                               }
                            

                        /**
                        * field for Select
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSelect ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSelect(){
                               return localSelect;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Select
                               */
                               public void setSelect(java.lang.String param){
                            
                                            this.localSelect=param;
                                    

                               }
                            

                        /**
                        * field for Trap
                        * This was an Attribute!
                        */

                        
                                    protected org.fiap.types.TrapType localTrap ;
                                

                           /**
                           * Auto generated getter method
                           * @return jp.gutp.fiap._2009._11.TrapType
                           */
                           public  org.fiap.types.TrapType getTrap(){
                               return localTrap;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Trap
                               */
                               public void setTrap(org.fiap.types.TrapType param){
                            
                                            this.localTrap=param;
                                    

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
                           namespacePrefix+":key",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "key",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localId != null){
                                        
                                                writeAttribute("",
                                                         "id",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localId is null");
                                      }
                                    
                                            if (localAttrName != null){
                                        
                                                writeAttribute("",
                                                         "attrName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttrName), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localAttrName is null");
                                      }
                                    
                                            if (localEq != null){
                                        
                                                writeAttribute("",
                                                         "eq",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEq), xmlWriter);

                                            
                                      }
                                    
                                            if (localNeq != null){
                                        
                                                writeAttribute("",
                                                         "neq",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNeq), xmlWriter);

                                            
                                      }
                                    
                                            if (localLt != null){
                                        
                                                writeAttribute("",
                                                         "lt",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLt), xmlWriter);

                                            
                                      }
                                    
                                            if (localGt != null){
                                        
                                                writeAttribute("",
                                                         "gt",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGt), xmlWriter);

                                            
                                      }
                                    
                                            if (localLteq != null){
                                        
                                                writeAttribute("",
                                                         "lteq",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLteq), xmlWriter);

                                            
                                      }
                                    
                                            if (localGteq != null){
                                        
                                                writeAttribute("",
                                                         "gteq",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGteq), xmlWriter);

                                            
                                      }
                                    
                                            if (localSelect != null){
                                        
                                                writeAttribute("",
                                                         "select",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSelect), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localTrap != null){
                                        writeAttribute("",
                                           "trap",
                                           localTrap.toString(), xmlWriter);
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
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","attrName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttrName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","eq"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEq));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","neq"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNeq));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","lt"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLt));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","gt"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGt));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","lteq"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLteq));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","gteq"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGteq));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","select"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSelect));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","trap"));
                            
                                      attribList.add(localTrap.toString());
                                

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
        public static Key parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Key object =
                new Key();

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
                    
                            if (!"key".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Key)org.fiap.types.ExtensionMapper.getTypeObject(
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
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToAnyURI(tempAttribId));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute id is missing");
                           
                    }
                    handledAttributes.add("id");
                    
                    // handle attribute "attrName"
                    java.lang.String tempAttribAttrName =
                        
                                reader.getAttributeValue(null,"attrName");
                            
                   if (tempAttribAttrName!=null){
                         java.lang.String content = tempAttribAttrName;
                        
                                                 object.setAttrName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAttrName));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute attrName is missing");
                           
                    }
                    handledAttributes.add("attrName");
                    
                    // handle attribute "eq"
                    java.lang.String tempAttribEq =
                        
                                reader.getAttributeValue(null,"eq");
                            
                   if (tempAttribEq!=null){
                         java.lang.String content = tempAttribEq;
                        
                                                 object.setEq(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribEq));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("eq");
                    
                    // handle attribute "neq"
                    java.lang.String tempAttribNeq =
                        
                                reader.getAttributeValue(null,"neq");
                            
                   if (tempAttribNeq!=null){
                         java.lang.String content = tempAttribNeq;
                        
                                                 object.setNeq(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribNeq));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("neq");
                    
                    // handle attribute "lt"
                    java.lang.String tempAttribLt =
                        
                                reader.getAttributeValue(null,"lt");
                            
                   if (tempAttribLt!=null){
                         java.lang.String content = tempAttribLt;
                        
                                                 object.setLt(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribLt));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("lt");
                    
                    // handle attribute "gt"
                    java.lang.String tempAttribGt =
                        
                                reader.getAttributeValue(null,"gt");
                            
                   if (tempAttribGt!=null){
                         java.lang.String content = tempAttribGt;
                        
                                                 object.setGt(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribGt));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("gt");
                    
                    // handle attribute "lteq"
                    java.lang.String tempAttribLteq =
                        
                                reader.getAttributeValue(null,"lteq");
                            
                   if (tempAttribLteq!=null){
                         java.lang.String content = tempAttribLteq;
                        
                                                 object.setLteq(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribLteq));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("lteq");
                    
                    // handle attribute "gteq"
                    java.lang.String tempAttribGteq =
                        
                                reader.getAttributeValue(null,"gteq");
                            
                   if (tempAttribGteq!=null){
                         java.lang.String content = tempAttribGteq;
                        
                                                 object.setGteq(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribGteq));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("gteq");
                    
                    // handle attribute "select"
                    java.lang.String tempAttribSelect =
                        
                                reader.getAttributeValue(null,"select");
                            
                   if (tempAttribSelect!=null){
                         java.lang.String content = tempAttribSelect;
                        
                                                 object.setSelect(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSelect));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("select");
                    
                    // handle attribute "trap"
                    java.lang.String tempAttribTrap =
                        
                                reader.getAttributeValue(null,"trap");
                            
                   if (tempAttribTrap!=null){
                         java.lang.String content = tempAttribTrap;
                        
                                                  object.setTrap(
                                                        org.fiap.types.TrapType.Factory.fromString(reader,tempAttribTrap));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("trap");
                    
                    
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
           
    