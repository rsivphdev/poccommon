package pssg.poc.common.model.mapper;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import pssg.poc.common.model.dataaccess.entity.EtkErrorEntity;
import pssg.poc.common.model.enums.EnumErrorCategory;
import pssg.poc.common.model.enums.EnumErrorSeverity;
import pssg.poc.common.model.enums.EnumErrorStatus;
import pssg.poc.common.model.internal.VPHError;

/**
 * The Class VPHErrorMapper.
 * @author HLiang
 */
public class VPHErrorMapper {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(VPHErrorMapper.class);
	
	/**
	 * Map to VPH error.
	 *
	 * @param entity the entity
	 * @return the VPH error
	 */
	public static VPHError mapToVPHError(final EtkErrorEntity entity) {
		logger.info("Map EtkErrorEntity to VPHError object");
		VPHError vphError = new VPHError();
		vphError.setAssignedRole(entity.getASSIGNED_TO_USER_ID());
		vphError.setCorrelationContraventionNumber(entity.getCONTRAVENTION_NO());
		vphError.setCorrelationProcessID(entity.getPROCESS_NO());
		vphError.setCorrelationTicketFileName(entity.getFILE_NM());
		vphError.setCorrelationTicketNumber(entity.getTICKET_NO());
		vphError.setCreateDT(entity.getENT_DTM());
		vphError.setErrorCategory(!StringUtils.isEmpty(entity.getERROR_CATEGORY_CD()) ? EnumErrorCategory.getEnumfromCodeValue(entity.getERROR_CATEGORY_CD()) : null);
		vphError.setErrorCode(entity.getERROR_CD());
		vphError.setErrorDescription(entity.getDETAILS_TXT());
		vphError.setErrorID(entity.getERROR_ID());
		vphError.setErrorSeverity(!StringUtils.isEmpty(entity.getERROR_SEVERITY_LEVEL_CD()) ? EnumErrorSeverity.getEnumfromCodeValue(entity.getERROR_SEVERITY_LEVEL_CD()) : null);
		//vphError.setErrorSource(entity.get);
		vphError.setErrorStatus(!StringUtils.isEmpty(entity.getERROR_STATUS_CD()) ? EnumErrorStatus.getEnumfromCodeValue(entity.getERROR_STATUS_CD()) : null);
		vphError.setICBCText(entity.getICBC_TXT());
		vphError.setJUSTINText(entity.getJUSTIN_TXT());
		vphError.setPRIMEText(entity.getPRIME_TXT());
		//vphError.setTicketFileExist(ticketFileExist);
		vphError.setUpdateDT(entity.getUPD_DTM());
		vphError.setUpdateUserID(entity.getUPD_USER_ID());
		return vphError;
	}
	
	
	/**
	 * Map to etk error entity.
	 *
	 * @param error the error
	 * @return the etk error entity
	 */
	public static EtkErrorEntity mapToEtkErrorEntity(final VPHError error) {
		logger.info("Map VPHError to EtkErrorEntity object");
		EtkErrorEntity etkErrorEntity = new EtkErrorEntity();
		etkErrorEntity.setASSIGNED_TO_USER_ID(error.getAssignedRole());
		etkErrorEntity.setCONTRAVENTION_NO(error.getCorrelationContraventionNumber());
		etkErrorEntity.setDETAILS_TXT(error.getErrorDescription());
		etkErrorEntity.setENT_USER_ID("scweb");
		etkErrorEntity.setERROR_CATEGORY_CD(error.getErrorCategory() != null ? error.getErrorCategory().getCodeValue() : EnumErrorCategory.OTHER.getCodeValue());
		etkErrorEntity.setERROR_CD(error.getErrorCode());
		etkErrorEntity.setERROR_SEVERITY_LEVEL_CD(error.getErrorSeverity() != null ? error.getErrorSeverity().getCodeValue() : EnumErrorSeverity.IF.getCodeValue());
		etkErrorEntity.setERROR_STATUS_CD(error.getErrorStatus() != null ? error.getErrorStatus().getCodeValue() : EnumErrorStatus.NEW.getCodeValue());
		etkErrorEntity.setFILE_NM(error.getCorrelationTicketFileName());
		etkErrorEntity.setICBC_TXT(error.getICBCText());
		etkErrorEntity.setJUSTIN_TXT(error.getJUSTINText());
		etkErrorEntity.setPRIME_TXT(error.getPRIMEText());
		etkErrorEntity.setPROCESS_NO(error.getCorrelationProcessID());
		etkErrorEntity.setSERVICE_NM(error.getErrorSource());
		etkErrorEntity.setTICKET_NO(error.getCorrelationTicketNumber());
		return etkErrorEntity;
	}
	
	
	/**
	 * Map to VPH errors.
	 *
	 * @param entities the entities
	 * @return the list
	 */
	public static List<VPHError> mapToVPHErrors(final List<EtkErrorEntity> entities) {
		logger.info("Map a list of EtkErrorEntity to a list of VPHError objects");
		List<VPHError> vphErrors = new ArrayList<VPHError>();
		
		for (EtkErrorEntity e : entities) {
			vphErrors.add(mapToVPHError(e));
		}
		return vphErrors;
	}
}
