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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.om2m.commons.constants.MgmtDefinitionTypes;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedMgmtResource">
 *       &lt;sequence>
 *         &lt;element name="deviceLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fwVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hwVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerDetailsLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manufacturingDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subModel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="osVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="systemTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supportURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="presentationURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "")
@XmlRootElement(name = ShortName.DEVICE_INFO_ANNC)
public class DeviceInfoAnnc extends MgmtObjAnncWithChildren {

	@XmlElement(required = true, name = ShortName.DEVICE_LABEL, namespace="")
	protected String deviceLabel;
	@XmlElement(required = true, name = ShortName.MANUFACTURER, namespace="")
	protected String manufacturer;
	@XmlElement(required = true, name = ShortName.DEVICE_MODEL, namespace="")
	protected String model;
	@XmlElement(required = true, name = ShortName.DEVICE_TYPE, namespace="")
	protected String deviceType;

	@XmlElement(name = ShortName.FW_VERSION, namespace="")
	protected String fwVersion;
	@XmlElement(name = ShortName.SW_VERSION, namespace="")
	protected String swVersion;
	@XmlElement(name = ShortName.HW_VERSION, namespace="")
	protected String hwVersion;
	@XmlElement(name = ShortName.MANUF_DET_LINKS, namespace="")
	protected String manufacturerDetailsLink;
	@XmlElement(name = ShortName.MANUF_DATE, namespace="")
	protected String manufacturingDate;
	@XmlElement(name = ShortName.DEVICE_SUB_MODEL, namespace="")
	protected String subModel;
	@XmlElement(name = ShortName.DEVICE_NAME, namespace="")
	protected String deviceName;
	@XmlElement(name = ShortName.OS_VERSION, namespace="")
	protected String osVersion;
	@XmlElement(name = ShortName.COUNTRY, namespace="")
	protected String country;
	@XmlElement(name = ShortName.LOCATION, namespace="")
	protected String location;
	@XmlElement(name = ShortName.SYS_TIME, namespace="")
	protected String systemTime;
	@XmlElement(name = ShortName.SUPPORT_URL, namespace="")
	protected String supportURL;
	@XmlElement(name = ShortName.PRES_URL, namespace="")
	protected String presentationURL;
	@XmlElement(name = ShortName.PROTOCOL, namespace="")
	protected String protocol;
	
	
	public DeviceInfoAnnc() {
		super();
		setMgmtDefinition(MgmtDefinitionTypes.DEVICE_INFO);
	}

	/**
	 * Gets the value of the deviceLabel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeviceLabel() {
		return deviceLabel;
	}

	/**
	 * Sets the value of the deviceLabel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeviceLabel(String value) {
		this.deviceLabel = value;
	}

	/**
	 * Gets the value of the manufacturer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Sets the value of the manufacturer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setManufacturer(String value) {
		this.manufacturer = value;
	}

	/**
	 * Gets the value of the model property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Sets the value of the model property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModel(String value) {
		this.model = value;
	}

	/**
	 * Gets the value of the deviceType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * Sets the value of the deviceType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeviceType(String value) {
		this.deviceType = value;
	}

	/**
	 * Gets the value of the fwVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFwVersion() {
		return fwVersion;
	}

	/**
	 * Sets the value of the fwVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFwVersion(String value) {
		this.fwVersion = value;
	}

	/**
	 * Gets the value of the swVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSwVersion() {
		return swVersion;
	}

	/**
	 * Sets the value of the swVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSwVersion(String value) {
		this.swVersion = value;
	}

	/**
	 * Gets the value of the hwVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHwVersion() {
		return hwVersion;
	}

	/**
	 * Sets the value of the hwVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHwVersion(String value) {
		this.hwVersion = value;
	}

	/**
	 * @return the manufacturerDetailsLink
	 */
	public String getManufacturerDetailsLink() {
		return manufacturerDetailsLink;
	}

	/**
	 * @param manufacturerDetailsLink the manufacturerDetailsLink to set
	 */
	public void setManufacturerDetailsLink(String manufacturerDetailsLink) {
		this.manufacturerDetailsLink = manufacturerDetailsLink;
	}

	/**
	 * @return the manufacturingDate
	 */
	public String getManufacturingDate() {
		return manufacturingDate;
	}

	/**
	 * @param manufacturingDate the manufacturingDate to set
	 */
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	/**
	 * @return the subModel
	 */
	public String getSubModel() {
		return subModel;
	}

	/**
	 * @param subModel the subModel to set
	 */
	public void setSubModel(String subModel) {
		this.subModel = subModel;
	}

	/**
	 * @return the deviceName
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * @param deviceName the deviceName to set
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	/**
	 * @return the osVersion
	 */
	public String getOsVersion() {
		return osVersion;
	}

	/**
	 * @param osVersion the osVersion to set
	 */
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the systemTime
	 */
	public String getSystemTime() {
		return systemTime;
	}

	/**
	 * @param systemTime the systemTime to set
	 */
	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}

	/**
	 * @return the supportURL
	 */
	public String getSupportURL() {
		return supportURL;
	}

	/**
	 * @param supportURL the supportURL to set
	 */
	public void setSupportURL(String supportURL) {
		this.supportURL = supportURL;
	}

	/**
	 * @return the presentationURL
	 */
	public String getPresentationURL() {
		return presentationURL;
	}

	/**
	 * @param presentationURL the presentationURL to set
	 */
	public void setPresentationURL(String presentationURL) {
		this.presentationURL = presentationURL;
	}

	/**
	 * @return the protocol
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * @param protocol the protocol to set
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

}
