//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.25 at 01:10:17 PM EST 
//


package org.cdisc.ns.odm.v130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Digital"/&gt;
 *     &lt;enumeration value="Electronic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SignMethod")
@XmlEnum
public enum SignMethod {

    @XmlEnumValue("Digital")
    DIGITAL("Digital"),
    @XmlEnumValue("Electronic")
    ELECTRONIC("Electronic");
    private final String value;

    SignMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignMethod fromValue(String v) {
        for (SignMethod c: SignMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
