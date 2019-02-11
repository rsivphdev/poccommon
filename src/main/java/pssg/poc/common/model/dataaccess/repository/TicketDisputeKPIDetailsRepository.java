package pssg.poc.common.model.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pssg.poc.common.model.dataaccess.entity.TicketDisputeKPIDetailsEntity;

/**
 * The Interface TicketDisputeKPIDetailsRepository.
 * @author HLiang
 */
@Repository
public interface TicketDisputeKPIDetailsRepository extends JpaRepository<TicketDisputeKPIDetailsEntity, Long> {

}
