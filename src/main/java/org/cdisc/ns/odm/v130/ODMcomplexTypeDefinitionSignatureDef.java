//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.23 at 11:13:14 AM EST 
//


package org.cdisc.ns.odm.v130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-SignatureDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-SignatureDef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Meaning"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}LegalReason"/>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}SignatureDefElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}SignatureDefAttributeExtension"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}SignatureDefAttributeDefinition"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-SignatureDef", propOrder = {
    "meaning",
    "legalReason"
})
public class ODMcomplexTypeDefinitionSignatureDef {

    @XmlElement(name = "Meaning", required = true)
    protected ODMcomplexTypeDefinitionMeaning meaning;
    @XmlElement(name = "LegalReason", required = true)
    protected ODMcomplexTypeDefinitionLegalReason legalReason;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Methodology")
    protected SignMethod methodology;

    /**
     * Gets the value of the meaning property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionMeaning }
     *     
     */
    public ODMcomplexTypeDefinitionMeaning getMeaning() {
        return meaning;
    }

    /**
     * Sets the value of the meaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionMeaning }
     *     
     */
    public void setMeaning(ODMcomplexTypeDefinitionMeaning value) {
        this.meaning = value;
    }

    /**
     * Gets the value of the legalReason property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLegalReason }
     *     
     */
    public ODMcomplexTypeDefinitionLegalReason getLegalReason() {
        return legalReason;
    }

    /**
     * Sets the value of the legalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLegalReason }
     *     
     */
    public void setLegalReason(ODMcomplexTypeDefinitionLegalReason value) {
        this.legalReason = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the methodology property.
     * 
     * @return
     *     possible object is
     *     {@link SignMethod }
     *     
     */
    public SignMethod getMethodology() {
        return methodology;
    }

    /**
     * Sets the value of the methodology property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignMethod }
     *     
     */
    public void setMethodology(SignMethod value) {
        this.methodology = value;
    }

}
