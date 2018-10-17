
package pssg.poc.common.model.icbcDisputeBundle;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRANSFER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MRE_VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINOR_VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TABLE_RELEASE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROFILE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGENCY_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FILE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBMIT_BY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBMIT_BY_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORG_UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORG_UNIT_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CASE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBMIT_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SENT_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REPORT" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JURISDICTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="JURISDICTION_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OFFENCE_COUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TICKET_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TICKET_TYPE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TICKET_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TICKET_CLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TICKET_CLASS_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TICKET_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TICKET_STATUS_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TICKET_ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TICKET_ORIGIN_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TK_ROLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="REPORT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REPORT_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OFFENCE_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OFFENCE_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="STREET_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MUNICIPALITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MUNICIPALITY_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OFFICER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OFFICER_ID_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PARTNER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PARTNER_ID_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SET_FINE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AMOUNT_OF_PENALTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PAYMENT_METHOD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PAYMENT_METHOD_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PRINTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STATUTE_ACT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="STATUTE_ACT_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LEGAL_STATUTE_SECTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CHARGE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PERSON" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="INDIVIDUAL_SURNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="GIVEN_ONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GIVEN_TWO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GIVEN_THREE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MUNICIPALITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PROV_STATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PROV_STATE_CODE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="POSTAL_ZIPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GENDER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="STREET_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DRIVERS_LICENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DRIVERS_LICENCE_PROV_STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DRIVERS_LICENCE_PROV_STATE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CHARGE" maxOccurs="2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CHARGE_COUNTER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="STATUTE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="STATUTE_SECTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="STATUTE_WORDING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LEGAL_STATUTE_SECTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CHARGE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CHARGE_COUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SET_FINE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="AMOUNT_OF_PENALTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="VEHICLE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VEHICLE_LICENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LICENCE_PROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LICENCE_PROVINCE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MODEL_YEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VEHICLE_MAKE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VEHICLE_MAKE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="STYLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="STYLE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ORIGINAL_COLOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ORIGINAL_COLOUR_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CUSTOMDATA" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TK_YOUNG_PERSON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TK_DL_PRODUCED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TK_DL_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TK_CHANGE_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TK_NSC_PUJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TK_NSC_PUJ_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TK_NSC_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TK_REG_OWNER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TK_ACCIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TK_DISPUTE_LOCATION_ADDRESS_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TK_COURT_HEARING_LOCATION_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TK_WITNESSING_OFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TK_WITNESSING_OFFICER_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TK_CERTIFICATE_ENTITY_PERSON" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TK_CERTIFICATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TK_CERTIFICATE_SERVED_TO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TK_CERTIFICATE_DATE_OF_SERVICE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transfer",
    "mreversion",
    "minorversion",
    "tablereleasedate",
    "profilename",
    "agencyname",
    "filename",
    "submitby",
    "submitbytrans",
    "orgunit",
    "orgunittrans",
    "casetype",
    "submitdate",
    "senttime",
    "report"
})
@XmlRootElement(name = "XML_FILE")
public class XMLFILE {

    @XmlElement(name = "TRANSFER")
    protected String transfer;
    @XmlElement(name = "MRE_VERSION")
    protected String mreversion;
    @XmlElement(name = "MINOR_VERSION")
    protected String minorversion;
    @XmlElement(name = "TABLE_RELEASE_DATE")
    protected String tablereleasedate;
    @XmlElement(name = "PROFILE_NAME")
    protected String profilename;
    @XmlElement(name = "AGENCY_NAME", required = true)
    protected String agencyname;
    @XmlElement(name = "FILE_NAME")
    protected String filename;
    @XmlElement(name = "SUBMIT_BY")
    protected String submitby;
    @XmlElement(name = "SUBMIT_BY_TRANS")
    protected String submitbytrans;
    @XmlElement(name = "ORG_UNIT")
    protected String orgunit;
    @XmlElement(name = "ORG_UNIT_TRANS")
    protected String orgunittrans;
    @XmlElement(name = "CASE_TYPE")
    protected String casetype;
    @XmlElement(name = "SUBMIT_DATE", required = true)
    protected String submitdate;
    @XmlElement(name = "SENT_TIME", required = true)
    protected String senttime;
    @XmlElement(name = "REPORT")
    protected List<XMLFILE.REPORT> report;

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSFER() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSFER(String value) {
        this.transfer = value;
    }

