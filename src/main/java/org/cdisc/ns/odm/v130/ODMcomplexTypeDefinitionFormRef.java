//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.25 at 01:10:17 PM EST 
//


package org.cdisc.ns.odm.v130;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionConfigurationParameters;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionFormLayoutRef;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionPermissionTags;


/**
 * <p>Java class for ODMcomplexTypeDefinition-FormRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-FormRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}FormRefElementExtension" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}SDVItems" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}FormRefAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}FormRefAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}RefAttributeSharedDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FormRef", propOrder = {
    "configurationParameters",
    "formLayoutRef",
    "permissionTags",
    "sdvItems"
})
public class ODMcomplexTypeDefinitionFormRef {

    @XmlElement(name = "ConfigurationParameters", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected OCodmComplexTypeDefinitionConfigurationParameters configurationParameters;
    @XmlElement(name = "FormLayoutRef", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected List<OCodmComplexTypeDefinitionFormLayoutRef> formLayoutRef;
    @XmlElement(name = "PermissionTags", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected OCodmComplexTypeDefinitionPermissionTags permissionTags;
    @XmlElement(name = "SDVItems")
    protected ODMcomplexTypeDefinitionSdvItems sdvItems;
    @XmlAttribute(name = "FormOID", required = true)
    protected String formOID;
    @XmlAttribute(name = "OrderNumber")
    protected BigInteger orderNumber;
    @XmlAttribute(name = "Mandatory", required = true)
    protected YesOrNo mandatory;
    @XmlAttribute(name = "CollectionExceptionConditionOID")
    protected String collectionExceptionConditionOID;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * Gets the value of the configurationParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionConfigurationParameters }
     *     
     */
    public OCodmComplexTypeDefinitionConfigurationParameters getConfigurationParameters() {
        return configurationParameters;
    }

    /**
     * Sets the value of the configurationParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionConfigurationParameters }
     *     
     */
    public void setConfigurationParameters(OCodmComplexTypeDefinitionConfigurationParameters value) {
        this.configurationParameters = value;
    }

    /**
     * Gets the value of the formLayoutRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formLayoutRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormLayoutRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionFormLayoutRef }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionFormLayoutRef> getFormLayoutRef() {
        if (formLayoutRef == null) {
            formLayoutRef = new ArrayList<OCodmComplexTypeDefinitionFormLayoutRef>();
        }
        return this.formLayoutRef;
    }

    /**
     * Gets the value of the permissionTags property.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionPermissionTags }
     *     
     */
    public OCodmComplexTypeDefinitionPermissionTags getPermissionTags() {
        return permissionTags;
    }

    /**
     * Sets the value of the permissionTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionPermissionTags }
     *     
     */
    public void setPermissionTags(OCodmComplexTypeDefinitionPermissionTags value) {
        this.permissionTags = value;
    }

    /**
     * Gets the value of the sdvItems property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSdvItems }
     *     
     */
    public ODMcomplexTypeDefinitionSdvItems getSDVItems() {
        return sdvItems;
    }

    /**
     * Sets the value of the sdvItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSdvItems }
     *     
     */
    public void setSDVItems(ODMcomplexTypeDefinitionSdvItems value) {
        this.sdvItems = value;
    }

    /**
     * Gets the value of the formOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOID() {
        return formOID;
    }

    /**
     * Sets the value of the formOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOID(String value) {
        this.formOID = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderNumber(BigInteger value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNo }
     *     
     */
    public YesOrNo getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNo }
     *     
     */
    public void setMandatory(YesOrNo value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the collectionExceptionConditionOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionExceptionConditionOID() {
        return collectionExceptionConditionOID;
    }

    /**
     * Sets the value of the collectionExceptionConditionOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionExceptionConditionOID(String value) {
        this.collectionExceptionConditionOID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
