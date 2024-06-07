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
 * <p>Java class for CommentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CommentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sponsor"/&gt;
 *     &lt;enumeration value="Site"/&gt;
 *     &lt;maxLength value="7"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommentType")
@XmlEnum
public enum CommentType {

    @XmlEnumValue("Sponsor")
    SPONSOR("Sponsor"),
    @XmlEnumValue("Site")
    SITE("Site");
    private final String value;

    CommentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommentType fromValue(String v) {
        for (CommentType c: CommentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
