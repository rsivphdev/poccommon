//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.21 at 12:09:50 PM PST 
//


package pssg.poc.common.model.icbcDisputeBundle.eVT;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createContraventionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createContraventionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Submission" type="{http://icbc.net/RSI_InformationManager}SubmissionType"/>
 *         &lt;element name="Party" type="{http://icbc.net/RSI_InformationManager}PartyType"/>
 *         &lt;element name="Violation" type="{http://icbc.net/RSI_InformationManager}ViolationType"/>
 *         &lt;element name="Vehicle" type="{http://icbc.net/RSI_InformationManager}VehicleType" minOccurs="0"/>
 *         &lt;element name="Enforcement" type="{http://icbc.net/RSI_InformationManager}EnforcementType"/>
 *         &lt;element name="CertificateOfService" type="{http://icbc.net/RSI_InformationManager}CertificateOfServiceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createContraventionRequest", propOrder = {
    "submission",
    "party",
    "violation",
    "vehicle",
    "enforcement",
    "certificateOfService"
})
public class CreateContraventionRequest {

    @XmlElement(name = "Submission", required = true)
    protected SubmissionType submission;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "Violation", required = true)
    protected ViolationType violation;
    @XmlElementRef(name = "Vehicle", type = JAXBElement.class, required = false)
    protected JAXBElement<VehicleType> vehicle;
    @XmlElement(name = "Enforcement", required = true)
    protected EnforcementType enforcement;
    @XmlElement(name = "CertificateOfService", required = true)
    protected CertificateOfServiceType certificateOfService;

    /**
     * Gets the value of the submission property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionType }
     *     
     */
    public SubmissionType getSubmission() {
        return submission;
    }

    /**
     * Sets the value of the submission property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionType }
     *     
     */
    public void setSubmission(SubmissionType value) {
        this.submission = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

    /**
     * Gets the value of the violation property.
     * 
     * @return
     *     possible object is
     *     {@link ViolationType }
     *     
     */
    public ViolationType getViolation() {
        return violation;
    }

    /**
     * Sets the value of the violation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViolationType }
     *     
     */
    public void setViolation(ViolationType value) {
        this.violation = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleType }{@code >}
     *     
     */
    public JAXBElement<VehicleType> getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleType }{@code >}
     *     
     */
    public void setVehicle(JAXBElement<VehicleType> value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the enforcement property.
     * 
     * @return
     *     possible object is
     *     {@link EnforcementType }
     *     
     */
    public EnforcementType getEnforcement() {
        return enforcement;
    }

    /**
     * Sets the value of the enforcement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnforcementType }
     *     
     */
    public void setEnforcement(EnforcementType value) {
        this.enforcement = value;
    }

    /**
     * Gets the value of the certificateOfService property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateOfServiceType }
     *     
     */
    public CertificateOfServiceType getCertificateOfService() {
        return certificateOfService;
    }

    /**
     * Sets the value of the certificateOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateOfServiceType }
     *     
     */
    public void setCertificateOfService(CertificateOfServiceType value) {
        this.certificateOfService = value;
    }

}
