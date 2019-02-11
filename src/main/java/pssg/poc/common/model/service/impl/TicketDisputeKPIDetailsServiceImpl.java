package pssg.poc.common.model.service.impl;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pssg.poc.common.model.dataaccess.entity.TicketDisputeKPIDetailsEntity;
import pssg.poc.common.model.dataaccess.repository.TicketDisputeKPIDetailsRepository;
import pssg.poc.common.model.icbcDisputeBundle.DisputeStatusUpdate;
import pssg.poc.common.model.icbcDisputeBundle.TicketDispute;
import pssg.poc.common.model.mapper.TicketDisputeKPIDetailsMapper;

/**
 * The Class TicketDisputeKPIDetailsServiceImpl.
 * @author HLiang
 */
@Component
public class TicketDisputeKPIDetailsServiceImpl {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(TicketDisputeKPIDetailsServiceImpl.class);

	/** The charge type maps repository. */
	@Autowired
	TicketDisputeKPIDetailsRepository ticketDisputeKPIDetailsRepository;
	
	/**
	 * Save ticket dispute KPI.
	 *
	 * @param disputeTicket the dispute ticket
	 * @return the long
	 */
	@Transactional(propagation = Propagation.REQUIRED)
    public Long saveTicketDisputeKPI(final TicketDispute disputeTicket) {
		logger.info("saveTicketDisputeKPI service impl call starts.");
		Long kpiID = null;
		try {
	        // save TicketDisputeKPIDetailsEntity
			TicketDisputeKPIDetailsEntity dbDT = ticketDisputeKPIDetailsRepository.save(TicketDisputeKPIDetailsMapper.mapToTicketDisputeKPIDetailsEntity(disputeTicket));
			kpiID = dbDT.getKPI_ID();
			logger.info("saveTicketDisputeKPI service impl call ends, kpiID: {}", kpiID);
		} catch (JpaSystemException | ConstraintViolationException e) {
			logger.error("Error saving ticket dispute kpi: {}", e.getMessage());
		} 
        return kpiID;
	}
	
	/**
	 * Save dispute status update KPI.
	 *
	 * @param disputeStatusUpdate the dispute status update
	 * @return the long
	 */
	@Transactional(propagation = Propagation.REQUIRED)
    public Long saveDisputeStatusUpdateKPI(final DisputeStatusUpdate disputeStatusUpdate) {
		logger.info("saveDisputeStatusUpdateKPI service impl call starts.");
		Long kpiID = null;
		try {
	        // save TicketDisputeKPIDetailsEntity
			TicketDisputeKPIDetailsEntity dbDT = ticketDisputeKPIDetailsRepository.save(TicketDisputeKPIDetailsMapper.mapToTicketDisputeKPIDetailsEntity(disputeStatusUpdate));
			kpiID = dbDT.getKPI_ID();
			logger.info("saveDisputeStatusUpdateKPI service impl call ends, kpiID: {}", kpiID);
		} catch (JpaSystemException | ConstraintViolationException e) {
			logger.error("Error saving dispute status update KPI: {}", e.getMessage());
		} 
        return kpiID;
	}
}
