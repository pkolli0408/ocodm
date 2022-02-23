//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.23 at 10:49:30 AM EST 
//


package org.openclinica.ns.odm_ext_v130.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-SubjectGroupData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-SubjectGroupData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}SubjectGroupDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}SubjectGroupDataAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}SubjectGroupDataAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-SubjectGroupData")
public class OCodmComplexTypeDefinitionSubjectGroupData {

    @XmlAttribute(name = "StudyGroupClassID", required = true)
    protected String studyGroupClassID;
    @XmlAttribute(name = "StudyGroupClassName")
    protected String studyGroupClassName;
    @XmlAttribute(name = "StudyGroupName")
    protected String studyGroupName;

    /**
     * Gets the value of the studyGroupClassID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyGroupClassID() {
        return studyGroupClassID;
    }

    /**
     * Sets the value of the studyGroupClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyGroupClassID(String value) {
        this.studyGroupClassID = value;
    }

    /**
     * Gets the value of the studyGroupClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyGroupClassName() {
        return studyGroupClassName;
    }

    /**
     * Sets the value of the studyGroupClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyGroupClassName(String value) {
        this.studyGroupClassName = value;
    }

    /**
     * Gets the value of the studyGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyGroupName() {
        return studyGroupName;
    }

    /**
     * Sets the value of the studyGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyGroupName(String value) {
        this.studyGroupName = value;
    }

}
