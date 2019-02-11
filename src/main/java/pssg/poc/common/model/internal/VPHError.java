package pssg.poc.common.model.internal;

import java.time.LocalDateTime;

import org.springframework.util.StringUtils;

import pssg.poc.common.model.enums.EnumErrorCategory;
import pssg.poc.common.model.enums.EnumErrorSeverity;
import pssg.poc.common.model.enums.EnumErrorStatus;
import pssg.poc.common.model.enums.EnumInterface;


/**
 * The Class VPHError.
 * @author HLiang
 */
public class VPHError {
	/** The Constant Interface_issuance_prefix. */
	private static final String Interface_issuance_prefix = "I";
	
	/** The Constant Interface_paymentQuery_prefix. */
	private static final String Interface_paymentQuery_prefix = "Q";
	
	/** The Constant Interface_receiptCreation_prefix. */
	private static final String Interface_receiptCreation_prefix = "C";
	
	/** The Constant Interface_fileDeletion_prefix. */
	private static final String Interface_fileDeletion_prefix = "I.4.2";
	
	/** The Constant Interface_ticketDispute_prefix. */
	private static final String Interface_ticketDispute_prefix = "D";
	
	/** The Constant Interface_statusUpdate_prefix. */
	private static final String Interface_statusUpdate_prefix = "S";
	
	/** The error ID. */
	private Long errorID;
	
	/** The error severity. */
	private EnumErrorSeverity errorSeverity;
	
	/** The error type. */
	private EnumErrorCategory errorCategory;
	
	/** The error status. */
	private EnumErrorStatus errorStatus;
	
	/** The create DT. */
	private LocalDateTime createDT;
	
	/** The update DT. */
	private LocalDateTime updateDT;
	
	/** The error description. */
	private String errorDescription;
	
	/** The correlation ticket file name. */
	private String correlationTicketFileName;
	
	/** The correlation ticket number. */
	private String correlationTicketNumber;
	
	/** The correlation contravention number. */
	private String correlationContraventionNumber;
	
	/** The correlation process ID. */
	private String correlationProcessID;
	
	/** The assigned role. */
	private String assignedRole;
	
	/** The ICBC text. */
	private String ICBCText;
	
	/** The PRIME text. */
	private String PRIMEText;
	
	/** The JUSTIN text. */
	private String JUSTINText;
	
	/** The update user ID. */
	private String updateUserID;
	
	/** The error source. */
	private String errorSource;
	
	/** The error code. */
	private String errorCode;

	/** The vph interface. */
	private EnumInterface vphInterface;
	
	/**
	 * Gets the error ID.
	 *
	 * @return the error ID
	 */
	public Long getErrorID() {
		return errorID;
	}

	/**
	 * Sets the error ID.
	 *
	 * @param errorID the new error ID
	 */
	public void setErrorID(Long errorID) {
		this.errorID = errorID;
	}

	/**
	 * Gets the error severity.
	 *
	 * @return the error severity
	 */
	public EnumErrorSeverity getErrorSeverity() {
		return errorSeverity;
	}

	/**
	 * Sets the error severity.
	 *
	 * @param errorSeverity the new error severity
	 */
	public void setErrorSeverity(EnumErrorSeverity errorSeverity) {
		this.errorSeverity = errorSeverity;
	}

	/**
	 * Gets the error category.
	 *
	 * @return the error category
	 */
	public EnumErrorCategory getErrorCategory() {
		return errorCategory;
	}

	/**
	 * Sets the error category.
	 *
	 * @param errorCategory the new error category
	 */
	public void setErrorCategory(EnumErrorCategory errorCategory) {
		this.errorCategory = errorCategory;
	}

	/**
	 * Gets the error status.
	 *
	 * @return the error status
	 */
	public EnumErrorStatus getErrorStatus() {
		return errorStatus;
	}

	/**
	 * Sets the error status.
	 *
	 * @param errorStatus the new error status
	 */
	public void setErrorStatus(EnumErrorStatus errorStatus) {
		this.errorStatus = errorStatus;
	}

	/**
	 * Gets the creates the DT.
	 *
	 * @return the creates the DT
	 */
	public LocalDateTime getCreateDT() {
		return createDT;
	}

	/**
	 * Sets the creates the DT.
	 *
	 * @param createDT the new creates the DT
	 */
	public void setCreateDT(LocalDateTime createDT) {
		this.createDT = createDT;
	}

	/**
	 * Gets the update DT.
	 *
	 * @return the update DT
	 */
	public LocalDateTime getUpdateDT() {
		return updateDT;
	}

	/**
	 * Sets the update DT.
	 *
	 * @param updateDT the new update DT
	 */
	public void setUpdateDT(LocalDateTime updateDT) {
		this.updateDT = updateDT;
	}

	/**
	 * Gets the error description.
	 *
	 * @return the error description
	 */
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * Sets the error description.
	 *
	 * @param errorDescription the new error description
	 */
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	/**
	 * Gets the correlation ticket file name.
	 *
	 * @return the correlation ticket file name
	 */
	public String getCorrelationTicketFileName() {
		return correlationTicketFileName;
	}

