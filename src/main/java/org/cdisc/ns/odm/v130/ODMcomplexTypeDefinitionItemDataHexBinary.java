//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.07 at 04:58:48 PM EDT 
//


package org.cdisc.ns.odm.v130;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ItemDataHexBinary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemDataHexBinary"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.cdisc.org/ns/odm/v1.3&gt;hexBinary"&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataStarAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataStarAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataAttributeSharedDefinition"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemDataHexBinary", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionItemDataHexBinary implements Serializable
{

    @XmlValue
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] value;
    @XmlAttribute(name = "AuditRecordID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object auditRecordID;
    @XmlAttribute(name = "SignatureID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object signatureID;
    @XmlAttribute(name = "AnnotationID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object annotationID;
    @XmlAttribute(name = "MeasurementUnitOID")
    protected String measurementUnitOID;
    @XmlAttribute(name = "ItemOID", required = true)
    protected String itemOID;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "IsNull")
    protected YesOnly isNull;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Gets the value of the auditRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAuditRecordID() {
        return auditRecordID;
    }

    /**
     * Sets the value of the auditRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAuditRecordID(Object value) {
        this.auditRecordID = value;
    }

    public boolean isSetAuditRecordID() {
        return (this.auditRecordID!= null);
    }

    /**
     * Gets the value of the signatureID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSignatureID() {
        return signatureID;
    }

    /**
     * Sets the value of the signatureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSignatureID(Object value) {
        this.signatureID = value;
    }

    public boolean isSetSignatureID() {
        return (this.signatureID!= null);
    }

    /**
     * Gets the value of the annotationID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAnnotationID() {
        return annotationID;
    }

    /**
     * Sets the value of the annotationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAnnotationID(Object value) {
        this.annotationID = value;
    }

    public boolean isSetAnnotationID() {
        return (this.annotationID!= null);
    }

    /**
     * Gets the value of the measurementUnitOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementUnitOID() {
        return measurementUnitOID;
    }

    /**
     * Sets the value of the measurementUnitOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementUnitOID(String value) {
        this.measurementUnitOID = value;
    }

    public boolean isSetMeasurementUnitOID() {
        return (this.measurementUnitOID!= null);
    }

    /**
     * Gets the value of the itemOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemOID() {
        return itemOID;
    }

    /**
     * Sets the value of the itemOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemOID(String value) {
        this.itemOID = value;
    }

    public boolean isSetItemOID() {
        return (this.itemOID!= null);
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

    /**
     * Gets the value of the isNull property.
     * 
     * @return
     *     possible object is
     *     {@link YesOnly }
     *     
     */
    public YesOnly getIsNull() {
        return isNull;
    }

    /**
     * Sets the value of the isNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOnly }
     *     
     */
    public void setIsNull(YesOnly value) {
        this.isNull = value;
    }

    public boolean isSetIsNull() {
        return (this.isNull!= null);
    }

}
