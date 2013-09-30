//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.31 at 10:43:34 AM EDT 
//


package org.slc.sli.test.edfi.entitiesR1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This educational entity represents an overall score
 *                 or assessment tied to a course over a period of time (i.e., the
 *                 grading period). Student grades are usually a compilation of marks
 *                 and other scores.
 *             
 * 
 * <p>Java class for grade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="grade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="letterGradeEarned" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://slc-sli/ed-org/0.1}gradeEarned">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numericGradeEarned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="diagnosticStatement" type="{http://slc-sli/ed-org/0.1}text" minOccurs="0"/>
 *         &lt;element name="gradeType" type="{http://slc-sli/ed-org/0.1}gradeType"/>
 *         &lt;element name="performanceBaseConversion" type="{http://slc-sli/ed-org/0.1}performanceBaseType" minOccurs="0"/>
 *         &lt;element name="sectionId" type="{http://slc-sli/ed-org/0.1}reference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grade", propOrder = {
    "letterGradeEarned",
    "numericGradeEarned",
    "diagnosticStatement",
    "gradeType",
    "performanceBaseConversion",
    "sectionId"
})
public class Grade {

    protected String letterGradeEarned;
    protected BigInteger numericGradeEarned;
    protected String diagnosticStatement;
    @XmlElement(required = true)
    protected GradeType gradeType;
    protected PerformanceBaseType performanceBaseConversion;
    @XmlElement(required = true)
    protected String sectionId;

    /**
     * Gets the value of the letterGradeEarned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterGradeEarned() {
        return letterGradeEarned;
    }

    /**
     * Sets the value of the letterGradeEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterGradeEarned(String value) {
        this.letterGradeEarned = value;
    }

    /**
     * Gets the value of the numericGradeEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumericGradeEarned() {
        return numericGradeEarned;
    }

    /**
     * Sets the value of the numericGradeEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumericGradeEarned(BigInteger value) {
        this.numericGradeEarned = value;
    }

    /**
     * Gets the value of the diagnosticStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticStatement() {
        return diagnosticStatement;
    }

    /**
     * Sets the value of the diagnosticStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticStatement(String value) {
        this.diagnosticStatement = value;
    }

    /**
     * Gets the value of the gradeType property.
     * 
     * @return
     *     possible object is
     *     {@link GradeType }
     *     
     */
    public GradeType getGradeType() {
        return gradeType;
    }

    /**
     * Sets the value of the gradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeType }
     *     
     */
    public void setGradeType(GradeType value) {
        this.gradeType = value;
    }

    /**
     * Gets the value of the performanceBaseConversion property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceBaseType }
     *     
     */
    public PerformanceBaseType getPerformanceBaseConversion() {
        return performanceBaseConversion;
    }

    /**
     * Sets the value of the performanceBaseConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceBaseType }
     *     
     */
    public void setPerformanceBaseConversion(PerformanceBaseType value) {
        this.performanceBaseConversion = value;
    }

    /**
     * Gets the value of the sectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * Sets the value of the sectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionId(String value) {
        this.sectionId = value;
    }

}