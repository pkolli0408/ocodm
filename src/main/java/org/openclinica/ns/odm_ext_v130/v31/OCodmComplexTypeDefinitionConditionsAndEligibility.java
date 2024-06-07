//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.07 at 04:58:48 PM EDT 
//


package org.openclinica.ns.odm_ext_v130.v31;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-ConditionsAndEligibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-ConditionsAndEligibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Conditions" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="Keywords" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="EligibilityCriteria" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="Sex" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}Age" minOccurs="0"/&gt;
 *         &lt;element name="HealthyVolunteersAccepted" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedTotalEnrollment" type="{http://www.cdisc.org/ns/odm/v1.3}integer"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ConditionsAndEligibilityElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ConditionsAndEligibilityAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ConditionsAndEligibilityAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-ConditionsAndEligibility", propOrder = {
    "conditions",
    "keywords",
    "eligibilityCriteria",
    "sex",
    "age",
    "healthyVolunteersAccepted",
    "expectedTotalEnrollment"
})
public class OCodmComplexTypeDefinitionConditionsAndEligibility
    implements Serializable
{

    @XmlElement(name = "Conditions")
    protected String conditions;
    @XmlElement(name = "Keywords")
    protected String keywords;
    @XmlElement(name = "EligibilityCriteria")
    protected String eligibilityCriteria;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "Age")
    protected OCodmComplexTypeDefinitionAge age;
    @XmlElement(name = "HealthyVolunteersAccepted")
    protected String healthyVolunteersAccepted;
    @XmlElement(name = "ExpectedTotalEnrollment", required = true)
    protected BigInteger expectedTotalEnrollment;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditions(String value) {
        this.conditions = value;
    }

    public boolean isSetConditions() {
        return (this.conditions!= null);
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    public boolean isSetKeywords() {
        return (this.keywords!= null);
    }

    /**
     * Gets the value of the eligibilityCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    /**
     * Sets the value of the eligibilityCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityCriteria(String value) {
        this.eligibilityCriteria = value;
    }

    public boolean isSetEligibilityCriteria() {
        return (this.eligibilityCriteria!= null);
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    public boolean isSetSex() {
        return (this.sex!= null);
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionAge }
     *     
     */
    public OCodmComplexTypeDefinitionAge getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionAge }
     *     
     */
    public void setAge(OCodmComplexTypeDefinitionAge value) {
        this.age = value;
    }

    public boolean isSetAge() {
        return (this.age!= null);
    }

    /**
     * Gets the value of the healthyVolunteersAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthyVolunteersAccepted() {
        return healthyVolunteersAccepted;
    }

    /**
     * Sets the value of the healthyVolunteersAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthyVolunteersAccepted(String value) {
        this.healthyVolunteersAccepted = value;
    }

    public boolean isSetHealthyVolunteersAccepted() {
        return (this.healthyVolunteersAccepted!= null);
    }

    /**
     * Gets the value of the expectedTotalEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpectedTotalEnrollment() {
        return expectedTotalEnrollment;
    }

    /**
     * Sets the value of the expectedTotalEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpectedTotalEnrollment(BigInteger value) {
        this.expectedTotalEnrollment = value;
    }

    public boolean isSetExpectedTotalEnrollment() {
        return (this.expectedTotalEnrollment!= null);
    }

}
