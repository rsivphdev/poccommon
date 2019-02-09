package pssg.poc.common.model.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pssg.poc.common.model.error.VPHError;


/**
 * The Class VPHErrorsService.
 * @author HLiang
 */
@Service
public class VPHErrorsService {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(VPHErrorsService.class);
	
	/** The charge type service impl. */
	@Autowired
	pssg.poc.common.model.service.impl.VPHErrorServiceImpl vPHErrorServiceImpl;
	
	/**
	 * Gets the active errors.
	 *
	 * @return the active errors
	 */
	public List<VPHError> getActiveErrors() {
		logger.info("Get all active errors with these statuses: NEW, ASND");
		return vPHErrorServiceImpl.getActiveErrors();
	}
	
	/**
	 * Gets the error by error ID.
	 *
	 * @param errorID the error ID
	 * @return the error by error ID
	 */
	public VPHError getErrorByErrorID(final Long errorID) {
		logger.info("Get error by error ID: {}", errorID);
		return vPHErrorServiceImpl.getErrorByErrorID(errorID);
	}
	
	/**
	 * Save error.
	 *
	 * @param error the error
	 * @return the long
	 */
	public Long saveError(final VPHError error) {
		logger.info("Save error");
		return vPHErrorServiceImpl.saveError(error);
	}
}
