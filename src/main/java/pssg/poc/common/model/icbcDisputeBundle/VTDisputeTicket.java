package pssg.poc.common.model.icbcDisputeBundle;

import java.util.List;

/**
 * The Class VTDisputeTicket.
 * @author HLiang
 */
public class VTDisputeTicket {

    /** The ticket number. */
    private String ticket_number = null;

    /** The dispute date. */
    private String dispute_date = null;
    
    /** The accident. */
    private Boolean accident = null;
    
    /** The violation date. */
    private String violation_date = null;
    
    /** The violation time. */
    private String violation_time = null;
    
    /** The evt xml. */
    private String evt_xml = null;
    
    /** The violations. */
    private List<VTViolation> violations = null;

    /**
     * Gets the ticket number.
     *
     * @return the ticket number
     */
    public String getTicket_number() {
        return ticket_number;
    }

    /**
     * Sets the ticket number.
     *
     * @param ticket_number the new ticket number
     */
    public void setTicket_number(String ticket_number) {
        this.ticket_number = ticket_number;
    }

    /**
     * Gets the dispute date.
     *
     * @return the dispute date
     */
    public String getDispute_date() {
        return dispute_date;
    }

    /**
     * Sets the dispute date.
     *
     * @param dispute_date the new dispute date
     */
    public void setDispute_date(String dispute_date) {
        this.dispute_date = dispute_date;
    }

    /**
     * Gets the accident.
     *
     * @return the accident
     */
    public Boolean getAccident() {
        return accident;
    }

    /**
     * Sets the accident.
     *
     * @param accident the new accident
     */
    public void setAccident(Boolean accident) {
        this.accident = accident;
    }

    /**
     * Gets the violation date.
     *
     * @return the violation date
     */
    public String getViolation_date() {
        return violation_date;
    }

    /**
     * Sets the violation date.
     *
     * @param violation_date the new violation date
     */
    public void setViolation_date(String violation_date) {
        this.violation_date = violation_date;
    }

    /**
     * Gets the violation time.
     *
     * @return the violation time
     */
    public String getViolation_time() {
        return violation_time;
    }

    /**
     * Sets the violation time.
     *
     * @param violation_time the new violation time
     */
    public void setViolation_time(String violation_time) {
        this.violation_time = violation_time;
    }

    /**
     * Gets the evt xml.
     *
     * @return the evt xml
     */
    public String getEvt_xml() {
        return evt_xml;
    }

    /**
     * Sets the evt xml.
     *
     * @param evt_xml the new evt xml
     */
    public void setEvt_xml(String evt_xml) {
        this.evt_xml = evt_xml;
    }

    /**
     * Gets the violations.
     *
     * @return the violations
     */
    public List<VTViolation> getViolations() {
        return violations;
    }

    /**
     * Sets the violations.
     *
     * @param violations the new violations
     */
    public void setViolations(List<VTViolation> violations) {
        this.violations = violations;
    }

    /**
     * Instantiates a new VT dispute ticket.
     */
    public VTDisputeTicket() {
    }


}
