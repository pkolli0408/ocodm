//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.08 at 08:38:34 PM PKT 
//


package org.cdisc.ns.odm.v130;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionAuditLogs;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionDiscrepancyNotes;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionLinks;


/**
 * <p>Java class for ODMcomplexTypeDefinition-FormData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-FormData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Signature" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ArchiveLayoutRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}FormDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}FormDataAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}FormDataAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FormData", propOrder = {
    "auditRecord",
    "signature",
    "archiveLayoutRef",
    "annotation",
    "itemGroupData",
    "formDataElementExtension"
})
public class ODMcomplexTypeDefinitionFormData
    implements Serializable
{

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "ArchiveLayoutRef")
    protected ODMcomplexTypeDefinitionArchiveLayoutRef archiveLayoutRef;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "ItemGroupData")
    protected List<ODMcomplexTypeDefinitionItemGroupData> itemGroupData;
    @XmlElements({
        @XmlElement(name = "Links", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionLinks.class),
        @XmlElement(name = "AuditLogs", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionAuditLogs.class),
        @XmlElement(name = "DiscrepancyNotes", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionDiscrepancyNotes.class)
    })
    protected List<Serializable> formDataElementExtension;
    @XmlAttribute(name = "FormOID", required = true)
    protected String formOID;
    @XmlAttribute(name = "FormRepeatKey")
    protected String formRepeatKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "FormLayoutOID", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String formLayoutOID;
    @XmlAttribute(name = "InterviewerName", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String interviewerName;
    @XmlAttribute(name = "InterviewDate", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected XMLGregorianCalendar interviewDate;
    @XmlAttribute(name = "Status", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String status;
    @XmlAttribute(name = "CreatedDate", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String createdDate;
    @XmlAttribute(name = "CreatedBy", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String createdBy;
    @XmlAttribute(name = "UpdatedDate", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String updatedDate;
    @XmlAttribute(name = "UpdatedBy", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String updatedBy;
    @XmlAttribute(name = "SdvStatus", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String sdvStatus;
    @XmlAttribute(name = "WorkflowStatus", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String workflowStatus;
    @XmlAttribute(name = "Removed", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String removed;
    @XmlAttribute(name = "Archived", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String archived;
    @XmlAttribute(name = "Required", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String required;
    @XmlAttribute(name = "Visible", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String visible;
    @XmlAttribute(name = "Editable", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String editable;
    @XmlAttribute(name = "FormName", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String formName;
    @XmlAttribute(name = "Description", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String description;
    @XmlAttribute(name = "VersionDescription", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String versionDescription;
    @XmlAttribute(name = "Url", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String url;
    @XmlAttribute(name = "StatusChangeTimeStamp", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String statusChangeTimeStamp;

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
     * Gets the value of the archiveLayoutRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionArchiveLayoutRef }
     *     
     */
    public ODMcomplexTypeDefinitionArchiveLayoutRef getArchiveLayoutRef() {
        return archiveLayoutRef;
    }

    /**
     * Sets the value of the archiveLayoutRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionArchiveLayoutRef }
     *     
     */
    public void setArchiveLayoutRef(ODMcomplexTypeDefinitionArchiveLayoutRef value) {
        this.archiveLayoutRef = value;
    }

    public boolean isSetArchiveLayoutRef() {
        return (this.archiveLayoutRef!= null);
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
     * Gets the value of the formDataElementExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formDataElementExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormDataElementExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionLinks }
     * {@link OCodmComplexTypeDefinitionAuditLogs }
     * {@link OCodmComplexTypeDefinitionDiscrepancyNotes }
     * 
     * 
     */
    public List<Serializable> getFormDataElementExtension() {
        if (formDataElementExtension == null) {
            formDataElementExtension = new ArrayList<Serializable>();
        }
        return this.formDataElementExtension;
    }

    public boolean isSetFormDataElementExtension() {
        return ((this.formDataElementExtension!= null)&&(!this.formDataElementExtension.isEmpty()));
    }

    public void unsetFormDataElementExtension() {
        this.formDataElementExtension = null;
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

    public boolean isSetFormOID() {
        return (this.formOID!= null);
    }

    /**
     * Gets the value of the formRepeatKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormRepeatKey() {
        return formRepeatKey;
    }

    /**
     * Sets the value of the formRepeatKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormRepeatKey(String value) {
        this.formRepeatKey = value;
    }

    public boolean isSetFormRepeatKey() {
        return (this.formRepeatKey!= null);
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
     * Gets the value of the formLayoutOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormLayoutOID() {
        return formLayoutOID;
    }

    /**
     * Sets the value of the formLayoutOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormLayoutOID(String value) {
        this.formLayoutOID = value;
    }

    public boolean isSetFormLayoutOID() {
        return (this.formLayoutOID!= null);
    }

    /**
     * Gets the value of the interviewerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterviewerName() {
        return interviewerName;
    }

    /**
     * Sets the value of the interviewerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterviewerName(String value) {
        this.interviewerName = value;
    }

    public boolean isSetInterviewerName() {
        return (this.interviewerName!= null);
    }

    /**
     * Gets the value of the interviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInterviewDate() {
        return interviewDate;
    }

    /**
     * Sets the value of the interviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInterviewDate(XMLGregorianCalendar value) {
        this.interviewDate = value;
    }

    public boolean isSetInterviewDate() {
        return (this.interviewDate!= null);
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

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    public boolean isSetCreatedDate() {
        return (this.createdDate!= null);
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    public boolean isSetCreatedBy() {
        return (this.createdBy!= null);
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedDate(String value) {
        this.updatedDate = value;
    }

    public boolean isSetUpdatedDate() {
        return (this.updatedDate!= null);
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    public boolean isSetUpdatedBy() {
        return (this.updatedBy!= null);
    }

    /**
     * Gets the value of the sdvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdvStatus() {
        return sdvStatus;
    }

    /**
     * Sets the value of the sdvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdvStatus(String value) {
        this.sdvStatus = value;
    }

    public boolean isSetSdvStatus() {
        return (this.sdvStatus!= null);
    }

    /**
     * Gets the value of the workflowStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowStatus() {
        return workflowStatus;
    }

    /**
     * Sets the value of the workflowStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowStatus(String value) {
        this.workflowStatus = value;
    }

    public boolean isSetWorkflowStatus() {
        return (this.workflowStatus!= null);
    }

    /**
     * Gets the value of the removed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoved() {
        return removed;
    }

    /**
     * Sets the value of the removed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoved(String value) {
        this.removed = value;
    }

    public boolean isSetRemoved() {
        return (this.removed!= null);
    }

    /**
     * Gets the value of the archived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchived() {
        return archived;
    }

    /**
     * Sets the value of the archived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchived(String value) {
        this.archived = value;
    }

    public boolean isSetArchived() {
        return (this.archived!= null);
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequired(String value) {
        this.required = value;
    }

    public boolean isSetRequired() {
        return (this.required!= null);
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisible(String value) {
        this.visible = value;
    }

    public boolean isSetVisible() {
        return (this.visible!= null);
    }

    /**
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditable(String value) {
        this.editable = value;
    }

    public boolean isSetEditable() {
        return (this.editable!= null);
    }

    /**
     * Gets the value of the formName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormName() {
        return formName;
    }

    /**
     * Sets the value of the formName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormName(String value) {
        this.formName = value;
    }

    public boolean isSetFormName() {
        return (this.formName!= null);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the versionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * Sets the value of the versionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionDescription(String value) {
        this.versionDescription = value;
    }

    public boolean isSetVersionDescription() {
        return (this.versionDescription!= null);
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean isSetUrl() {
        return (this.url!= null);
    }

    /**
     * Gets the value of the statusChangeTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusChangeTimeStamp() {
        return statusChangeTimeStamp;
    }

    /**
     * Sets the value of the statusChangeTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusChangeTimeStamp(String value) {
        this.statusChangeTimeStamp = value;
    }

    public boolean isSetStatusChangeTimeStamp() {
        return (this.statusChangeTimeStamp!= null);
    }

}
