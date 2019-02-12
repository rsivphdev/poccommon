package pssg.poc.common.model.dataaccess.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class EtkErrorEntity.
 * @author HLiang
 */
@Entity
@Table(name = "VPH_ERRORS")
public class EtkErrorEntity implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8720783715923766030L;

	/** The error ID. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ERROR_ID")
	private Long ERROR_ID;
	
	/** The error severity. */
	@Column(name = "ERROR_SEVERITY_LEVEL_CD")
	private String ERROR_SEVERITY_LEVEL_CD;
	
	/** The error type. */
	@Column(name = "ERROR_CATEGORY_CD")
	private String ERROR_CATEGORY_CD;
	
	/** The error status. */
	@Column(name = "ERROR_STATUS_CD")
	private String ERROR_STATUS_CD;
	
	/** The create DT. */
	@Basic
	private LocalDateTime RECEIVED_DTM;
	
	/** The assigned role. */
	@Column(name = "ASSIGNED_TO_USER_ID")
	private String ASSIGNED_TO_USER_ID;
	
	/** The service nm. */
	@Column(name = "SERVICE_NM")
	private String SERVICE_NM;
	
	/** The icbc txt. */
	@Column(name = "ICBC_TXT")
	private String ICBC_TXT;
	
	/** The prime txt. */
	@Column(name = "PRIME_TXT")
	private String PRIME_TXT;
	
	/** The justin txt. */
	@Column(name = "JUSTIN_TXT")
	private String JUSTIN_TXT;
	
	/** The ent user id. */
	@Column(name = "ENT_USER_ID")
	private String ENT_USER_ID;
	
	/** The ent dtm. */
	@Basic
	private LocalDateTime ENT_DTM;
	
	/** The upd user id. */
	@Column(name = "UPD_USER_ID")
	private String UPD_USER_ID;
		
	/** The update DT. */
	@Basic
	private LocalDateTime UPD_DTM;
	
	/** The ticket no. */
	@Column(name = "TICKET_NO")
	private String TICKET_NO;
	
	/** The contravention no. */
	@Column(name = "CONTRAVENTION_NO")
	private String CONTRAVENTION_NO;
	
	/** The process no. */
	@Column(name = "PROCESS_NO")
	private String PROCESS_NO;
	
	/** The details txt. */
	@Column(name = "DETAILS_TXT")
	private String DETAILS_TXT;
	
	/** The file nm. */
	@Column(name = "FILE_NM")
	private String FILE_NM;
	
	/** The error cd. */
	@Column(name = "ERROR_CD")
	private String ERROR_CD;

	/**
	 * Gets the error id.
	 *
	 * @return the error id
	 */
	public Long getERROR_ID() {
		return ERROR_ID;
	}

	/**
	 * Sets the error id.
	 *
	 * @param eRROR_ID the new error id
	 */
	public void setERROR_ID(Long eRROR_ID) {
		ERROR_ID = eRROR_ID;
	}

	/**
	 * Gets the error severity level cd.
	 *
	 * @return the error severity level cd
	 */
	public String getERROR_SEVERITY_LEVEL_CD() {
		return ERROR_SEVERITY_LEVEL_CD;
	}

	/**
	 * Sets the error severity level cd.
	 *
	 * @param eRROR_SEVERITY_LEVEL_CD the new error severity level cd
	 */
	public void setERROR_SEVERITY_LEVEL_CD(String eRROR_SEVERITY_LEVEL_CD) {
		ERROR_SEVERITY_LEVEL_CD = eRROR_SEVERITY_LEVEL_CD;
	}

	/**
	 * Gets the error category cd.
	 *
	 * @return the error category cd
	 */
	public String getERROR_CATEGORY_CD() {
		return ERROR_CATEGORY_CD;
	}

	/**
	 * Sets the error category cd.
	 *
	 * @param eRROR_CATEGORY_CD the new error category cd
	 */
	public void setERROR_CATEGORY_CD(String eRROR_CATEGORY_CD) {
		ERROR_CATEGORY_CD = eRROR_CATEGORY_CD;
	}

	/**
	 * Gets the error status cd.
	 *
	 * @return the error status cd
	 */
	public String getERROR_STATUS_CD() {
		return ERROR_STATUS_CD;
	}

	/**
	 * Sets the error status cd.
	 *
	 * @param eRROR_STATUS_CD the new error status cd
	 */
	public void setERROR_STATUS_CD(String eRROR_STATUS_CD) {
		ERROR_STATUS_CD = eRROR_STATUS_CD;
	}

	/**
	 * Gets the received dtm.
	 *
	 * @return the received dtm
	 */
	public LocalDateTime getRECEIVED_DTM() {
		return RECEIVED_DTM;
	}

	/**
	 * Sets the received dtm.
	 *
	 * @param rECEIVED_DTM the new received dtm
	 */
	public void setRECEIVED_DTM(LocalDateTime rECEIVED_DTM) {
		RECEIVED_DTM = rECEIVED_DTM;
	}

	/**
	 * Gets the assigned to user id.
	 *
	 * @return the assigned to user id
	 */
	public String getASSIGNED_TO_USER_ID() {
		return ASSIGNED_TO_USER_ID;
	}

	/**
	 * Sets the assigned to user id.
	 *
	 * @param aSSIGNED_TO_USER_ID the new assigned to user id
	 */
	public void setASSIGNED_TO_USER_ID(String aSSIGNED_TO_USER_ID) {
		ASSIGNED_TO_USER_ID = aSSIGNED_TO_USER_ID;
	}

	/**
	 * Gets the service nm.
	 *
	 * @return the service nm
	 */
	public String getSERVICE_NM() {
		return SERVICE_NM;
	}

	/**
	 * Sets the service nm.
	 *
	 * @param sERVICE_NM the new service nm
	 */
	public void setSERVICE_NM(String sERVICE_NM) {
		SERVICE_NM = sERVICE_NM;
	}

	/**
	 * Gets the icbc txt.
	 *
	 * @return the icbc txt
	 */
	public String getICBC_TXT() {
		return ICBC_TXT;
	}

	/**
	 * Sets the icbc txt.
	 *
	 * @param iCBC_TXT the new icbc txt
	 */
	public void setICBC_TXT(String iCBC_TXT) {
		ICBC_TXT = iCBC_TXT;
	}

	/**
	 * Gets the prime txt.
	 *
	 * @return the prime txt
	 */
	public String getPRIME_TXT() {
		return PRIME_TXT;
	}

	/**
	 * Sets the prime txt.
	 *
	 * @param pRIME_TXT the new prime txt
	 */
	public void setPRIME_TXT(String pRIME_TXT) {
		PRIME_TXT = pRIME_TXT;
	}

	/**
	 * Gets the justin txt.
	 *
	 * @return the justin txt
	 */
	public String getJUSTIN_TXT() {
		return JUSTIN_TXT;
	}

	/**
	 * Sets the justin txt.
	 *
	 * @param jUSTIN_TXT the new justin txt
	 */
	public void setJUSTIN_TXT(String jUSTIN_TXT) {
		JUSTIN_TXT = jUSTIN_TXT;
	}

	/**
	 * Gets the ent user id.
	 *
	 * @return the ent user id
	 */
	public String getENT_USER_ID() {
		return ENT_USER_ID;
	}

	/**
	 * Sets the ent user id.
	 *
	 * @param eNT_USER_ID the new ent user id
	 */
	public void setENT_USER_ID(String eNT_USER_ID) {
		ENT_USER_ID = eNT_USER_ID;
	}

	/**
	 * Gets the ent dtm.
	 *
	 * @return the ent dtm
	 */
	public LocalDateTime getENT_DTM() {
		return ENT_DTM;
	}

	/**
	 * Sets the ent dtm.
	 *
	 * @param eNT_DTM the new ent dtm
	 */
	public void setENT_DTM(LocalDateTime eNT_DTM) {
		ENT_DTM = eNT_DTM;
	}

	/**
	 * Gets the upd user id.
	 *
	 * @return the upd user id
	 */
	public String getUPD_USER_ID() {
		return UPD_USER_ID;
	}

	/**
	 * Sets the upd user id.
	 *
	 * @param uPD_USER_ID the new upd user id
	 */
	public void setUPD_USER_ID(String uPD_USER_ID) {
		UPD_USER_ID = uPD_USER_ID;
	}

	/**
	 * Gets the upd dtm.
	 *
	 * @return the upd dtm
	 */
	public LocalDateTime getUPD_DTM() {
		return UPD_DTM;
	}

	/**
	 * Sets the upd dtm.
	 *
	 * @param uPD_DTM the new upd dtm
	 */
	public void setUPD_DTM(LocalDateTime uPD_DTM) {
		UPD_DTM = uPD_DTM;
	}

	/**
	 * Gets the ticket no.
	 *
	 * @return the ticket no
	 */
	public String getTICKET_NO() {
		return TICKET_NO;
	}

	/**
	 * Sets the ticket no.
	 *
	 * @param tICKET_NO the new ticket no
	 */
	public void setTICKET_NO(String tICKET_NO) {
		TICKET_NO = tICKET_NO;
	}

	/**
	 * Gets the contravention no.
	 *
	 * @return the contravention no
	 */
	public String getCONTRAVENTION_NO() {
		return CONTRAVENTION_NO;
	}

	/**
	 * Sets the contravention no.
	 *
	 * @param cONTRAVENTION_NO the new contravention no
	 */
	public void setCONTRAVENTION_NO(String cONTRAVENTION_NO) {
		CONTRAVENTION_NO = cONTRAVENTION_NO;
	}

	/**
	 * Checks if is process no.
	 *
	 * @return true, if is process no
	 */
	public String isPROCESS_NO() {
		return PROCESS_NO;
	}

	/**
	 * Sets the process no.
	 *
	 * @param pROCESS_NO the new process no
	 */
	public void setPROCESS_NO(String pROCESS_NO) {
		PROCESS_NO = pROCESS_NO;
	}

	/**
	 * Gets the details txt.
	 *
	 * @return the details txt
	 */
	public String getDETAILS_TXT() {
		return DETAILS_TXT;
	}

	/**
	 * Sets the details txt.
	 *
	 * @param dETAILS_TXT the new details txt
	 */
	public void setDETAILS_TXT(String dETAILS_TXT) {
		DETAILS_TXT = dETAILS_TXT;
	}

	/**
	 * Gets the file nm.
	 *
	 * @return the file nm
	 */
	public String getFILE_NM() {
		return FILE_NM;
	}

	/**
	 * Sets the file nm.
	 *
	 * @param fILE_NM the new file nm
	 */
	public void setFILE_NM(String fILE_NM) {
		FILE_NM = fILE_NM;
	}

	/**
	 * Gets the error cd.
	 *
	 * @return the error cd
	 */
	public String getERROR_CD() {
		return ERROR_CD;
	}

	/**
	 * Sets the error cd.
	 *
	 * @param eRROR_CD the new error cd
	 */
	public void setERROR_CD(String eRROR_CD) {
		ERROR_CD = eRROR_CD;
	}

	/**
	 * Gets the process no.
	 *
	 * @return the process no
	 */
	public String getPROCESS_NO() {
		return PROCESS_NO;
	}
	
	
}
