//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.05 at 01:12:38 PM EST 
//


package org.slc.sli.sample.entitiesR1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This educational entity represents an overall score or assessment tied to a course over a period of time (i.e., the grading period).  Student grades are usually a compilation of marks and other scores.
 * 
 * 
 * <p>Java class for Grade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Grade">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element name="LetterGradeEarned" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://ed-fi.org/0100}GradeEarned">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumericGradeEarned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DiagnosticStatement" type="{http://ed-fi.org/0100}text" minOccurs="0"/>
 *         &lt;element name="GradeType" type="{http://ed-fi.org/0100}GradeType"/>
 *         &lt;element name="PerformanceBaseConversion" type="{http://ed-fi.org/0100}PerformanceBaseType" minOccurs="0"/>
 *         &lt;element name="StudentSectionAssociationReference" type="{http://ed-fi.org/0100}StudentSectionAssociationReferenceType"/>
 *         &lt;element name="GradingPeriodReference" type="{http://ed-fi.org/0100}GradingPeriodReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grade", propOrder = {
    "letterGradeEarned",
    "numericGradeEarned",
    "diagnosticStatement",
    "gradeType",
    "performanceBaseConversion",
    "studentSectionAssociationReference",
    "gradingPeriodReference"
})
public class Grade
    extends ComplexObjectType
{

    @XmlElement(name = "LetterGradeEarned")
    protected String letterGradeEarned;
    @XmlElement(name = "NumericGradeEarned")
    protected BigInteger numericGradeEarned;
    @XmlElement(name = "DiagnosticStatement")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String diagnosticStatement;
    @XmlElement(name = "GradeType", required = true)
    protected GradeType gradeType;
    @XmlElement(name = "PerformanceBaseConversion")
    protected PerformanceBaseType performanceBaseConversion;
    @XmlElement(name = "StudentSectionAssociationReference", required = true)
    protected StudentSectionAssociationReferenceType studentSectionAssociationReference;
    @XmlElement(name = "GradingPeriodReference")
    protected GradingPeriodReferenceType gradingPeriodReference;

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
     * Gets the value of the studentSectionAssociationReference property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSectionAssociationReferenceType }
     *     
     */
    public StudentSectionAssociationReferenceType getStudentSectionAssociationReference() {
        return studentSectionAssociationReference;
    }

    /**
     * Sets the value of the studentSectionAssociationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSectionAssociationReferenceType }
     *     
     */
    public void setStudentSectionAssociationReference(StudentSectionAssociationReferenceType value) {
        this.studentSectionAssociationReference = value;
    }

    /**
     * Gets the value of the gradingPeriodReference property.
     * 
     * @return
     *     possible object is
     *     {@link GradingPeriodReferenceType }
     *     
     */
    public GradingPeriodReferenceType getGradingPeriodReference() {
        return gradingPeriodReference;
    }

    /**
     * Sets the value of the gradingPeriodReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradingPeriodReferenceType }
     *     
     */
    public void setGradingPeriodReference(GradingPeriodReferenceType value) {
        this.gradingPeriodReference = value;
    }

}