//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.01 at 01:16:04 PM EDT 
//


package org.cdisc.ns.odm.v130;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ItemGroupData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemGroupData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Signature" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataStarGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupDataAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupDataAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemGroupData", propOrder = {
    "auditRecord",
    "signature",
    "annotation",
    "itemDataGroup",
    "itemDataStarGroup"
})
public class ODMcomplexTypeDefinitionItemGroupData
    implements Serializable
{

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "ItemData")
    protected List<ODMcomplexTypeDefinitionItemData> itemDataGroup;
    @XmlElementRefs({
        @XmlElementRef(name = "ItemDataURI", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataAny", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataBoolean", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataString", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataInteger", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataFloat", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataDouble", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataDate", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataTime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataHexBinary", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataBase64Binary", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataHexFloat", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataBase64Float", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataPartialDate", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataPartialTime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataPartialDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataDurationDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataIntervalDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataIncompleteDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> itemDataStarGroup;
    @XmlAttribute(name = "ItemGroupOID", required = true)
    protected String itemGroupOID;
    @XmlAttribute(name = "ItemGroupRepeatKey")
    protected String itemGroupRepeatKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;

    /**
     * Gets the value of the auditRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public ODMcomplexTypeDefinitionAuditRecord getAuditRecord() {
        return auditRecord;
    }

    /**
     * Sets the value of the auditRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public void setAuditRecord(ODMcomplexTypeDefinitionAuditRecord value) {
        this.auditRecord = value;
    }

    public boolean isSetAuditRecord() {
        return (this.auditRecord!= null);
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public ODMcomplexTypeDefinitionSignature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public void setSignature(ODMcomplexTypeDefinitionSignature value) {
        this.signature = value;
    }

    public boolean isSetSignature() {
        return (this.signature!= null);
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAnnotation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the itemDataGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDataGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDataGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemData> getItemDataGroup() {
        if (itemDataGroup == null) {
            itemDataGroup = new ArrayList<ODMcomplexTypeDefinitionItemData>();
        }
        return this.itemDataGroup;
    }

    public boolean isSetItemDataGroup() {
        return ((this.itemDataGroup!= null)&&(!this.itemDataGroup.isEmpty()));
    }

    public void unsetItemDataGroup() {
        this.itemDataGroup = null;
    }

    /**
     * Gets the value of the itemDataStarGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDataStarGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDataStarGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataURI }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataString }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataBoolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataString }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataFloat }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDouble }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDate }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataTime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataHexBinary }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataBase64Binary }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataHexFloat }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataBase64Float }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataPartialDate }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataPartialTime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataPartialDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDurationDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataIntervalDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataIncompleteDatetime }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getItemDataStarGroup() {
        if (itemDataStarGroup == null) {
            itemDataStarGroup = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.itemDataStarGroup;
    }

    public boolean isSetItemDataStarGroup() {
        return ((this.itemDataStarGroup!= null)&&(!this.itemDataStarGroup.isEmpty()));
    }

    public void unsetItemDataStarGroup() {
        this.itemDataStarGroup = null;
    }

    /**
     * Gets the value of the itemGroupOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupOID() {
        return itemGroupOID;
    }

    /**
     * Sets the value of the itemGroupOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupOID(String value) {
        this.itemGroupOID = value;
    }

    public boolean isSetItemGroupOID() {
        return (this.itemGroupOID!= null);
    }

    /**
     * Gets the value of the itemGroupRepeatKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupRepeatKey() {
        return itemGroupRepeatKey;
    }

    /**
     * Sets the value of the itemGroupRepeatKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupRepeatKey(String value) {
        this.itemGroupRepeatKey = value;
    }

    public boolean isSetItemGroupRepeatKey() {
        return (this.itemGroupRepeatKey!= null);
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    public boolean isSetTransactionType() {
        return (this.transactionType!= null);
    }

}
