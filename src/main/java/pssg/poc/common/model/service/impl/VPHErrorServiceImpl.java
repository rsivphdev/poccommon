package pssg.poc.common.model.service.impl;

import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Component;

import pssg.poc.common.model.dataaccess.entity.EtkErrorEntity;
import pssg.poc.common.model.dataaccess.repository.VPHErrorsRepository;
import pssg.poc.common.model.error.VPHError;
import pssg.poc.common.model.mapper.VPHErrorMapper;



/**
 * The Class VPHErrorServiceImpl.
 * @author HLiang
 */
@Component
public class VPHErrorServiceImpl {
	
	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(VPHErrorServiceImpl.class);

	/** The v PH errors repository. */
	@Autowired
	VPHErrorsRepository vPHErrorsRepository;
	
	/**
	 * Gets the active errors.
	 *
	 * @return the active errors
	 */
	public List<VPHError> getActiveErrors() {
		logger.info("Get all active errors with these statuses: NEW, ASND");
		List<EtkErrorEntity> vphErrors = vPHErrorsRepository.findErrorsByErrorStatuses();
		return VPHErrorMapper.mapToVPHErrors(vphErrors);
	}
	
	/**
	 * Gets the error by error ID.
	 *
	 * @param errorID the error ID
	 * @return the error by error ID
	 */
	public VPHError getErrorByErrorID(final Long errorID) {
		logger.info("Get error by errorID: {}", errorID);
		EtkErrorEntity vphError = vPHErrorsRepository.findErrorByErrorID(errorID);
		return VPHErrorMapper.mapToVPHError(vphError);
	}
	
	/**
	 * Save error.
	 *
	 * @param error the error
	 * @return the long
	 */
	public Long saveError(final VPHError error) {
		logger.info("Save error");
		EtkErrorEntity dbObj = null;
		Long errorID = null;
		try {
			dbObj = vPHErrorsRepository.save(VPHErrorMapper.mapToEtkErrorEntity(error));
			errorID = dbObj.getERROR_ID();
			logger.info("Error saved");
		} catch (JpaSystemException | ConstraintViolationException e) {
			logger.error("Error saving error: {}", e.getMessage());
		} 
		return errorID;
	}
}
