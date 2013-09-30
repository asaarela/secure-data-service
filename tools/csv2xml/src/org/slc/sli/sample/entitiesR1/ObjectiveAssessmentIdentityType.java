//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.05 at 01:12:38 PM EST 
//


package org.slc.sli.sample.entitiesR1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulates the possible attributes that can be used to lookup the identity of assessment objectives.
 * 
 * <p>Java class for ObjectiveAssessmentIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectiveAssessmentIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectiveAssessmentIdentificationCode" type="{http://ed-fi.org/0100}IdentificationCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectiveAssessmentIdentityType", propOrder = {
    "objectiveAssessmentIdentificationCode"
})
public class ObjectiveAssessmentIdentityType {

    @XmlElement(name = "ObjectiveAssessmentIdentificationCode", required = true)
    protected String objectiveAssessmentIdentificationCode;

    /**
     * Gets the value of the objectiveAssessmentIdentificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectiveAssessmentIdentificationCode() {
        return objectiveAssessmentIdentificationCode;
    }

    /**
     * Sets the value of the objectiveAssessmentIdentificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectiveAssessmentIdentificationCode(String value) {
        this.objectiveAssessmentIdentificationCode = value;
    }

}