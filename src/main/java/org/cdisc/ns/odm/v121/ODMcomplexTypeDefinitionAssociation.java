//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.07 at 04:58:48 PM EDT 
//


package org.cdisc.ns.odm.v121;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-Association complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-Association"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}KeySet"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}KeySet"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Annotation"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}AssociationElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}AssociationAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}AssociationAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Association", propOrder = {
    "content"
})
public class ODMcomplexTypeDefinitionAssociation
    implements Serializable
{

    @XmlElementRefs({
        @XmlElementRef(name = "KeySet", namespace = "http://www.cdisc.org/ns/odm/v1.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Annotation", namespace = "http://www.cdisc.org/ns/odm/v1.2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> content;
    @XmlAttribute(name = "StudyOID", required = true)
    protected String studyOID;
    @XmlAttribute(name = "MetaDataVersionOID", required = true)
    protected String metaDataVersionOID;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "KeySet" is used by two different parts of a schema. See: 
     * line 1543 of file:/Users/prashanthkolli/IdeaProjects/ocodm/src/main/schemas/ODM1-2-1-foundation.xsd
     * line 1542 of file:/Users/prashanthkolli/IdeaProjects/ocodm/src/main/schemas/ODM1-2-1-foundation.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionKeySet }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionAnnotation }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the studyOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyOID() {
        return studyOID;
    }

    /**
     * Sets the value of the studyOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyOID(String value) {
        this.studyOID = value;
    }

    public boolean isSetStudyOID() {
        return (this.studyOID!= null);
    }

    /**
     * Gets the value of the metaDataVersionOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataVersionOID() {
        return metaDataVersionOID;
    }

    /**
     * Sets the value of the metaDataVersionOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataVersionOID(String value) {
        this.metaDataVersionOID = value;
    }

    public boolean isSetMetaDataVersionOID() {
        return (this.metaDataVersionOID!= null);
    }

}
