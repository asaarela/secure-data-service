//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.05 at 01:12:38 PM EST 
//


package org.slc.sli.sample.entitiesR1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatingStandardNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RatingStandardNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Advanced"/>
 *     &lt;enumeration value="Below Proficiency"/>
 *     &lt;enumeration value="Below Standard"/>
 *     &lt;enumeration value="College Ready"/>
 *     &lt;enumeration value="Commended"/>
 *     &lt;enumeration value="Failing"/>
 *     &lt;enumeration value="Met Standard"/>
 *     &lt;enumeration value="Meets Proficiency"/>
 *     &lt;enumeration value="Passing"/>
 *     &lt;enumeration value="Satisfactory"/>
 *     &lt;enumeration value="Unsatisfactory"/>
 *     &lt;enumeration value="Well Below Proficiency"/>
 *     &lt;enumeration value="Well Below Standard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RatingStandardNameType")
@XmlEnum
public enum RatingStandardNameType {

    @XmlEnumValue("Advanced")
    ADVANCED("Advanced"),
    @XmlEnumValue("Below Proficiency")
    BELOW_PROFICIENCY("Below Proficiency"),
    @XmlEnumValue("Below Standard")
    BELOW_STANDARD("Below Standard"),
    @XmlEnumValue("College Ready")
    COLLEGE_READY("College Ready"),
    @XmlEnumValue("Commended")
    COMMENDED("Commended"),
    @XmlEnumValue("Failing")
    FAILING("Failing"),
    @XmlEnumValue("Met Standard")
    MET_STANDARD("Met Standard"),
    @XmlEnumValue("Meets Proficiency")
    MEETS_PROFICIENCY("Meets Proficiency"),
    @XmlEnumValue("Passing")
    PASSING("Passing"),
    @XmlEnumValue("Satisfactory")
    SATISFACTORY("Satisfactory"),
    @XmlEnumValue("Unsatisfactory")
    UNSATISFACTORY("Unsatisfactory"),
    @XmlEnumValue("Well Below Proficiency")
    WELL_BELOW_PROFICIENCY("Well Below Proficiency"),
    @XmlEnumValue("Well Below Standard")
    WELL_BELOW_STANDARD("Well Below Standard");
    private final String value;

    RatingStandardNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RatingStandardNameType fromValue(String v) {
        for (RatingStandardNameType c: RatingStandardNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}