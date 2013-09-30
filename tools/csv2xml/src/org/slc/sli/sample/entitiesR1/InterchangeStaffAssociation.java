//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.05 at 01:05:42 PM EST 
//


package org.slc.sli.sample.entitiesR1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Staff" type="{http://ed-fi.org/0100}Staff"/>
 *         &lt;element name="StaffEducationOrgEmploymentAssociation" type="{http://ed-fi.org/0100}StaffEducationOrgEmploymentAssociation"/>
 *         &lt;element name="StaffEducationOrgAssignmentAssociation" type="{http://ed-fi.org/0100}SLC-StaffEducationOrgAssignmentAssociation"/>
 *         &lt;element name="Teacher" type="{http://ed-fi.org/0100}Teacher"/>
 *         &lt;element name="TeacherSchoolAssociation" type="{http://ed-fi.org/0100}SLC-TeacherSchoolAssociation"/>
 *         &lt;element name="TeacherSectionAssociation" type="{http://ed-fi.org/0100}SLC-TeacherSectionAssociation"/>
 *         &lt;element name="LeaveEvent" type="{http://ed-fi.org/0100}LeaveEvent"/>
 *         &lt;element name="OpenStaffPosition" type="{http://ed-fi.org/0100}OpenStaffPosition"/>
 *         &lt;element name="CredentialFieldDescriptor" type="{http://ed-fi.org/0100}CredentialFieldDescriptor"/>
 *         &lt;element name="StaffProgramAssociation" type="{http://ed-fi.org/0100}SLC-StaffProgramAssociation"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "staffOrStaffEducationOrgEmploymentAssociationOrStaffEducationOrgAssignmentAssociation"
})
@XmlRootElement(name = "InterchangeStaffAssociation")
public class InterchangeStaffAssociation {

    @XmlElements({
        @XmlElement(name = "TeacherSectionAssociation", type = SLCTeacherSectionAssociation.class),
        @XmlElement(name = "Teacher", type = Teacher.class),
        @XmlElement(name = "StaffProgramAssociation", type = SLCStaffProgramAssociation.class),
        @XmlElement(name = "TeacherSchoolAssociation", type = SLCTeacherSchoolAssociation.class),
        @XmlElement(name = "Staff", type = Staff.class),
        @XmlElement(name = "StaffEducationOrgAssignmentAssociation", type = SLCStaffEducationOrgAssignmentAssociation.class),
        @XmlElement(name = "LeaveEvent", type = LeaveEvent.class),
        @XmlElement(name = "CredentialFieldDescriptor", type = CredentialFieldDescriptor.class),
        @XmlElement(name = "OpenStaffPosition", type = OpenStaffPosition.class),
        @XmlElement(name = "StaffEducationOrgEmploymentAssociation", type = StaffEducationOrgEmploymentAssociation.class)
    })
    protected List<Object> staffOrStaffEducationOrgEmploymentAssociationOrStaffEducationOrgAssignmentAssociation;

    /**
     * Gets the value of the staffOrStaffEducationOrgEmploymentAssociationOrStaffEducationOrgAssignmentAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffOrStaffEducationOrgEmploymentAssociationOrStaffEducationOrgAssignmentAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffOrStaffEducationOrgEmploymentAssociationOrStaffEducationOrgAssignmentAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SLCTeacherSectionAssociation }
     * {@link Teacher }
     * {@link SLCStaffProgramAssociation }
     * {@link SLCTeacherSchoolAssociation }
     * {@link Staff }
     * {@link SLCStaffEducationOrgAssignmentAssociation }
     * {@link LeaveEvent }
     * {@link CredentialFieldDescriptor }
     * {@link OpenStaffPosition }
     * {@link StaffEducationOrgEmploymentAssociation }
     * 
     * 
     */
    public List<Object> getStaffOrStaffEducationOrgEmploymentAssociationOrStaffEducationOrgAssignmentAssociation() {
        if (staffOrStaffEducationOrgEmploymentAssociationOrStaffEducationOrgAssignmentAssociation == null) {
            staffOrStaffEducationOrgEmploymentAssociationOrStaffEducationOrgAssignmentAssociation = new ArrayList<Object>();
        }
        return this.staffOrStaffEducationOrgEmploymentAssociationOrStaffEducationOrgAssignmentAssociation;
    }

}