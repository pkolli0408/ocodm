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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}LoginName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}DisplayName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}FullName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}FirstName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}LastName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Organization" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Email" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Picture" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Pager" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Fax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Phone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}LocationRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Certificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}UserElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}UserAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}UserAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-User", propOrder = {
    "loginName",
    "displayName",
    "fullName",
    "firstName",
    "lastName",
    "organization",
    "address",
    "email",
    "picture",
    "pager",
    "fax",
    "phone",
    "locationRef",
    "certificate"
})
public class ODMcomplexTypeDefinitionUser
    implements Serializable
{

    @XmlElement(name = "LoginName")
    protected ODMcomplexTypeDefinitionLoginName loginName;
    @XmlElement(name = "DisplayName")
    protected ODMcomplexTypeDefinitionDisplayName displayName;
    @XmlElement(name = "FullName")
    protected ODMcomplexTypeDefinitionFullName fullName;
    @XmlElement(name = "FirstName")
    protected ODMcomplexTypeDefinitionFirstName firstName;
    @XmlElement(name = "LastName")
    protected ODMcomplexTypeDefinitionLastName lastName;
    @XmlElement(name = "Organization")
    protected ODMcomplexTypeDefinitionOrganization organization;
    @XmlElement(name = "Address")
    protected List<ODMcomplexTypeDefinitionAddress> address;
    @XmlElement(name = "Email")
    protected List<ODMcomplexTypeDefinitionEmail> email;
    @XmlElement(name = "Picture")
    protected ODMcomplexTypeDefinitionPicture picture;
    @XmlElement(name = "Pager")
    protected ODMcomplexTypeDefinitionPager pager;
    @XmlElement(name = "Fax")
    protected List<ODMcomplexTypeDefinitionFax> fax;
    @XmlElement(name = "Phone")
    protected List<ODMcomplexTypeDefinitionPhone> phone;
    @XmlElement(name = "LocationRef")
    protected List<ODMcomplexTypeDefinitionLocationRef> locationRef;
    @XmlElement(name = "Certificate")
    protected List<ODMcomplexTypeDefinitionCertificate> certificate;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "UserType")
    protected UserType userType;

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLoginName }
     *     
     */
    public ODMcomplexTypeDefinitionLoginName getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLoginName }
     *     
     */
    public void setLoginName(ODMcomplexTypeDefinitionLoginName value) {
        this.loginName = value;
    }

    public boolean isSetLoginName() {
        return (this.loginName!= null);
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDisplayName }
     *     
     */
    public ODMcomplexTypeDefinitionDisplayName getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDisplayName }
     *     
     */
    public void setDisplayName(ODMcomplexTypeDefinitionDisplayName value) {
        this.displayName = value;
    }

    public boolean isSetDisplayName() {
        return (this.displayName!= null);
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFullName }
     *     
     */
    public ODMcomplexTypeDefinitionFullName getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFullName }
     *     
     */
    public void setFullName(ODMcomplexTypeDefinitionFullName value) {
        this.fullName = value;
    }

    public boolean isSetFullName() {
        return (this.fullName!= null);
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFirstName }
     *     
     */
    public ODMcomplexTypeDefinitionFirstName getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFirstName }
     *     
     */
    public void setFirstName(ODMcomplexTypeDefinitionFirstName value) {
        this.firstName = value;
    }

    public boolean isSetFirstName() {
        return (this.firstName!= null);
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLastName }
     *     
     */
    public ODMcomplexTypeDefinitionLastName getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLastName }
     *     
     */
    public void setLastName(ODMcomplexTypeDefinitionLastName value) {
        this.lastName = value;
    }

    public boolean isSetLastName() {
        return (this.lastName!= null);
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionOrganization }
     *     
     */
    public ODMcomplexTypeDefinitionOrganization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionOrganization }
     *     
     */
    public void setOrganization(ODMcomplexTypeDefinitionOrganization value) {
        this.organization = value;
    }

    public boolean isSetOrganization() {
        return (this.organization!= null);
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAddress }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<ODMcomplexTypeDefinitionAddress>();
        }
        return this.address;
    }

    public boolean isSetAddress() {
        return ((this.address!= null)&&(!this.address.isEmpty()));
    }

    public void unsetAddress() {
        this.address = null;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionEmail }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionEmail> getEmail() {
        if (email == null) {
            email = new ArrayList<ODMcomplexTypeDefinitionEmail>();
        }
        return this.email;
    }

    public boolean isSetEmail() {
        return ((this.email!= null)&&(!this.email.isEmpty()));
    }

    public void unsetEmail() {
        this.email = null;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionPicture }
     *     
     */
    public ODMcomplexTypeDefinitionPicture getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionPicture }
     *     
     */
    public void setPicture(ODMcomplexTypeDefinitionPicture value) {
        this.picture = value;
    }

    public boolean isSetPicture() {
        return (this.picture!= null);
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionPager }
     *     
     */
    public ODMcomplexTypeDefinitionPager getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionPager }
     *     
     */
    public void setPager(ODMcomplexTypeDefinitionPager value) {
        this.pager = value;
    }

    public boolean isSetPager() {
        return (this.pager!= null);
    }

    /**
     * Gets the value of the fax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFax }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFax> getFax() {
        if (fax == null) {
            fax = new ArrayList<ODMcomplexTypeDefinitionFax>();
        }
        return this.fax;
    }

    public boolean isSetFax() {
        return ((this.fax!= null)&&(!this.fax.isEmpty()));
    }

    public void unsetFax() {
        this.fax = null;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionPhone }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionPhone> getPhone() {
        if (phone == null) {
            phone = new ArrayList<ODMcomplexTypeDefinitionPhone>();
        }
        return this.phone;
    }

    public boolean isSetPhone() {
        return ((this.phone!= null)&&(!this.phone.isEmpty()));
    }

    public void unsetPhone() {
        this.phone = null;
    }

    /**
     * Gets the value of the locationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionLocationRef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionLocationRef> getLocationRef() {
        if (locationRef == null) {
            locationRef = new ArrayList<ODMcomplexTypeDefinitionLocationRef>();
        }
        return this.locationRef;
    }

    public boolean isSetLocationRef() {
        return ((this.locationRef!= null)&&(!this.locationRef.isEmpty()));
    }

    public void unsetLocationRef() {
        this.locationRef = null;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionCertificate }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionCertificate> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<ODMcomplexTypeDefinitionCertificate>();
        }
        return this.certificate;
    }

    public boolean isSetCertificate() {
        return ((this.certificate!= null)&&(!this.certificate.isEmpty()));
    }

    public void unsetCertificate() {
        this.certificate = null;
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

    public boolean isSetOID() {
        return (this.oid!= null);
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUserType(UserType value) {
        this.userType = value;
    }

    public boolean isSetUserType() {
        return (this.userType!= null);
    }

}
