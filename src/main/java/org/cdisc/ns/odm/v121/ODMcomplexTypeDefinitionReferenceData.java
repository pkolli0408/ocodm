//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.08 at 08:38:34 PM PKT 
//


package org.cdisc.ns.odm.v121;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ReferenceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ReferenceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemGroupData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}ReferenceDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ReferenceDataAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ReferenceDataAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ReferenceData", propOrder = {
    "itemGroupData"
})
public class ODMcomplexTypeDefinitionReferenceData
    implements Serializable
{

    @XmlElement(name = "ItemGroupData")
    protected List<ODMcomplexTypeDefinitionItemGroupData> itemGroupData;
    @XmlAttribute(name = "StudyOID", required = true)
    protected String studyOID;
    @XmlAttribute(name = "MetaDataVersionOID", required = true)
    protected String metaDataVersionOID;

    /**
     * Gets the value of the itemGroupData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemGroupData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemGroupData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemGroupData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemGroupData> getItemGroupData() {
        if (itemGroupData == null) {
            itemGroupData = new ArrayList<ODMcomplexTypeDefinitionItemGroupData>();
        }
        return this.itemGroupData;
    }

    public boolean isSetItemGroupData() {
        return ((this.itemGroupData!= null)&&(!this.itemGroupData.isEmpty()));
    }

    public void unsetItemGroupData() {
        this.itemGroupData = null;
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
