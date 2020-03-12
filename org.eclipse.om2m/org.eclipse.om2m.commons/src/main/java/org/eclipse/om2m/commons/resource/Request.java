/*******************************************************************************
 * Copyright (c) 2013-2016 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial Contributors:
 *     Thierry Monteil : Project manager, technical co-manager
 *     Mahdi Ben Alaya : Technical co-manager
 *     Samir Medjiah : Technical co-manager
 *     Khalil Drira : Strategy expert
 *     Guillaume Garzone : Developer
 *     François Aïssaoui : Developer
 *
 * New contributors :
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 03:56:27 PM CEST 
//

package org.eclipse.om2m.commons.resource;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.om2m.commons.constants.ShortName;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}regularResource">
 *       &lt;sequence>
 *         &lt;element name="stateTag" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation"/>
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="originator" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="requestID" type="{http://www.onem2m.org/xml/protocols}requestID"/>
 *         &lt;element name="metaInformation" type="{http://www.onem2m.org/xml/protocols}metaInformation"/>
 *         &lt;element name="content" type="{http://www.onem2m.org/xml/protocols}primitiveContent"/>
 *         &lt;element name="requestStatus" type="{http://www.onem2m.org/xml/protocols}requestStatus"/>
 *         &lt;element name="operationResult" type="{http://www.onem2m.org/xml/protocols}operationResult"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ShortName.REQ)
@XmlRootElement(name = ShortName.REQ)
public class Request extends RegularResource {

	@XmlElement(required = true, name = ShortName.STATETAG)
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger stateTag;
	@XmlElement(required = true, name = ShortName.OPERATION)
	protected BigInteger operation;
	@XmlElement(required = true, name = ShortName.TARGET)
	@XmlSchemaType(name = "anyURI")
	protected String target;
	@XmlElement(required = true, name = ShortName.ORIGINATOR)
	protected String originator;
	@XmlElement(required = true, name = ShortName.REQUEST_ID)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String requestID;
	@XmlElement(required = true, name = ShortName.META_INFORMATION)
	protected MetaInformation metaInformation;
	@XmlElement(required = true, name = ShortName.REQUEST_CONTENT)
	protected PrimitiveContent content;
	@XmlElement(required = true, name = ShortName.REQUEST_STATUS)
	protected BigInteger requestStatus;
	@XmlElement(required = true, name = ShortName.OPERATION_RESULT)
	protected OperationResult operationResult;
	@XmlElement(name = ShortName.CHILD_RESOURCE)
	protected List<ChildResourceRef> childResource;
	@XmlElement(namespace = "http://www.onem2m.org/xml/protocols", name = ShortName.SUB)
	protected List<Subscription> subscription;

	/**
	 * Gets the value of the stateTag property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getStateTag() {
		return stateTag;
	}

	/**
	 * Sets the value of the stateTag property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setStateTag(BigInteger value) {
		this.stateTag = value;
	}

	/**
	 * Gets the value of the operation property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getOperation() {
		return operation;
	}

	/**
	 * Sets the value of the operation property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setOperation(BigInteger value) {
		this.operation = value;
	}

	/**
	 * Gets the value of the target property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * Sets the value of the target property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTarget(String value) {
		this.target = value;
	}

	/**
	 * Gets the value of the originator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginator() {
		return originator;
	}

	/**
	 * Sets the value of the originator property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginator(String value) {
		this.originator = value;
	}

	/**
	 * Gets the value of the requestID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestID() {
		return requestID;
	}

	/**
	 * Sets the value of the requestID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestID(String value) {
		this.requestID = value;
	}

	/**
	 * Gets the value of the metaInformation property.
	 * 
	 * @return possible object is {@link MetaInformation }
	 * 
	 */
	public MetaInformation getMetaInformation() {
		return metaInformation;
	}

	/**
	 * Sets the value of the metaInformation property.
	 * 
	 * @param value
	 *            allowed object is {@link MetaInformation }
	 * 
	 */
	public void setMetaInformation(MetaInformation value) {
		this.metaInformation = value;
	}

	/**
	 * Gets the value of the content property.
	 * 
	 * @return possible object is {@link PrimitiveContent }
	 * 
	 */
	public PrimitiveContent getContent() {
		return content;
	}

	/**
	 * Sets the value of the content property.
	 * 
	 * @param value
	 *            allowed object is {@link PrimitiveContent }
	 * 
	 */
	public void setContent(PrimitiveContent value) {
		this.content = value;
	}

	/**
	 * Gets the value of the requestStatus property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getRequestStatus() {
		return requestStatus;
	}

	/**
	 * Sets the value of the requestStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setRequestStatus(BigInteger value) {
		this.requestStatus = value;
	}

	/**
	 * Gets the value of the operationResult property.
	 * 
	 * @return possible object is {@link OperationResult }
	 * 
	 */
	public OperationResult getOperationResult() {
		return operationResult;
	}

	/**
	 * Sets the value of the operationResult property.
	 * 
	 * @param value
	 *            allowed object is {@link OperationResult }
	 * 
	 */
	public void setOperationResult(OperationResult value) {
		this.operationResult = value;
	}

	/**
	 * Gets the value of the childResource property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the childResource property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getChildResource().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ChildResourceRef }
	 * 
	 * 
	 */
	public List<ChildResourceRef> getChildResource() {
		if (childResource == null) {
			childResource = new ArrayList<ChildResourceRef>();
		}
		return this.childResource;
	}

	/**
	 * Gets the value of the subscription property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the subscription property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSubscription().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Subscription }
	 * 
	 * 
	 */
	public List<Subscription> getSubscription() {
		if (subscription == null) {
			subscription = new ArrayList<Subscription>();
		}
		return this.subscription;
	}

}
