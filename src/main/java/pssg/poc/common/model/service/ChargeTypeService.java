package pssg.poc.common.model.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pssg.poc.common.model.internal.DisputedViolation;
import pssg.poc.common.model.service.impl.ChargeTypeServiceImpl;

/**
 * The Class ChargeTypeService.
 * @author HLiang
 */
@Service
public class ChargeTypeService {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(ChargeTypeService.class);
	
	/** The charge type service impl. */
	@Autowired
	ChargeTypeServiceImpl chargeTypeServiceImpl;
	
	/**
	 * Find charge types by ICBC charge txt.
	 *
	 * @param icbcChargeCode the icbc charge code
	 * @return the disputed violation
	 */
	public DisputedViolation findChargeTypesByICBCChargeTxt(final String icbcChargeCode) {
		logger.info("Look for charge details for compressed code: {}", icbcChargeCode);
		return chargeTypeServiceImpl.findChargeTypesByICBCChargeTxt(icbcChargeCode);
	}
}
