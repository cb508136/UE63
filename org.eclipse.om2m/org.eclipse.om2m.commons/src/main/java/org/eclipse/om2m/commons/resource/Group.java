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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableResource">
 *       &lt;sequence>
 *         &lt;element name="creator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="memberType" type="{http://www.onem2m.org/xml/protocols}memberType"/>
 *         &lt;element name="currentNrOfMembers" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="maxNrOfMembers" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="memberIDs" type="{http://www.onem2m.org/xml/protocols}listOfURIs"/>
 *         &lt;element name="membersAccessControlPolicyIDs" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="memberTypeValidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="consistencyStrategy" type="{http://www.onem2m.org/xml/protocols}consistencyStrategy" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fanOutPoint" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded"/>
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
@XmlType(name = "", propOrder = { "creator", "memberType",
		"currentNrOfMembers", "maxNrOfMembers", "memberIDs",
		"membersAccessControlPolicyIDs", "memberTypeValidated",
		"consistencyStrategy", "groupName", "fanOutPoint", "childResource",
		"subscription" })
@XmlRootElement(name = ShortName.GROUP)
public class Group extends AnnounceableResource {

	@XmlElement(name = ShortName.CREATOR, namespace="")
	protected String creator;
	@XmlElement(name = ShortName.MEMBER_TYPE, required = true, namespace="")
	protected BigInteger memberType;
	@XmlElement(name = ShortName.CURRENT_NUM_MEMBERS, required = true, namespace="")
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger currentNrOfMembers;
	@XmlElement(name = ShortName.MAX_NUM_MEMBERS, required = true, namespace="")
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger maxNrOfMembers;
	@XmlList
	@XmlElement(name = ShortName.MEMBER_ID, required = true, namespace="")
	protected List<String> memberIDs;
	@XmlList
	@XmlElement(name = ShortName.MEMBER_ACP_ID, namespace="")
	protected List<String> membersAccessControlPolicyIDs;
	@XmlElement(name = ShortName.MEMBER_TYPE_VALIDATED, namespace="")
	protected Boolean memberTypeValidated;
	@XmlElement(name = ShortName.CONSISTENCY_STRATEGY, namespace="")
	protected BigInteger consistencyStrategy;
	@XmlElement(name = ShortName.GROUP_NAME, namespace="")
	protected String groupName;
	@XmlElement(name = ShortName.FANOUTPOINT, required = true, namespace="")
	@XmlSchemaType(name = "anyURI")
	protected String fanOutPoint;
	@XmlElement(name = ShortName.CHILD_RESOURCE, namespace="")
	protected List<ChildResourceRef> childResource;
	@XmlElement(name = ShortName.SUB, namespace = "http://www.onem2m.org/xml/protocols")
	protected List<Subscription> subscription;

	/**
	 * Gets the value of the creator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * Sets the value of the creator property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreator(String value) {
		this.creator = value;
	}

	/**
	 * Gets the value of the memberType property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getMemberType() {
		return memberType;
	}

	/**
	 * Sets the value of the memberType property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setMemberType(BigInteger value) {
		this.memberType = value;
	}

	/**
	 * Gets the value of the currentNrOfMembers property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getCurrentNrOfMembers() {
		return currentNrOfMembers;
	}

	/**
	 * Sets the value of the currentNrOfMembers property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setCurrentNrOfMembers(BigInteger value) {
		this.currentNrOfMembers = value;
	}

	/**
	 * Gets the value of the maxNrOfMembers property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getMaxNrOfMembers() {
		return maxNrOfMembers;
	}

	/**
	 * Sets the value of the maxNrOfMembers property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setMaxNrOfMembers(BigInteger value) {
		this.maxNrOfMembers = value;
	}

	/**
	 * Gets the value of the memberIDs property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the memberIDs property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMemberIDs().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getMemberIDs() {
		if (memberIDs == null) {
			memberIDs = new ArrayList<String>();
		}
		return this.memberIDs;
	}

	/**
	 * Gets the value of the membersAccessControlPolicyIDs property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the membersAccessControlPolicyIDs property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMembersAccessControlPolicyIDs().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getMembersAccessControlPolicyIDs() {
		if (membersAccessControlPolicyIDs == null) {
			membersAccessControlPolicyIDs = new ArrayList<String>();
		}
		return this.membersAccessControlPolicyIDs;
	}

	/**
	 * Gets the value of the memberTypeValidated property.
	 * 
	 */
	public Boolean getMemberTypeValidated() {
		return memberTypeValidated;
	}

	/**
	 * Sets the value of the memberTypeValidated property.
	 * 
	 */
	public void setMemberTypeValidated(boolean value) {
		this.memberTypeValidated = value;
	}

	/**
	 * Gets the value of the consistencyStrategy property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getConsistencyStrategy() {
		return consistencyStrategy;
	}

	/**
	 * Sets the value of the consistencyStrategy property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setConsistencyStrategy(BigInteger value) {
		this.consistencyStrategy = value;
	}

	/**
	 * Gets the value of the groupName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * Sets the value of the groupName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGroupName(String value) {
		this.groupName = value;
	}

	/**
	 * Gets the value of the fanOutPoint property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFanOutPoint() {
		return fanOutPoint;
	}

	/**
	 * Sets the value of the fanOutPoint property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFanOutPoint(String value) {
		this.fanOutPoint = value;
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
