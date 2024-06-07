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
 * <p>Java class for OCodmComplexTypeDefinition-ItemDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-ItemDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ItemPresentInForm" maxOccurs="unbounded"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ItemDetailsElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ItemDetailsAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ItemDetailsAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-ItemDetails", propOrder = {
    "itemPresentInForm"
})
public class OCodmComplexTypeDefinitionItemDetails implements Serializable
{

    @XmlElement(name = "ItemPresentInForm", required = true)
    protected List<OCodmComplexTypeDefinitionItemPresentInForm> itemPresentInForm;
    @XmlAttribute(name = "ItemOID", required = true)
    protected String itemOID;

    /**
     * Gets the value of the itemPresentInForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itemPresentInForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPresentInForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionItemPresentInForm }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionItemPresentInForm> getItemPresentInForm() {
        if (itemPresentInForm == null) {
            itemPresentInForm = new ArrayList<OCodmComplexTypeDefinitionItemPresentInForm>();
        }
        return this.itemPresentInForm;
    }

    public boolean isSetItemPresentInForm() {
        return ((this.itemPresentInForm!= null)&&(!this.itemPresentInForm.isEmpty()));
    }

    public void unsetItemPresentInForm() {
        this.itemPresentInForm = null;
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

}
