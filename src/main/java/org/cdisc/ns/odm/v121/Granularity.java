//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.07 at 04:58:48 PM EDT 
//


package org.cdisc.ns.odm.v121;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Granularity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Granularity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Metadata"/&gt;
 *     &lt;enumeration value="AdminData"/&gt;
 *     &lt;enumeration value="ReferenceData"/&gt;
 *     &lt;enumeration value="AllClinicalData"/&gt;
 *     &lt;enumeration value="SingleSite"/&gt;
 *     &lt;enumeration value="SingleSubject"/&gt;
 *     &lt;maxLength value="15"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Granularity")
@XmlEnum
public enum Granularity {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Metadata")
    METADATA("Metadata"),
    @XmlEnumValue("AdminData")
    ADMIN_DATA("AdminData"),
    @XmlEnumValue("ReferenceData")
    REFERENCE_DATA("ReferenceData"),
    @XmlEnumValue("AllClinicalData")
    ALL_CLINICAL_DATA("AllClinicalData"),
    @XmlEnumValue("SingleSite")
    SINGLE_SITE("SingleSite"),
    @XmlEnumValue("SingleSubject")
    SINGLE_SUBJECT("SingleSubject");
    private final String value;

    Granularity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Granularity fromValue(String v) {
        for (Granularity c: Granularity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
