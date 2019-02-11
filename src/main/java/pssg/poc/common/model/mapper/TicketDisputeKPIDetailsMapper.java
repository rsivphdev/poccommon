package pssg.poc.common.model.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pssg.poc.common.model.dataaccess.entity.TicketDisputeKPIDetailsEntity;
import pssg.poc.common.model.icbcDisputeBundle.DisputeStatusUpdate;
import pssg.poc.common.model.icbcDisputeBundle.TicketDispute;


/**
 * The Class TicketDisputeKPIDetailsMapper.
 * @author HLiang
 */
public class TicketDisputeKPIDetailsMapper {

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(TicketDisputeKPIDetailsMapper.class);
	
	/**
	 * Map to dispute ticket entity.
	 *
	 * @param ticketDispute the ticket dispute
	 * @return the ticket dispute KPI details entity
	 */
	public static TicketDisputeKPIDetailsEntity mapToTicketDisputeKPIDetailsEntity(final TicketDispute ticketDispute) {
		logger.info("Map ticketDisput to ticketDisputeKPIDetails entity");
		
		if (ticketDispute == null) {
			return null;
		}
		TicketDisputeKPIDetailsEntity entity = new TicketDisputeKPIDetailsEntity();
		entity.setCONTRAVENTION_NO(ticketDispute.getContravention_number());
		entity.setDISPUTE_DT(ticketDispute.getDispute_date());
		entity.setDISPUTE_STATUS("NEW");
		entity.setDISPUTE_STATUS_CHANGE_DT(null);
		entity.setDISPUTE_TYPE(ticketDispute.getDisputing_allegation() ? "Allegation" : "Fine");
		entity.setOFFENDER_TYPE_DESCRIPTION(ticketDispute.getOffender_type_description());
		entity.setTICKETED_AMT(ticketDispute.getTicketed_amount());
		entity.setCOMPRESSED_SECTION(ticketDispute.getCompressed_section());
		entity.setCOUNT_ACT_REGULATION(ticketDispute.getCount_act_regulation());
		return entity;
		
	}
	
	/**
	 * Map to ticket dispute KPI details entity.
	 *
	 * @param disputeStatusUpdate the dispute status update
	 * @return the ticket dispute KPI details entity
	 */
	public static TicketDisputeKPIDetailsEntity mapToTicketDisputeKPIDetailsEntity(final DisputeStatusUpdate disputeStatusUpdate) {
		logger.info("Map ticketDisput to ticketDisputeKPIDetails entity");
		
		if (disputeStatusUpdate == null) {
			return null;
		}
		TicketDisputeKPIDetailsEntity entity = new TicketDisputeKPIDetailsEntity();
		entity.setCONTRAVENTION_NO(disputeStatusUpdate.getContravention_number());
		entity.setDISPUTE_DT(null);
		entity.setDISPUTE_STATUS(disputeStatusUpdate.getAction());
		entity.setDISPUTE_STATUS_CHANGE_DT(disputeStatusUpdate.getAction_date());
		entity.setDISPUTE_TYPE(null);
		entity.setOFFENDER_TYPE_DESCRIPTION(null);
		entity.setCOMPRESSED_SECTION(null);
		entity.setCOUNT_ACT_REGULATION(null);
		return entity;
		
	}
}
