/**
 * FIAPServerStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package org.fiap.server;

import java.lang.reflect.Constructor;



/*
 *  FIAPServerStub java implementation
 */


public class FIAPServerStub extends org.apache.axis2.client.Stub {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap<?, ?> faultExceptionNameMap = new java.util.HashMap<>();
	private java.util.HashMap<?, ?> faultExceptionClassNameMap = new java.util.HashMap<>();
	private java.util.HashMap<?, ?> faultMessageMap = new java.util.HashMap<>();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
	}


	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service =
			new org.apache.axis2.description.AxisService("FIAPServer" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[2];

		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://soap.fiap.org/", "query"));
		_service.addOperation(__operation);



		_operations[0] = __operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://soap.fiap.org/", "data"));
		_service.addOperation(__operation);



		_operations[1] = __operation;


	}

	// populates the faults
	private void populateFaults() {



	}

	/**
	 * Constructor that takes in a configContext
	 */

	public FIAPServerStub(
		org.apache.axis2.context.ConfigurationContext configurationContext,
		java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}


	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public FIAPServerStub(
		org.apache.axis2.context.ConfigurationContext configurationContext,
		java.lang.String targetEndpoint, boolean useSeparateListener)
		throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient =
			new org.apache.axis2.client.ServiceClient(configurationContext, _service);


		_serviceClient.getOptions().setTo(
			new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);


	}

	/**
	 * Default Constructor
	 */
	public FIAPServerStub(org.apache.axis2.context.ConfigurationContext configurationContext)
		throws org.apache.axis2.AxisFault {

		this(configurationContext, "http://localhost/services/FIAPServer");

	}

	/**
	 * Default Constructor
	 */
	public FIAPServerStub() throws org.apache.axis2.AxisFault {

		this("http://localhost/services/FIAPServer");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public FIAPServerStub(java.lang.String targetEndpoint)
		throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}



	/**
	 * Auto generated method signature
	 *
	 * @see org.openhab.binding.IEEE1888.server.FIAPServer#query
	 * @param queryRQ24
	 */



	public org.fiap.soap.QueryRS query(

	org.fiap.soap.QueryRQ queryRQ24)


	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient =
				_serviceClient.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("http://soap.fiap.org/query");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env =
				toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					queryRQ24, optimizeContent(new javax.xml.namespace.QName(
						"http://soap.fiap.org/", "query")), new javax.xml.namespace.QName(
						"http://soap.fiap.org/", "query"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext =
				_operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object =
				fromOM(_returnEnv.getBody().getFirstElement(), org.fiap.soap.QueryRS.class,
					getEnvelopeNamespaces(_returnEnv));


			return (org.fiap.soap.QueryRS) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(
					faultElt.getQName(), "query"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName =
							(java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "query"));
						Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
						Constructor<?> constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex =
							(java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName =
							(java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "query"));
						Class<?> messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m =
							exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] {messageClass});
						m.invoke(ex, new java.lang.Object[] {messageObject});


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature
	 *
	 * @see org.openhab.binding.IEEE1888.server.FIAPServer#data
	 * @param dataRQ26
	 */



	public org.fiap.soap.DataRS data(

	org.fiap.soap.DataRQ dataRQ26)


	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient =
				_serviceClient.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("http://soap.fiap.org/data");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env =
				toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					dataRQ26, optimizeContent(new javax.xml.namespace.QName(
						"http://soap.fiap.org/", "data")), new javax.xml.namespace.QName(
						"http://soap.fiap.org/", "data"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext =
				_operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object =
				fromOM(_returnEnv.getBody().getFirstElement(), org.fiap.soap.DataRS.class,
					getEnvelopeNamespaces(_returnEnv));


			return (org.fiap.soap.DataRS) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(
					faultElt.getQName(), "data"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName =
							(java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "data"));
						Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
						Constructor<?> constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex =
							(java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName =
							(java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "data"));
						Class<?> messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m =
							exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] {messageClass});
						m.invoke(ex, new java.lang.Object[] {messageObject});


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}



	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map<String, String> getEnvelopeNamespaces(
		org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map<String, String> returnMap = new java.util.HashMap<String, String>();
		java.util.Iterator<?> namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns =
				(org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}



	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {


		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		org.apache.axiom.soap.SOAPFactory factory, org.fiap.soap.QueryRQ param,
		boolean optimizeContent, javax.xml.namespace.QName methodQName)
		throws org.apache.axis2.AxisFault {


		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
				param.getOMElement(org.fiap.soap.QueryRQ.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		org.apache.axiom.soap.SOAPFactory factory, org.fiap.soap.DataRQ param,
		boolean optimizeContent, javax.xml.namespace.QName methodQName)
		throws org.apache.axis2.AxisFault {


		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
				param.getOMElement(org.fiap.soap.DataRQ.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
		java.lang.Class<?> type, java.util.Map<String, String> extraNamespaces)
		throws org.apache.axis2.AxisFault {

		try {

			if (org.fiap.soap.QueryRQ.class.equals(type)) {

				return org.fiap.soap.QueryRQ.Factory.parse(param
					.getXMLStreamReaderWithoutCaching());


			}

			if (org.fiap.soap.QueryRS.class.equals(type)) {

				return org.fiap.soap.QueryRS.Factory.parse(param
					.getXMLStreamReaderWithoutCaching());


			}

			if (org.fiap.soap.DataRQ.class.equals(type)) {

				return org.fiap.soap.DataRQ.Factory.parse(param
					.getXMLStreamReaderWithoutCaching());


			}

			if (org.fiap.soap.DataRS.class.equals(type)) {

				return org.fiap.soap.DataRS.Factory.parse(param
					.getXMLStreamReaderWithoutCaching());


			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}



}
