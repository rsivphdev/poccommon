package pssg.poc.common.model.dataaccess.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class TicketDisputeKPIDetailsEntity.
 * @author HLiang
 */
@Entity
@Table(name = "VPH_TICKET_DISPUTE_KPI_DETAILS")
public class TicketDisputeKPIDetailsEntity implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3089277354796757972L;
	
	/** The kpi id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long KPI_ID;
	
	/** The contravention no. */
	@Column(name = "CONTRAVENTION_NO")
	private String CONTRAVENTION_NO;
	
	/** The dispute dt. */
	@Column(name = "DISPUTE_DT")
	private String DISPUTE_DT;
	
	/** The dispute status. */
	@Column(name = "DISPUTE_STATUS")
	private String DISPUTE_STATUS;
	
	/** The dispute status change dt. */
	@Column(name = "DISPUTE_STATUS_CHANGE_DT")
	private String DISPUTE_STATUS_CHANGE_DT;
	
	/** The dispute type. */
	@Column(name = "DISPUTE_TYPE")
	private String DISPUTE_TYPE;
	
	/** The offender type description. */
	@Column(name = "OFFENDER_TYPE_DESCRIPTION")
	private String OFFENDER_TYPE_DESCRIPTION;
	
	/** The ticketed amt. */
	@Column(name = "TICKETED_AMT")
	private double TICKETED_AMT;

	/** The count act regulation. */
	@Column(name = "COUNT_ACT_REGULATION")
	private String COUNT_ACT_REGULATION;
	
	/** The compressed section. */
	@Column(name = "COMPRESSED_SECTION")
	private String COMPRESSED_SECTION;
	/**
	 * Gets the kpi id.
	 *
	 * @return the kpi id
	 */
	public Long getKPI_ID() {
		return KPI_ID;
	}

	/**
	 * Sets the kpi id.
	 *
	 * @param kPI_ID the new kpi id
	 */
	public void setKPI_ID(Long kPI_ID) {
		KPI_ID = kPI_ID;
	}

	/**
	 * Gets the contravention no.
	 *
	 * @return the contravention no
	 */
	public String getCONTRAVENTION_NO() {
		return CONTRAVENTION_NO;
	}

	/**
	 * Sets the contravention no.
	 *
	 * @param cONTRAVENTION_NO the new contravention no
	 */
	public void setCONTRAVENTION_NO(String cONTRAVENTION_NO) {
		CONTRAVENTION_NO = cONTRAVENTION_NO;
	}

	/**
	 * Gets the dispute dt.
	 *
	 * @return the dispute dt
	 */
	public String getDISPUTE_DT() {
		return DISPUTE_DT;
	}

	/**
	 * Sets the dispute dt.
	 *
	 * @param dISPUTE_DT the new dispute dt
	 */
	public void setDISPUTE_DT(String dISPUTE_DT) {
		DISPUTE_DT = dISPUTE_DT;
	}

	/**
	 * Gets the dispute status.
	 *
	 * @return the dispute status
	 */
	public String getDISPUTE_STATUS() {
		return DISPUTE_STATUS;
	}

	/**
	 * Sets the dispute status.
	 *
	 * @param dISPUTE_STATUS the new dispute status
	 */
	public void setDISPUTE_STATUS(String dISPUTE_STATUS) {
		DISPUTE_STATUS = dISPUTE_STATUS;
	}

	/**
	 * Gets the dispute status change dt.
	 *
	 * @return the dispute status change dt
	 */
	public String getDISPUTE_STATUS_CHANGE_DT() {
		return DISPUTE_STATUS_CHANGE_DT;
	}

	/**
	 * Sets the dispute status change dt.
	 *
	 * @param dISPUTE_STATUS_CHANGE_DT the new dispute status change dt
	 */
	public void setDISPUTE_STATUS_CHANGE_DT(String dISPUTE_STATUS_CHANGE_DT) {
		DISPUTE_STATUS_CHANGE_DT = dISPUTE_STATUS_CHANGE_DT;
	}

	/**
	 * Gets the dispute type.
	 *
	 * @return the dispute type
	 */
	public String getDISPUTE_TYPE() {
		return DISPUTE_TYPE;
	}

	/**
	 * Sets the dispute type.
	 *
	 * @param dISPUTE_TYPE the new dispute type
	 */
	public void setDISPUTE_TYPE(String dISPUTE_TYPE) {
		DISPUTE_TYPE = dISPUTE_TYPE;
	}

	/**
	 * Gets the ticketed amt.
	 *
	 * @return the ticketed amt
	 */
	public double getTICKETED_AMT() {
		return TICKETED_AMT;
	}

	/**
	 * Sets the ticketed amt.
	 *
	 * @param tICKETED_AMT the new ticketed amt
	 */
	public void setTICKETED_AMT(double tICKETED_AMT) {
		TICKETED_AMT = tICKETED_AMT;
	}

	/**
	 * Gets the offender type description.
	 *
	 * @return the offender type description
	 */
	public String getOFFENDER_TYPE_DESCRIPTION() {
		return OFFENDER_TYPE_DESCRIPTION;
	}

	/**
	 * Sets the offender type description.
	 *
	 * @param oFFENDER_TYPE_DESCRIPTION the new offender type description
	 */
	public void setOFFENDER_TYPE_DESCRIPTION(String oFFENDER_TYPE_DESCRIPTION) {
		OFFENDER_TYPE_DESCRIPTION = oFFENDER_TYPE_DESCRIPTION;
	}

	/**
	 * Gets the count act regulation.
	 *
	 * @return the count act regulation
	 */
	public String getCOUNT_ACT_REGULATION() {
		return COUNT_ACT_REGULATION;
	}

	/**
	 * Sets the count act regulation.
	 *
	 * @param cOUNT_ACT_REGULATION the new count act regulation
	 */
	public void setCOUNT_ACT_REGULATION(String cOUNT_ACT_REGULATION) {
		COUNT_ACT_REGULATION = cOUNT_ACT_REGULATION;
	}

	/**
	 * Gets the compressed section.
	 *
	 * @return the compressed section
	 */
	public String getCOMPRESSED_SECTION() {
		return COMPRESSED_SECTION;
	}

	/**
	 * Sets the compressed section.
	 *
	 * @param cOMPRESSED_SECTION the new compressed section
	 */
	public void setCOMPRESSED_SECTION(String cOMPRESSED_SECTION) {
		COMPRESSED_SECTION = cOMPRESSED_SECTION;
	}
	
	
}
