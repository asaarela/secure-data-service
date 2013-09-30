//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.31 at 10:43:34 AM EDT 
//


package org.slc.sli.test.edfi.entitiesR1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This entity represents a person that is employed by
 *                 an LEA or other educational unit engaged in student instruction.
 *                 These persons are instructional-type staff members. In the data
 *                 model, a teacher entity is a staff member with additional
 *                 properties.
 *             
 * 
 * <p>Java class for teacher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="teacher">
 *   &lt;complexContent>
 *     &lt;extension base="{http://slc-sli/ed-org/0.1}staff">
 *       &lt;sequence>
 *         &lt;element name="teacherUniqueStateId" type="{http://slc-sli/ed-org/0.1}uniqueStateIdentifier" minOccurs="0"/>
 *         &lt;element name="highlyQualifiedTeacher" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teacher", propOrder = {
    "teacherUniqueStateId",
    "highlyQualifiedTeacher"
})
public class Teacher
    extends Staff
{

    protected String teacherUniqueStateId;
    protected Boolean highlyQualifiedTeacher;

    /**
     * Gets the value of the teacherUniqueStateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeacherUniqueStateId() {
        return teacherUniqueStateId;
    }

    /**
     * Sets the value of the teacherUniqueStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeacherUniqueStateId(String value) {
        this.teacherUniqueStateId = value;
    }

    /**
     * Gets the value of the highlyQualifiedTeacher property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighlyQualifiedTeacher() {
        return highlyQualifiedTeacher;
    }

    /**
     * Sets the value of the highlyQualifiedTeacher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighlyQualifiedTeacher(Boolean value) {
        this.highlyQualifiedTeacher = value;
    }

}