//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.27 at 05:13:48 PM EST 
//


package com.upcex.xolt.ups.response.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PODLetterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PODLetterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HTMLImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PODLetterType", propOrder = {
    "htmlImage"
})
public class PODLetterType {

    @XmlElement(name = "HTMLImage")
    protected String htmlImage;

    /**
     * Gets the value of the htmlImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTMLImage() {
        return htmlImage;
    }

    /**
     * Sets the value of the htmlImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTMLImage(String value) {
        this.htmlImage = value;
    }

}