//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.23 at 05:35:09 PM EST 
//


package org.openclinica.ns.odm_ext_v130.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-ConfigurationParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-ConfigurationParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ConfigurationParametersAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-ConfigurationParameters")
public class OCodmComplexTypeDefinitionConfigurationParameters {

    @XmlAttribute(name = "HideCRF")
    protected String hideCRF;
    @XmlAttribute(name = "ParticipantForm")
    protected String participantForm;
    @XmlAttribute(name = "SurveyRegisterForm")
    protected String surveyRegisterForm;
    @XmlAttribute(name = "AllowAnonymousSubmission")
    protected String allowAnonymousSubmission;
    @XmlAttribute(name = "PublicUrl")
    protected String publicUrl;
    @XmlAttribute(name = "FormUrl")
    protected String formUrl;
    @XmlAttribute(name = "SubmissionUrl")
    protected String submissionUrl;
    @XmlAttribute(name = "OfflineForm")
    protected String offlineForm;
    @XmlAttribute(name = "OfflineCapable")
    protected String offlineCapable;
    @XmlAttribute(name = "Offline")
    protected String offline;
    @XmlAttribute(name = "SourceDataVerificationCode")
    protected String sourceDataVerificationCode;
    @XmlAttribute(name = "allowAdd")
    protected String allowAdd;

    /**
     * Gets the value of the hideCRF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideCRF() {
        return hideCRF;
    }

    /**
     * Sets the value of the hideCRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideCRF(String value) {
        this.hideCRF = value;
    }

    /**
     * Gets the value of the participantForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantForm() {
        return participantForm;
    }

    /**
     * Sets the value of the participantForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantForm(String value) {
        this.participantForm = value;
    }

    /**
     * Gets the value of the surveyRegisterForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyRegisterForm() {
        return surveyRegisterForm;
    }

    /**
     * Sets the value of the surveyRegisterForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyRegisterForm(String value) {
        this.surveyRegisterForm = value;
    }

    /**
     * Gets the value of the allowAnonymousSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowAnonymousSubmission() {
        return allowAnonymousSubmission;
    }

    /**
     * Sets the value of the allowAnonymousSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowAnonymousSubmission(String value) {
        this.allowAnonymousSubmission = value;
    }

    /**
     * Gets the value of the publicUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicUrl() {
        return publicUrl;
    }

    /**
     * Sets the value of the publicUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicUrl(String value) {
        this.publicUrl = value;
    }

    /**
     * Gets the value of the formUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormUrl() {
        return formUrl;
    }

    /**
     * Sets the value of the formUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormUrl(String value) {
        this.formUrl = value;
    }

    /**
     * Gets the value of the submissionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionUrl() {
        return submissionUrl;
    }

    /**
     * Sets the value of the submissionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionUrl(String value) {
        this.submissionUrl = value;
    }

    /**
     * Gets the value of the offlineForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfflineForm() {
        return offlineForm;
    }

    /**
     * Sets the value of the offlineForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfflineForm(String value) {
        this.offlineForm = value;
    }

    /**
     * Gets the value of the offlineCapable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfflineCapable() {
        return offlineCapable;
    }

    /**
     * Sets the value of the offlineCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfflineCapable(String value) {
        this.offlineCapable = value;
    }

    /**
     * Gets the value of the offline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffline() {
        return offline;
    }

    /**
     * Sets the value of the offline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffline(String value) {
        this.offline = value;
    }

    /**
     * Gets the value of the sourceDataVerificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDataVerificationCode() {
        return sourceDataVerificationCode;
    }

    /**
     * Sets the value of the sourceDataVerificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDataVerificationCode(String value) {
        this.sourceDataVerificationCode = value;
    }

    /**
     * Gets the value of the allowAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowAdd() {
        return allowAdd;
    }

    /**
     * Sets the value of the allowAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowAdd(String value) {
        this.allowAdd = value;
    }

}
