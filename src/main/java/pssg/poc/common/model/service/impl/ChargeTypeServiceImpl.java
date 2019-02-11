package pssg.poc.common.model.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pssg.poc.common.model.dataaccess.entity.ChargeTypeMapsEntity;
import pssg.poc.common.model.dataaccess.repository.ChargeTypeMapsRepository;
import pssg.poc.common.model.internal.DisputedViolation;
import pssg.poc.common.model.mapper.ChargeTypeMapper;

/**
 * The Class ChargeTypeServiceImpl.
 * @author HLiang
 */
@Component
public class ChargeTypeServiceImpl {
	
	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(ChargeTypeServiceImpl.class);

	/** The charge type maps repository. */
	@Autowired
	ChargeTypeMapsRepository chargeTypeMapsRepository;
	
	/**
	 * Find charge types by ICBC charge txt.
	 *
	 * @param icbcChargeCode the icbc charge code
	 * @return the disputed violation
	 */
	public DisputedViolation findChargeTypesByICBCChargeTxt(final String icbcChargeCode) {
		logger.info("Look for charge details for compressed code: {}", icbcChargeCode);
		List<ChargeTypeMapsEntity> chargeTypes = chargeTypeMapsRepository.findChargeTypesByICBCChargeTxt(icbcChargeCode);
		if (chargeTypes == null || chargeTypes.size() < 1) {
			return null;
		}
		return ChargeTypeMapper.mapToDisputedViolation(chargeTypes.get(0));
	}
}