	/**
	 * Sets the correlation ticket file name.
	 *
	 * @param correlationTicketFileName the new correlation ticket file name
	 */
	public void setCorrelationTicketFileName(String correlationTicketFileName) {
		this.correlationTicketFileName = correlationTicketFileName;
	}

	
	/**
	 * Gets the correlation ticket number.
	 *
	 * @return the correlation ticket number
	 */
	public String getCorrelationTicketNumber() {
		return correlationTicketNumber;
	}

	/**
	 * Sets the correlation ticket number.
	 *
	 * @param correlationTicketNumber the new correlation ticket number
	 */
	public void setCorrelationTicketNumber(String correlationTicketNumber) {
		this.correlationTicketNumber = correlationTicketNumber;
	}

	/**
	 * Gets the correlation contravention number.
	 *
	 * @return the correlation contravention number
	 */
	public String getCorrelationContraventionNumber() {
		return correlationContraventionNumber;
	}

	/**
	 * Sets the correlation contravention number.
	 *
	 * @param correlationContraventionNumber the new correlation contravention number
	 */
	public void setCorrelationContraventionNumber(String correlationContraventionNumber) {
		this.correlationContraventionNumber = correlationContraventionNumber;
	}

	/**
	 * Gets the correlation process ID.
	 *
	 * @return the correlation process ID
	 */
	public String getCorrelationProcessID() {
		return correlationProcessID;
	}

	/**
	 * Sets the correlation process ID.
	 *
	 * @param correlationProcessID the new correlation process ID
	 */
	public void setCorrelationProcessID(String correlationProcessID) {
		this.correlationProcessID = correlationProcessID;
	}

	/**
	 * Gets the assigned role.
	 *
	 * @return the assigned role
	 */
	public String getAssignedRole() {
		return assignedRole;
	}

	/**
	 * Sets the assigned role.
	 *
	 * @param assignedRole the new assigned role
	 */
	public void setAssignedRole(String assignedRole) {
		this.assignedRole = assignedRole;
	}

	/**
	 * Gets the ICBC text.
	 *
	 * @return the ICBC text
	 */
	public String getICBCText() {
		return ICBCText;
	}

	/**
	 * Sets the ICBC text.
	 *
	 * @param iCBCText the new ICBC text
	 */
	public void setICBCText(String iCBCText) {
		ICBCText = iCBCText;
	}

	/**
	 * Gets the PRIME text.
	 *
	 * @return the PRIME text
	 */
	public String getPRIMEText() {
		return PRIMEText;
	}

	/**
	 * Sets the PRIME text.
	 *
	 * @param pRIMEText the new PRIME text
	 */
	public void setPRIMEText(String pRIMEText) {
		PRIMEText = pRIMEText;
	}

	/**
	 * Gets the JUSTIN text.
	 *
	 * @return the JUSTIN text
	 */
	public String getJUSTINText() {
		return JUSTINText;
	}

	/**
	 * Sets the JUSTIN text.
	 *
	 * @param jUSTINText the new JUSTIN text
	 */
	public void setJUSTINText(String jUSTINText) {
		JUSTINText = jUSTINText;
	}

	/**
	 * Gets the update user ID.
	 *
	 * @return the update user ID
	 */
	public String getUpdateUserID() {
		return updateUserID;
	}

	/**
	 * Sets the update user ID.
	 *
	 * @param updateUserID the new update user ID
	 */
	public void setUpdateUserID(String updateUserID) {
		this.updateUserID = updateUserID;
	}

	/**
	 * Gets the error source.
	 *
	 * @return the error source
	 */
	public String getErrorSource() {
		return errorSource;
	}

	/**
	 * Sets the error source.
	 *
	 * @param errorSource the new error source
	 */
	public void setErrorSource(String errorSource) {
		this.errorSource = errorSource;
	}

	/**
	 * Gets the error code.
	 *
	 * @return the error code
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * Sets the error code.
	 *
	 * @param errorCode the new error code
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * Gets the vph interface.
	 *
	 * @return the vph interface
	 */
	public EnumInterface getVphInterface() {
		return getVphInterfaceHelper(this.errorCode);
	}

	/**
	 * Gets the vph interface helper.
	 *
	 * @param errorCode the error code
	 * @return the vph interface helper
	 */
	private EnumInterface getVphInterfaceHelper(final String errorCode) {
		if (StringUtils.isEmpty(this.errorCode)) {
			return EnumInterface.VPH_G;
		} 
		
		if (this.errorCode.startsWith(Interface_fileDeletion_prefix)) {
			return EnumInterface.VPH_FD;	
		} 
		
		if (this.errorCode.startsWith(Interface_issuance_prefix)) {
			return EnumInterface.ICBC_CC;	
		} 
		
		if (this.errorCode.startsWith(Interface_paymentQuery_prefix)) {
			return EnumInterface.ICBC_QT;	
		} 
		
		if (this.errorCode.startsWith(Interface_receiptCreation_prefix)) {
			return EnumInterface.ICBC_CR;	
		} 
		
		if (this.errorCode.startsWith(Interface_ticketDispute_prefix)) {
			return EnumInterface.VPH_TD;	
		}
		
		if (this.errorCode.startsWith(Interface_statusUpdate_prefix)) {
			return EnumInterface.VPH_SU;	
		}
		
		return EnumInterface.VPH_G;
	}
}