    /**
     * Gets the value of the mreversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMREVERSION() {
        return mreversion;
    }

    /**
     * Sets the value of the mreversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMREVERSION(String value) {
        this.mreversion = value;
    }

    /**
     * Gets the value of the minorversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINORVERSION() {
        return minorversion;
    }

    /**
     * Sets the value of the minorversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINORVERSION(String value) {
        this.minorversion = value;
    }

    /**
     * Gets the value of the tablereleasedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABLERELEASEDATE() {
        return tablereleasedate;
    }

    /**
     * Sets the value of the tablereleasedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABLERELEASEDATE(String value) {
        this.tablereleasedate = value;
    }

    /**
     * Gets the value of the profilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFILENAME() {
        return profilename;
    }

    /**
     * Sets the value of the profilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFILENAME(String value) {
        this.profilename = value;
    }

    /**
     * Gets the value of the agencyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGENCYNAME() {
        return agencyname;
    }

    /**
     * Sets the value of the agencyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGENCYNAME(String value) {
        this.agencyname = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILENAME() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILENAME(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the submitby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBMITBY() {
        return submitby;
    }

    /**
     * Sets the value of the submitby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBMITBY(String value) {
        this.submitby = value;
    }

    /**
     * Gets the value of the submitbytrans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBMITBYTRANS() {
        return submitbytrans;
    }

    /**
     * Sets the value of the submitbytrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBMITBYTRANS(String value) {
        this.submitbytrans = value;
    }

    /**
     * Gets the value of the orgunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGUNIT() {
        return orgunit;
    }

    /**
     * Sets the value of the orgunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGUNIT(String value) {
        this.orgunit = value;
    }

    /**
     * Gets the value of the orgunittrans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGUNITTRANS() {
        return orgunittrans;
    }

    /**
     * Sets the value of the orgunittrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGUNITTRANS(String value) {
        this.orgunittrans = value;
    }

    /**
     * Gets the value of the casetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASETYPE() {
        return casetype;
    }

    /**
     * Sets the value of the casetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASETYPE(String value) {
        this.casetype = value;
    }

    /**
     * Gets the value of the submitdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBMITDATE() {
        return submitdate;
    }

    /**
     * Sets the value of the submitdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBMITDATE(String value) {
        this.submitdate = value;
    }

    /**
     * Gets the value of the senttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENTTIME() {
        return senttime;
    }

    /**
     * Sets the value of the senttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENTTIME(String value) {
        this.senttime = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the report property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREPORT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLFILE.REPORT }
     * 
     * 
     */
    public List<XMLFILE.REPORT> getREPORT() {
        if (report == null) {
            report = new ArrayList<XMLFILE.REPORT>();
        }
        return this.report;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="JURISDICTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="JURISDICTION_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OFFENCE_COUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TICKET_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TICKET_TYPE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TICKET_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TICKET_CLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TICKET_CLASS_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TICKET_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TICKET_STATUS_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TICKET_ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TICKET_ORIGIN_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TK_ROLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="REPORT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REPORT_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OFFENCE_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OFFENCE_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="STREET_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MUNICIPALITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MUNICIPALITY_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OFFICER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OFFICER_ID_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PARTNER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PARTNER_ID_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SET_FINE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AMOUNT_OF_PENALTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PAYMENT_METHOD" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PAYMENT_METHOD_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PRINTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STATUTE_ACT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="STATUTE_ACT_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LEGAL_STATUTE_SECTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CHARGE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PERSON" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="INDIVIDUAL_SURNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="GIVEN_ONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GIVEN_TWO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GIVEN_THREE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MUNICIPALITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PROV_STATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PROV_STATE_CODE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="POSTAL_ZIPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GENDER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="STREET_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DRIVERS_LICENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DRIVERS_LICENCE_PROV_STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DRIVERS_LICENCE_PROV_STATE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CHARGE" maxOccurs="2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CHARGE_COUNTER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="STATUTE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="STATUTE_SECTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="STATUTE_WORDING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LEGAL_STATUTE_SECTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CHARGE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CHARGE_COUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SET_FINE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="AMOUNT_OF_PENALTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="VEHICLE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VEHICLE_LICENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LICENCE_PROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LICENCE_PROVINCE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MODEL_YEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VEHICLE_MAKE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VEHICLE_MAKE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="STYLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="STYLE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ORIGINAL_COLOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ORIGINAL_COLOUR_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CUSTOMDATA" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TK_YOUNG_PERSON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TK_DL_PRODUCED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TK_DL_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TK_CHANGE_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TK_NSC_PUJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TK_NSC_PUJ_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TK_NSC_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TK_REG_OWNER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TK_ACCIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TK_DISPUTE_LOCATION_ADDRESS_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TK_COURT_HEARING_LOCATION_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TK_WITNESSING_OFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TK_WITNESSING_OFFICER_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TK_CERTIFICATE_ENTITY_PERSON" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TK_CERTIFICATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TK_CERTIFICATE_SERVED_TO" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TK_CERTIFICATE_DATE_OF_SERVICE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jurisdiction",
        "jurisdictiontrans",
        "offencecount",
        "tickettype",
        "tickettypetrans",
        "ticketnum",
        "ticketclass",
        "ticketclasstrans",
        "ticketstatus",
        "ticketstatustrans",
        "ticketorigin",
        "ticketorigintrans",
        "tkrole",
        "reportdate",
        "reporttime",
        "offencedate",
        "offencetime",
        "streetname",
        "municipality",
        "municipalitytrans",
        "officerid",
        "officeridtrans",
        "partnerid",
        "partneridtrans",
        "setfineamount",
        "amountofpenalty",
        "paymentmethod",
        "paymentmethodtrans",
        "printed",
        "statuteact",
        "statuteacttrans",
        "legalstatutesection",
        "chargetext",
        "person",
        "vehicle",
        "customdata"
    })
    public static class REPORT {

        @XmlElement(name = "JURISDICTION", required = true)
        protected String jurisdiction;
        @XmlElement(name = "JURISDICTION_TRANS")
        protected String jurisdictiontrans;
        @XmlElement(name = "OFFENCE_COUNT")
        protected String offencecount;
        @XmlElement(name = "TICKET_TYPE")
        protected String tickettype;
        @XmlElement(name = "TICKET_TYPE_TRANS")
        protected String tickettypetrans;
        @XmlElement(name = "TICKET_NUM", required = true)
        protected String ticketnum;
        @XmlElement(name = "TICKET_CLASS")
        protected String ticketclass;
        @XmlElement(name = "TICKET_CLASS_TRANS")
        protected String ticketclasstrans;
        @XmlElement(name = "TICKET_STATUS")
        protected String ticketstatus;
        @XmlElement(name = "TICKET_STATUS_TRANS")
        protected String ticketstatustrans;
        @XmlElement(name = "TICKET_ORIGIN", required = true)
        protected String ticketorigin;
        @XmlElement(name = "TICKET_ORIGIN_TRANS", required = true)
        protected String ticketorigintrans;
        @XmlElement(name = "TK_ROLE", required = true)
        protected String tkrole;
        @XmlElement(name = "REPORT_DATE")
        protected String reportdate;
        @XmlElement(name = "REPORT_TIME")
        protected String reporttime;
        @XmlElement(name = "OFFENCE_DATE", required = true)
        protected String offencedate;
        @XmlElement(name = "OFFENCE_TIME", required = true)
        protected String offencetime;
        @XmlElement(name = "STREET_NAME", required = true)
        protected String streetname;
        @XmlElement(name = "MUNICIPALITY", required = true)
        protected String municipality;
        @XmlElement(name = "MUNICIPALITY_TRANS", required = true)
        protected String municipalitytrans;
        @XmlElement(name = "OFFICER_ID", required = true)
        protected String officerid;
        @XmlElement(name = "OFFICER_ID_TRANS", required = true)
        protected String officeridtrans;
        @XmlElement(name = "PARTNER_ID")
        protected String partnerid;
        @XmlElement(name = "PARTNER_ID_TRANS")
        protected String partneridtrans;
        @XmlElement(name = "SET_FINE_AMOUNT")
        protected String setfineamount;
        @XmlElement(name = "AMOUNT_OF_PENALTY", required = true)
        protected String amountofpenalty;
        @XmlElement(name = "PAYMENT_METHOD", required = true)
        protected String paymentmethod;
        @XmlElement(name = "PAYMENT_METHOD_TRANS", required = true)
        protected String paymentmethodtrans;
        @XmlElement(name = "PRINTED")
        protected String printed;
        @XmlElement(name = "STATUTE_ACT", required = true)
        protected String statuteact;
        @XmlElement(name = "STATUTE_ACT_TRANS")
        protected String statuteacttrans;
        @XmlElement(name = "LEGAL_STATUTE_SECTION", required = true)
        protected String legalstatutesection;
        @XmlElement(name = "CHARGE_TEXT", required = true)
        protected String chargetext;
        @XmlElement(name = "PERSON")
        protected List<XMLFILE.REPORT.PERSON> person;
        @XmlElement(name = "VEHICLE")
        protected List<XMLFILE.REPORT.VEHICLE> vehicle;
        @XmlElement(name = "CUSTOMDATA")
        protected List<XMLFILE.REPORT.CUSTOMDATA> customdata;
        @XmlAttribute(name = "TYPE")
        protected String type;

        /**
         * Gets the value of the jurisdiction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJURISDICTION() {
            return jurisdiction;
        }

        /**
         * Sets the value of the jurisdiction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJURISDICTION(String value) {
            this.jurisdiction = value;
        }

        /**
         * Gets the value of the jurisdictiontrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJURISDICTIONTRANS() {
            return jurisdictiontrans;
        }

        /**
         * Sets the value of the jurisdictiontrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJURISDICTIONTRANS(String value) {
            this.jurisdictiontrans = value;
        }

        /**
         * Gets the value of the offencecount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFENCECOUNT() {
            return offencecount;
        }

        /**
         * Sets the value of the offencecount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFENCECOUNT(String value) {
            this.offencecount = value;
        }

        /**
         * Gets the value of the tickettype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETTYPE() {
            return tickettype;
        }

        /**
         * Sets the value of the tickettype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETTYPE(String value) {
            this.tickettype = value;
        }

        /**
         * Gets the value of the tickettypetrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETTYPETRANS() {
            return tickettypetrans;
        }

        /**
         * Sets the value of the tickettypetrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETTYPETRANS(String value) {
            this.tickettypetrans = value;
        }

        /**
         * Gets the value of the ticketnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETNUM() {
            return ticketnum;
        }

        /**
         * Sets the value of the ticketnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETNUM(String value) {
            this.ticketnum = value;
        }

        /**
         * Gets the value of the ticketclass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETCLASS() {
            return ticketclass;
        }

        /**
         * Sets the value of the ticketclass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETCLASS(String value) {
            this.ticketclass = value;
        }

        /**
         * Gets the value of the ticketclasstrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETCLASSTRANS() {
            return ticketclasstrans;
        }

        /**
         * Sets the value of the ticketclasstrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETCLASSTRANS(String value) {
            this.ticketclasstrans = value;
        }

        /**
         * Gets the value of the ticketstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETSTATUS() {
            return ticketstatus;
        }

        /**
         * Sets the value of the ticketstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETSTATUS(String value) {
            this.ticketstatus = value;
        }

        /**
         * Gets the value of the ticketstatustrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETSTATUSTRANS() {
            return ticketstatustrans;
        }

        /**
         * Sets the value of the ticketstatustrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETSTATUSTRANS(String value) {
            this.ticketstatustrans = value;
        }

        /**
         * Gets the value of the ticketorigin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETORIGIN() {
            return ticketorigin;
        }

        /**
         * Sets the value of the ticketorigin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETORIGIN(String value) {
            this.ticketorigin = value;
        }

        /**
         * Gets the value of the ticketorigintrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTICKETORIGINTRANS() {
            return ticketorigintrans;
        }

        /**
         * Sets the value of the ticketorigintrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTICKETORIGINTRANS(String value) {
            this.ticketorigintrans = value;
        }

        /**
         * Gets the value of the tkrole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTKROLE() {
            return tkrole;
        }

        /**
         * Sets the value of the tkrole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTKROLE(String value) {
            this.tkrole = value;
        }

        /**
         * Gets the value of the reportdate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREPORTDATE() {
            return reportdate;
        }

        /**
         * Sets the value of the reportdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREPORTDATE(String value) {
            this.reportdate = value;
        }

        /**
         * Gets the value of the reporttime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREPORTTIME() {
            return reporttime;
        }

        /**
         * Sets the value of the reporttime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREPORTTIME(String value) {
            this.reporttime = value;
        }

        /**
         * Gets the value of the offencedate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFENCEDATE() {
            return offencedate;
        }

        /**
         * Sets the value of the offencedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFENCEDATE(String value) {
            this.offencedate = value;
        }

        /**
         * Gets the value of the offencetime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFENCETIME() {
            return offencetime;
        }

        /**
         * Sets the value of the offencetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFENCETIME(String value) {
            this.offencetime = value;
        }

        /**
         * Gets the value of the streetname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTREETNAME() {
            return streetname;
        }

        /**
         * Sets the value of the streetname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTREETNAME(String value) {
            this.streetname = value;
        }

        /**
         * Gets the value of the municipality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMUNICIPALITY() {
            return municipality;
        }

        /**
         * Sets the value of the municipality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMUNICIPALITY(String value) {
            this.municipality = value;
        }

        /**
         * Gets the value of the municipalitytrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMUNICIPALITYTRANS() {
            return municipalitytrans;
        }

        /**
         * Sets the value of the municipalitytrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMUNICIPALITYTRANS(String value) {
            this.municipalitytrans = value;
        }

        /**
         * Gets the value of the officerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFICERID() {
            return officerid;
        }

        /**
         * Sets the value of the officerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFICERID(String value) {
            this.officerid = value;
        }

        /**
         * Gets the value of the officeridtrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFICERIDTRANS() {
            return officeridtrans;
        }

        /**
         * Sets the value of the officeridtrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFICERIDTRANS(String value) {
            this.officeridtrans = value;
        }

        /**
         * Gets the value of the partnerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPARTNERID() {
            return partnerid;
        }

        /**
         * Sets the value of the partnerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPARTNERID(String value) {
            this.partnerid = value;
        }

        /**
         * Gets the value of the partneridtrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPARTNERIDTRANS() {
            return partneridtrans;
        }

        /**
         * Sets the value of the partneridtrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPARTNERIDTRANS(String value) {
            this.partneridtrans = value;
        }

        /**
         * Gets the value of the setfineamount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSETFINEAMOUNT() {
            return setfineamount;
        }

        /**
         * Sets the value of the setfineamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSETFINEAMOUNT(String value) {
            this.setfineamount = value;
        }

        /**
         * Gets the value of the amountofpenalty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMOUNTOFPENALTY() {
            return amountofpenalty;
        }

        /**
         * Sets the value of the amountofpenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMOUNTOFPENALTY(String value) {
            this.amountofpenalty = value;
        }

        /**
         * Gets the value of the paymentmethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTMETHOD() {
            return paymentmethod;
        }

        /**
         * Sets the value of the paymentmethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTMETHOD(String value) {
            this.paymentmethod = value;
        }

        /**
         * Gets the value of the paymentmethodtrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTMETHODTRANS() {
            return paymentmethodtrans;
        }

        /**
         * Sets the value of the paymentmethodtrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTMETHODTRANS(String value) {
            this.paymentmethodtrans = value;
        }

        /**
         * Gets the value of the printed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRINTED() {
            return printed;
        }

        /**
         * Sets the value of the printed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRINTED(String value) {
            this.printed = value;
        }

        /**
         * Gets the value of the statuteact property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUTEACT() {
            return statuteact;
        }

        /**
         * Sets the value of the statuteact property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUTEACT(String value) {
            this.statuteact = value;
        }

        /**
         * Gets the value of the statuteacttrans property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUTEACTTRANS() {
            return statuteacttrans;
        }

        /**
         * Sets the value of the statuteacttrans property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUTEACTTRANS(String value) {
            this.statuteacttrans = value;
        }

        /**
         * Gets the value of the legalstatutesection property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLEGALSTATUTESECTION() {
            return legalstatutesection;
        }

        /**
         * Sets the value of the legalstatutesection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLEGALSTATUTESECTION(String value) {
            this.legalstatutesection = value;
        }

        /**
         * Gets the value of the chargetext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHARGETEXT() {
            return chargetext;
        }

        /**
         * Sets the value of the chargetext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHARGETEXT(String value) {
            this.chargetext = value;
        }

        /**
         * Gets the value of the person property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the person property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPERSON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLFILE.REPORT.PERSON }
         * 
         * 
         */
        public List<XMLFILE.REPORT.PERSON> getPERSON() {
            if (person == null) {
                person = new ArrayList<XMLFILE.REPORT.PERSON>();
            }
            return this.person;
        }

        /**
         * Gets the value of the vehicle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVEHICLE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLFILE.REPORT.VEHICLE }
         * 
         * 
         */
        public List<XMLFILE.REPORT.VEHICLE> getVEHICLE() {
            if (vehicle == null) {
                vehicle = new ArrayList<XMLFILE.REPORT.VEHICLE>();
            }
            return this.vehicle;
        }

        /**
         * Gets the value of the customdata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customdata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCUSTOMDATA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLFILE.REPORT.CUSTOMDATA }
         * 
         * 
         */
        public List<XMLFILE.REPORT.CUSTOMDATA> getCUSTOMDATA() {
            if (customdata == null) {
                customdata = new ArrayList<XMLFILE.REPORT.CUSTOMDATA>();
            }
            return this.customdata;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TK_YOUNG_PERSON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TK_DL_PRODUCED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TK_DL_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TK_CHANGE_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TK_NSC_PUJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TK_NSC_PUJ_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TK_NSC_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TK_REG_OWNER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TK_ACCIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TK_DISPUTE_LOCATION_ADDRESS_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TK_COURT_HEARING_LOCATION_TRANS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TK_WITNESSING_OFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TK_WITNESSING_OFFICER_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TK_CERTIFICATE_ENTITY_PERSON" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TK_CERTIFICATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TK_CERTIFICATE_SERVED_TO" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TK_CERTIFICATE_DATE_OF_SERVICE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tkyoungperson",
            "tkdlproduced",
            "tkdlexpiry",
            "tkchangeaddress",
            "tknscpuj",
            "tknscpujtrans",
            "tknscnbr",
            "tkregownername",
            "tkaccident",
            "tkdisputelocationaddresstrans",
            "tkcourthearinglocationtrans",
            "tkwitnessingofficer",
            "tkwitnessingofficertrans",
            "tkcertificateentityperson",
            "tkcertificate",
            "tkcertificateservedto",
            "tkcertificatedateofservice"
        })
        public static class CUSTOMDATA {

            @XmlElement(name = "TK_YOUNG_PERSON")
            protected String tkyoungperson;
            @XmlElement(name = "TK_DL_PRODUCED")
            protected String tkdlproduced;
            @XmlElement(name = "TK_DL_EXPIRY")
            protected String tkdlexpiry;
            @XmlElement(name = "TK_CHANGE_ADDRESS")
            protected String tkchangeaddress;
            @XmlElement(name = "TK_NSC_PUJ")
            protected String tknscpuj;
            @XmlElement(name = "TK_NSC_PUJ_TRANS")
            protected String tknscpujtrans;
            @XmlElement(name = "TK_NSC_NBR")
            protected String tknscnbr;
            @XmlElement(name = "TK_REG_OWNER_NAME")
            protected String tkregownername;
            @XmlElement(name = "TK_ACCIDENT")
            protected String tkaccident;
            @XmlElement(name = "TK_DISPUTE_LOCATION_ADDRESS_TRANS", required = true)
            protected String tkdisputelocationaddresstrans;
            @XmlElement(name = "TK_COURT_HEARING_LOCATION_TRANS", required = true)
            protected String tkcourthearinglocationtrans;
            @XmlElement(name = "TK_WITNESSING_OFFICER")
            protected String tkwitnessingofficer;
            @XmlElement(name = "TK_WITNESSING_OFFICER_TRANS")
            protected String tkwitnessingofficertrans;
            @XmlElement(name = "TK_CERTIFICATE_ENTITY_PERSON", required = true)
            protected String tkcertificateentityperson;
            @XmlElement(name = "TK_CERTIFICATE", required = true)
            protected String tkcertificate;
            @XmlElement(name = "TK_CERTIFICATE_SERVED_TO", required = true)
            protected String tkcertificateservedto;
            @XmlElement(name = "TK_CERTIFICATE_DATE_OF_SERVICE", required = true)
            protected String tkcertificatedateofservice;

            /**
             * Gets the value of the tkyoungperson property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKYOUNGPERSON() {
                return tkyoungperson;
            }

            /**
             * Sets the value of the tkyoungperson property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKYOUNGPERSON(String value) {
                this.tkyoungperson = value;
            }

            /**
             * Gets the value of the tkdlproduced property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKDLPRODUCED() {
                return tkdlproduced;
            }

            /**
             * Sets the value of the tkdlproduced property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKDLPRODUCED(String value) {
                this.tkdlproduced = value;
            }

            /**
             * Gets the value of the tkdlexpiry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKDLEXPIRY() {
                return tkdlexpiry;
            }

            /**
             * Sets the value of the tkdlexpiry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKDLEXPIRY(String value) {
                this.tkdlexpiry = value;
            }

            /**
             * Gets the value of the tkchangeaddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKCHANGEADDRESS() {
                return tkchangeaddress;
            }

            /**
             * Sets the value of the tkchangeaddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKCHANGEADDRESS(String value) {
                this.tkchangeaddress = value;
            }

            /**
             * Gets the value of the tknscpuj property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKNSCPUJ() {
                return tknscpuj;
            }

            /**
             * Sets the value of the tknscpuj property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKNSCPUJ(String value) {
                this.tknscpuj = value;
            }

            /**
             * Gets the value of the tknscpujtrans property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKNSCPUJTRANS() {
                return tknscpujtrans;
            }

            /**
             * Sets the value of the tknscpujtrans property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKNSCPUJTRANS(String value) {
                this.tknscpujtrans = value;
            }

            /**
             * Gets the value of the tknscnbr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKNSCNBR() {
                return tknscnbr;
            }

            /**
             * Sets the value of the tknscnbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKNSCNBR(String value) {
                this.tknscnbr = value;
            }

            /**
             * Gets the value of the tkregownername property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKREGOWNERNAME() {
                return tkregownername;
            }

            /**
             * Sets the value of the tkregownername property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKREGOWNERNAME(String value) {
                this.tkregownername = value;
            }

            /**
             * Gets the value of the tkaccident property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKACCIDENT() {
                return tkaccident;
            }

            /**
             * Sets the value of the tkaccident property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKACCIDENT(String value) {
                this.tkaccident = value;
            }

            /**
             * Gets the value of the tkdisputelocationaddresstrans property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKDISPUTELOCATIONADDRESSTRANS() {
                return tkdisputelocationaddresstrans;
            }

            /**
             * Sets the value of the tkdisputelocationaddresstrans property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKDISPUTELOCATIONADDRESSTRANS(String value) {
                this.tkdisputelocationaddresstrans = value;
            }

            /**
             * Gets the value of the tkcourthearinglocationtrans property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKCOURTHEARINGLOCATIONTRANS() {
                return tkcourthearinglocationtrans;
            }

            /**
             * Sets the value of the tkcourthearinglocationtrans property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKCOURTHEARINGLOCATIONTRANS(String value) {
                this.tkcourthearinglocationtrans = value;
            }

            /**
             * Gets the value of the tkwitnessingofficer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKWITNESSINGOFFICER() {
                return tkwitnessingofficer;
            }

            /**
             * Sets the value of the tkwitnessingofficer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKWITNESSINGOFFICER(String value) {
                this.tkwitnessingofficer = value;
            }

            /**
             * Gets the value of the tkwitnessingofficertrans property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKWITNESSINGOFFICERTRANS() {
                return tkwitnessingofficertrans;
            }

            /**
             * Sets the value of the tkwitnessingofficertrans property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKWITNESSINGOFFICERTRANS(String value) {
                this.tkwitnessingofficertrans = value;
            }

            /**
             * Gets the value of the tkcertificateentityperson property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKCERTIFICATEENTITYPERSON() {
                return tkcertificateentityperson;
            }

            /**
             * Sets the value of the tkcertificateentityperson property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKCERTIFICATEENTITYPERSON(String value) {
                this.tkcertificateentityperson = value;
            }

            /**
             * Gets the value of the tkcertificate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKCERTIFICATE() {
                return tkcertificate;
            }

            /**
             * Sets the value of the tkcertificate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKCERTIFICATE(String value) {
                this.tkcertificate = value;
            }

            /**
             * Gets the value of the tkcertificateservedto property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKCERTIFICATESERVEDTO() {
                return tkcertificateservedto;
            }

            /**
             * Sets the value of the tkcertificateservedto property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKCERTIFICATESERVEDTO(String value) {
                this.tkcertificateservedto = value;
            }

            /**
             * Gets the value of the tkcertificatedateofservice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTKCERTIFICATEDATEOFSERVICE() {
                return tkcertificatedateofservice;
            }

            /**
             * Sets the value of the tkcertificatedateofservice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTKCERTIFICATEDATEOFSERVICE(String value) {
                this.tkcertificatedateofservice = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="INDIVIDUAL_SURNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="GIVEN_ONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GIVEN_TWO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GIVEN_THREE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MUNICIPALITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PROV_STATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PROV_STATE_CODE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="POSTAL_ZIPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GENDER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="STREET_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DRIVERS_LICENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DRIVERS_LICENCE_PROV_STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DRIVERS_LICENCE_PROV_STATE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CHARGE" maxOccurs="2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CHARGE_COUNTER" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="STATUTE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="STATUTE_SECTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="STATUTE_WORDING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LEGAL_STATUTE_SECTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CHARGE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CHARGE_COUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SET_FINE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="AMOUNT_OF_PENALTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "individualsurname",
            "givenone",
            "giventwo",
            "giventhree",
            "municipalityname",
            "provstatecode",
            "provstatecodetrans",
            "postalzipcode",
            "gendercode",
            "streetname",
            "dateofbirth",
            "driverslicencenumber",
            "driverslicenceprovstate",
            "driverslicenceprovstatetrans",
            "charge"
        })
        public static class PERSON {

            @XmlElement(name = "INDIVIDUAL_SURNAME", required = true)
            protected String individualsurname;
            @XmlElement(name = "GIVEN_ONE")
            protected String givenone;
            @XmlElement(name = "GIVEN_TWO")
            protected String giventwo;
            @XmlElement(name = "GIVEN_THREE")
            protected String giventhree;
            @XmlElement(name = "MUNICIPALITY_NAME")
            protected String municipalityname;
            @XmlElement(name = "PROV_STATE_CODE")
            protected String provstatecode;
            @XmlElement(name = "PROV_STATE_CODE_TRANS")
            protected String provstatecodetrans;
            @XmlElement(name = "POSTAL_ZIPCODE")
            protected String postalzipcode;
            @XmlElement(name = "GENDER_CODE")
            protected String gendercode;
            @XmlElement(name = "STREET_NAME")
            protected String streetname;
            @XmlElement(name = "DATE_OF_BIRTH")
            protected String dateofbirth;
            @XmlElement(name = "DRIVERS_LICENCE_NUMBER")
            protected String driverslicencenumber;
            @XmlElement(name = "DRIVERS_LICENCE_PROV_STATE")
            protected String driverslicenceprovstate;
            @XmlElement(name = "DRIVERS_LICENCE_PROV_STATE_TRANS")
            protected String driverslicenceprovstatetrans;
            @XmlElement(name = "CHARGE")
            protected List<XMLFILE.REPORT.PERSON.CHARGE> charge;

            /**
             * Gets the value of the individualsurname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINDIVIDUALSURNAME() {
                return individualsurname;
            }

            /**
             * Sets the value of the individualsurname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINDIVIDUALSURNAME(String value) {
                this.individualsurname = value;
            }

            /**
             * Gets the value of the givenone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGIVENONE() {
                return givenone;
            }

            /**
             * Sets the value of the givenone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGIVENONE(String value) {
                this.givenone = value;
            }

            /**
             * Gets the value of the giventwo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGIVENTWO() {
                return giventwo;
            }

            /**
             * Sets the value of the giventwo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGIVENTWO(String value) {
                this.giventwo = value;
            }

            /**
             * Gets the value of the giventhree property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGIVENTHREE() {
                return giventhree;
            }

            /**
             * Sets the value of the giventhree property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGIVENTHREE(String value) {
                this.giventhree = value;
            }

            /**
             * Gets the value of the municipalityname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMUNICIPALITYNAME() {
                return municipalityname;
            }

            /**
             * Sets the value of the municipalityname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMUNICIPALITYNAME(String value) {
                this.municipalityname = value;
            }

            /**
             * Gets the value of the provstatecode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROVSTATECODE() {
                return provstatecode;
            }

            /**
             * Sets the value of the provstatecode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROVSTATECODE(String value) {
                this.provstatecode = value;
            }

            /**
             * Gets the value of the provstatecodetrans property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROVSTATECODETRANS() {
                return provstatecodetrans;
            }

            /**
             * Sets the value of the provstatecodetrans property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROVSTATECODETRANS(String value) {
                this.provstatecodetrans = value;
            }

            /**
             * Gets the value of the postalzipcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOSTALZIPCODE() {
                return postalzipcode;
            }

            /**
             * Sets the value of the postalzipcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOSTALZIPCODE(String value) {
                this.postalzipcode = value;
            }

            /**
             * Gets the value of the gendercode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGENDERCODE() {
                return gendercode;
            }

            /**
             * Sets the value of the gendercode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGENDERCODE(String value) {
                this.gendercode = value;
            }

            /**
             * Gets the value of the streetname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTREETNAME() {
                return streetname;
            }

            /**
             * Sets the value of the streetname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTREETNAME(String value) {
                this.streetname = value;
            }

            /**
             * Gets the value of the dateofbirth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEOFBIRTH() {
                return dateofbirth;
            }

            /**
             * Sets the value of the dateofbirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEOFBIRTH(String value) {
                this.dateofbirth = value;
            }

            /**
             * Gets the value of the driverslicencenumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRIVERSLICENCENUMBER() {
                return driverslicencenumber;
            }

            /**
             * Sets the value of the driverslicencenumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRIVERSLICENCENUMBER(String value) {
                this.driverslicencenumber = value;
            }

            /**
             * Gets the value of the driverslicenceprovstate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRIVERSLICENCEPROVSTATE() {
                return driverslicenceprovstate;
            }

            /**
             * Sets the value of the driverslicenceprovstate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRIVERSLICENCEPROVSTATE(String value) {
                this.driverslicenceprovstate = value;
            }

            /**
             * Gets the value of the driverslicenceprovstatetrans property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRIVERSLICENCEPROVSTATETRANS() {
                return driverslicenceprovstatetrans;
            }

            /**
             * Sets the value of the driverslicenceprovstatetrans property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRIVERSLICENCEPROVSTATETRANS(String value) {
                this.driverslicenceprovstatetrans = value;
            }

            /**
             * Gets the value of the charge property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the charge property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCHARGE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link XMLFILE.REPORT.PERSON.CHARGE }
             * 
             * 
             */
            public List<XMLFILE.REPORT.PERSON.CHARGE> getCHARGE() {
                if (charge == null) {
                    charge = new ArrayList<XMLFILE.REPORT.PERSON.CHARGE>();
                }
                return this.charge;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CHARGE_COUNTER" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="STATUTE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="STATUTE_SECTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="STATUTE_WORDING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LEGAL_STATUTE_SECTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CHARGE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CHARGE_COUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SET_FINE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="AMOUNT_OF_PENALTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "chargecounter",
                "et",
                "statutename",
                "statutesection",
                "statutewording",
                "legalstatutesection",
                "chargetext",
                "chargecount",
                "setfineamount",
                "amountofpenalty"
            })
            public static class CHARGE {

                @XmlElement(name = "ID")
                protected String id;
                @XmlElement(name = "CHARGE_COUNTER", required = true)
                protected String chargecounter;
                @XmlElement(name = "ET")
                protected String et;
                @XmlElement(name = "STATUTE_NAME")
                protected String statutename;
                @XmlElement(name = "STATUTE_SECTION", required = true)
                protected String statutesection;
                @XmlElement(name = "STATUTE_WORDING")
                protected String statutewording;
                @XmlElement(name = "LEGAL_STATUTE_SECTION", required = true)
                protected String legalstatutesection;
                @XmlElement(name = "CHARGE_TEXT", required = true)
                protected String chargetext;
                @XmlElement(name = "CHARGE_COUNT")
                protected String chargecount;
                @XmlElement(name = "SET_FINE_AMOUNT", required = true)
                protected String setfineamount;
                @XmlElement(name = "AMOUNT_OF_PENALTY", required = true)
                protected String amountofpenalty;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the chargecounter property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCHARGECOUNTER() {
                    return chargecounter;
                }

                /**
                 * Sets the value of the chargecounter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCHARGECOUNTER(String value) {
                    this.chargecounter = value;
                }

                /**
                 * Gets the value of the et property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getET() {
                    return et;
                }

                /**
                 * Sets the value of the et property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setET(String value) {
                    this.et = value;
                }

                /**
                 * Gets the value of the statutename property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSTATUTENAME() {
                    return statutename;
                }

                /**
                 * Sets the value of the statutename property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSTATUTENAME(String value) {
                    this.statutename = value;
                }

                /**
                 * Gets the value of the statutesection property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSTATUTESECTION() {
                    return statutesection;
                }

                /**
                 * Sets the value of the statutesection property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSTATUTESECTION(String value) {
                    this.statutesection = value;
                }

                /**
                 * Gets the value of the statutewording property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSTATUTEWORDING() {
                    return statutewording;
                }

                /**
                 * Sets the value of the statutewording property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSTATUTEWORDING(String value) {
                    this.statutewording = value;
                }

                /**
                 * Gets the value of the legalstatutesection property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLEGALSTATUTESECTION() {
                    return legalstatutesection;
                }

                /**
                 * Sets the value of the legalstatutesection property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLEGALSTATUTESECTION(String value) {
                    this.legalstatutesection = value;
                }

                /**
                 * Gets the value of the chargetext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCHARGETEXT() {
                    return chargetext;
                }

                /**
                 * Sets the value of the chargetext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCHARGETEXT(String value) {
                    this.chargetext = value;
                }

                /**
                 * Gets the value of the chargecount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCHARGECOUNT() {
                    return chargecount;
                }

                /**
                 * Sets the value of the chargecount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCHARGECOUNT(String value) {
                    this.chargecount = value;
                }

                /**
                 * Gets the value of the setfineamount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSETFINEAMOUNT() {
                    return setfineamount;
                }

                /**
                 * Sets the value of the setfineamount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSETFINEAMOUNT(String value) {
                    this.setfineamount = value;
                }

                /**
                 * Gets the value of the amountofpenalty property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAMOUNTOFPENALTY() {
                    return amountofpenalty;
                }

                /**
                 * Sets the value of the amountofpenalty property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAMOUNTOFPENALTY(String value) {
                    this.amountofpenalty = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="VEHICLE_LICENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LICENCE_PROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LICENCE_PROVINCE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MODEL_YEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VEHICLE_MAKE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VEHICLE_MAKE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="STYLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="STYLE_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ORIGINAL_COLOUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ORIGINAL_COLOUR_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vehiclelicencenumber",
            "licenceprovince",
            "licenceprovincetrans",
            "modelyear",
            "vehiclemake",
            "vehiclemaketrans",
            "style",
            "styletrans",
            "originalcolour",
            "originalcolourtrans"
        })
        public static class VEHICLE {

            @XmlElement(name = "VEHICLE_LICENCE_NUMBER")
            protected String vehiclelicencenumber;
            @XmlElement(name = "LICENCE_PROVINCE")
            protected String licenceprovince;
            @XmlElement(name = "LICENCE_PROVINCE_TRANS")
            protected String licenceprovincetrans;
            @XmlElement(name = "MODEL_YEAR")
            protected String modelyear;
            @XmlElement(name = "VEHICLE_MAKE")
            protected String vehiclemake;
            @XmlElement(name = "VEHICLE_MAKE_TRANS")
            protected String vehiclemaketrans;
            @XmlElement(name = "STYLE")
            protected String style;
            @XmlElement(name = "STYLE_TRANS")
            protected String styletrans;
            @XmlElement(name = "ORIGINAL_COLOUR")
            protected String originalcolour;
            @XmlElement(name = "ORIGINAL_COLOUR_TRANS")
            protected String originalcolourtrans;

            /**
             * Gets the value of the vehiclelicencenumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVEHICLELICENCENUMBER() {
                return vehiclelicencenumber;
            }

            /**
             * Sets the value of the vehiclelicencenumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVEHICLELICENCENUMBER(String value) {
                this.vehiclelicencenumber = value;
            }

            /**
             * Gets the value of the licenceprovince property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLICENCEPROVINCE() {
                return licenceprovince;
            }

            /**
             * Sets the value of the licenceprovince property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLICENCEPROVINCE(String value) {
                this.licenceprovince = value;
            }

            /**
             * Gets the value of the licenceprovincetrans property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLICENCEPROVINCETRANS() {
                return licenceprovincetrans;
            }

            /**
             * Sets the value of the licenceprovincetrans property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLICENCEPROVINCETRANS(String value) {
                this.licenceprovincetrans = value;
            }

            /**
             * Gets the value of the modelyear property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMODELYEAR() {
                return modelyear;
            }

            /**
             * Sets the value of the modelyear property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMODELYEAR(String value) {
                this.modelyear = value;
            }

            /**
             * Gets the value of the vehiclemake property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVEHICLEMAKE() {
                return vehiclemake;
            }

            /**
             * Sets the value of the vehiclemake property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVEHICLEMAKE(String value) {
                this.vehiclemake = value;
            }

            /**
             * Gets the value of the vehiclemaketrans property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVEHICLEMAKETRANS() {
                return vehiclemaketrans;
            }

            /**
             * Sets the value of the vehiclemaketrans property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVEHICLEMAKETRANS(String value) {
                this.vehiclemaketrans = value;
            }

            /**
             * Gets the value of the style property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTYLE() {
                return style;
            }

            /**
             * Sets the value of the style property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTYLE(String value) {
                this.style = value;
            }

            /**
             * Gets the value of the styletrans property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTYLETRANS() {
                return styletrans;
            }

            /**
             * Sets the value of the styletrans property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTYLETRANS(String value) {
                this.styletrans = value;
            }

            /**
             * Gets the value of the originalcolour property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getORIGINALCOLOUR() {
                return originalcolour;
            }

            /**
             * Sets the value of the originalcolour property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setORIGINALCOLOUR(String value) {
                this.originalcolour = value;
            }

            /**
             * Gets the value of the originalcolourtrans property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getORIGINALCOLOURTRANS() {
                return originalcolourtrans;
            }

            /**
             * Sets the value of the originalcolourtrans property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setORIGINALCOLOURTRANS(String value) {
                this.originalcolourtrans = value;
            }

        }

    }

}
