//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.07 at 04:58:48 PM EDT 
//


package org.openclinica.ns.odm_ext_v130.v31;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-AuditLogs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-AuditLogs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}AuditLog" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}AuditLogsElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}AuditLogsAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}AuditLogsAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-AuditLogs", propOrder = {
    "auditLog"
})
public class OCodmComplexTypeDefinitionAuditLogs implements Serializable
{

    @XmlElement(name = "AuditLog")
    protected List<OCodmComplexTypeDefinitionAuditLog> auditLog;
    @XmlAttribute(name = "EntityID", required = true)
    protected String entityID;

    /**
     * Gets the value of the auditLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the auditLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionAuditLog }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionAuditLog> getAuditLog() {
        if (auditLog == null) {
            auditLog = new ArrayList<OCodmComplexTypeDefinitionAuditLog>();
        }
        return this.auditLog;
    }

    public boolean isSetAuditLog() {
        return ((this.auditLog!= null)&&(!this.auditLog.isEmpty()));
    }

    public void unsetAuditLog() {
        this.auditLog = null;
    }

    /**
     * Gets the value of the entityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityID() {
        return entityID;
    }

    /**
     * Sets the value of the entityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityID(String value) {
        this.entityID = value;
    }

    public boolean isSetEntityID() {
        return (this.entityID!= null);
    }

}
