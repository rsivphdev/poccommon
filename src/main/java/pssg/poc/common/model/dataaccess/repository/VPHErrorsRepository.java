package pssg.poc.common.model.dataaccess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pssg.poc.common.model.dataaccess.entity.EtkErrorEntity;


/**
 * The Interface VPHErrorsRepository.
 * @author HLiang
 */
@Repository
public interface VPHErrorsRepository extends JpaRepository<EtkErrorEntity, Long> {

	/**
	 * Find errors by error statuses.
	 *
	 * @return the list
	 */
	@Query("SELECT c FROM EtkErrorEntity c WHERE c.ERROR_STATUS_CD IN ('NEW', 'ASND')")
    List<EtkErrorEntity> findErrorsByErrorStatuses();
	
	/**
	 * Find error by error ID.
	 *
	 * @param errorID the error ID
	 * @return the etk error entity
	 */
	@Query("SELECT c FROM EtkErrorEntity c WHERE c.ERROR_ID = :errorID ")
	EtkErrorEntity findErrorByErrorID(@Param("errorID") Long errorID);
}
