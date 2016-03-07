/**
 * FIAPServerMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package org.fiap.server;

import org.openhab.binding.IEEE1888.internal.IEEE1888Binding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FIAPServerMessageReceiverInOut message receiver
 */
public class FIAPServerMessageReceiverInOut extends
	org.apache.axis2.receivers.AbstractInOutMessageReceiver {

	public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext,
		org.apache.axis2.context.MessageContext newMsgContext)
		throws org.apache.axis2.AxisFault {
		Logger logger = LoggerFactory.getLogger(IEEE1888Binding.class);
		try {
			//Logger logger = LoggerFactory.getLogger(IEEE1888Binding.class);
			logger.debug("received message: " + msgContext.getEnvelope().toString());
		} catch (Exception e) {
		}
		try {
			
			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(msgContext);

			FIAPServerInterface skel = (FIAPServerInterface) obj;
			// Out Envelop
			org.apache.axiom.soap.SOAPEnvelope envelope = null;
			// Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op =
				msgContext.getOperationContext().getAxisOperation();
			if (op == null) {
				throw new org.apache.axis2.AxisFault(
					"Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
			}

			java.lang.String methodName;
			if ((op.getName() != null)
				&& ((methodName =
					org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName()
						.getLocalPart())) != null)) {



				if ("query".equals(methodName)) {
					org.fiap.soap.QueryRS queryRS13 = null;
					org.fiap.soap.QueryRQ wrappedParam =
						(org.fiap.soap.QueryRQ) fromOM(msgContext.getEnvelope().getBody()
							.getFirstElement(), org.fiap.soap.QueryRQ.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					queryRS13 =


					skel.query(wrappedParam);

					envelope =
						toEnvelope(getSOAPFactory(msgContext), queryRS13, false,
							new javax.xml.namespace.QName("http://soap.fiap.org/", "query"));
				} else

				if ("data".equals(methodName)) {
					org.fiap.soap.DataRS dataRS15 = null;
					org.fiap.soap.DataRQ wrappedParam =
						(org.fiap.soap.DataRQ) fromOM(msgContext.getEnvelope().getBody()
							.getFirstElement(), org.fiap.soap.DataRQ.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					dataRS15 =


					skel.data(wrappedParam);

					envelope =
						toEnvelope(getSOAPFactory(msgContext), dataRS15, false,
							new javax.xml.namespace.QName("http://soap.fiap.org/", "data"));

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

				newMsgContext.setEnvelope(envelope);
			}
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		org.apache.axiom.soap.SOAPFactory factory, org.fiap.soap.QueryRS param,
		boolean optimizeContent, javax.xml.namespace.QName methodQName)
		throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
				param.getOMElement(org.fiap.soap.QueryRS.MY_QNAME, factory));


			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		org.apache.axiom.soap.SOAPFactory factory, org.fiap.soap.DataRS param,
		boolean optimizeContent, javax.xml.namespace.QName methodQName)
		throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
				param.getOMElement(org.fiap.soap.DataRS.MY_QNAME, factory));


			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

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

}// end of class
