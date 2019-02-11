package pssg.poc.common.model.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pssg.poc.common.model.icbcDisputeBundle.DisputeStatusUpdate;
import pssg.poc.common.model.icbcDisputeBundle.TicketDispute;
import pssg.poc.common.model.service.impl.TicketDisputeKPIDetailsServiceImpl;

/**
 * The Class TicketDisputeKPIDetailsService.
 * @author HLiang
 */
@Service
public class TicketDisputeKPIDetailsService {
	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(TicketDisputeKPIDetailsService.class);

	/** The ticket dispute KPI details service impl. */
	@Autowired
	TicketDisputeKPIDetailsServiceImpl ticketDisputeKPIDetailsServiceImpl;
	
	/**
	 * Save ticket dispute KPI.
	 *
	 * @param disputeTicket the dispute ticket
	 * @return true, if successful
	 */
	public boolean saveTicketDisputeKPI(final TicketDispute disputeTicket) {
		logger.info("saveTicketDisputeKPI service call starts.");
		Long disputeID = ticketDisputeKPIDetailsServiceImpl.saveTicketDisputeKPI(disputeTicket);
		logger.info("saveTicketDisputeKPI service call ends.");
		return disputeID == null ? false : true;
	}
	
	/**
	 * Save dispute status update KPI.
	 *
	 * @param disputeTicket the dispute ticket
	 * @return true, if successful
	 */
	public boolean saveDisputeStatusUpdateKPI(final DisputeStatusUpdate disputeStatusUpdate) {
		logger.info("saveDisputeStatusUpdateKPI service call starts.");
		Long disputeID = ticketDisputeKPIDetailsServiceImpl.saveDisputeStatusUpdateKPI(disputeStatusUpdate);
		logger.info("saveDisputeStatusUpdateKPI service call ends.");
		return disputeID == null ? false : true;
	}
}
