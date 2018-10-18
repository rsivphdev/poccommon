package pssg.poc.common.model.justinDispute;

import java.util.List;

/**
 * The Class DisputeTicketBundle.
 * @author HLiang
 */
public class DisputeTicketBundle {
	
	/** The dispute ID. */
	private Long disputeID;
	
	/** The ticket NO. */
	private String ticket_number;
	
	/** The dispute date. */
	private String dispute_date;
	
	/** The accident. */
	private boolean accident;
	
	/** The surname. */
	private String surname;
	
	/** The givenname 1. */
	private String givenname1;
	
	/** The givenname 2. */
	private String givenname2;
	
	/** The givenname 3. */
	private String givenname3;
	
	/** The dl number. */
	private String dl_number;
	
	/** The client number. */
	private String client_number;
	
	/** The province state. */
	private String province_state;
	
	/** The dl produced. */
	private boolean dl_produced;
	
	/** The licence expiry year. */
	private String licence_expiry_year;
	
	/** The gender. */
	private String gender;
	
	/** The date of birth. */
	private String date_of_birth;
	
	/** The address. */
	private String address;
	
	/** The city. */
	private String city;
	
	/** The country. */
	private String country;
	
	/** The postalcode. */
	private String postalcode;
	
	/** The youngperson. */
	private boolean youngperson;
	
	/** The change of address. */
	private boolean change_of_address;
	
	/** The offender type description. */
	private String offender_type_description;
	
	/** The violation date. */
	private String violation_date;
	
	/** The violation time. */
	private String violation_time;
	
	/** The violation highway. */
	private String violation_highway;
	
	/** The violation city code. */
	private String violation_city_code;
	
	/** The location. */
	private String location;
	
	/** The vehicle jurisdiction. */
	private String vehicle_jurisdiction;
	
	/** The vehicle plate number. */
	private String vehicle_plate_number;
	
	/** The nsc puj. */
	private String nsc_puj;
	
	/** The nsc number. */
	private String nsc_number;
	
	/** The registered owner name. */
	private String registered_owner_name;
	
	/** The vehicle type code. */
	private String vehicle_type_code;
	
	/** The vehicle colour code. */
	private String vehicle_colour_code;
	
	/** The vehicle year. */
	private String vehicle_year;
	
	/** The dispute address. */
	private String dispute_address;
	
	/** The court location. */
	private String court_location;
	
	/** The enforcement officer 1 number. */
	private String enforcement_officer1_number;
	
	/** The enforcement officer 1 name. */
	private String enforcement_officer1_name;
	
	/** The enforcement agency name. */
	private String enforcement_agency_name;
	
	/** The enforcement agency code. */
	private String enforcement_agency_code;
	
	/** The cos served to name. */
	private String cos_served_to_name;
	
	/** The cos date. */
	private String cos_date;
	
	/** The witnessing officer number. */
	private String witnessing_officer_number;
	
	/** The witnessing officer name. */
	private String witnessing_officer_name;
	
	/** The vehicle make code. */
	private String vehicle_make_code;
	
	/** The cos form number. */
	private String cos_form_number;
	
	/** The evt form number. */
	private String evt_form_number;
	
	/** The evt xml. */
	private String evt_xml;
	
	/** The dispute status. */
	private String dispute_status;
	
	/** The interpreter required. */
	private boolean interpreter_required;
	
	/** The print name. */
	private String print_name;
	
	/** The violations. */
	private List<DisputedViolation> violations;
	
	
	/**
	 * Gets the prints the name.
	 *
	 * @return the prints the name
	 */
	public String getPrint_name() {
		return print_name;
	}

	/**
	 * Sets the prints the name.
	 *
	 * @param print_name the new prints the name
	 */
	public void setPrint_name(String print_name) {
		this.print_name = print_name;
	}

	/**
	 * Checks if is interpreter required.
	 *
	 * @return true, if is interpreter required
	 */
	public boolean isInterpreter_required() {
		return interpreter_required;
	}

	/**
	 * Sets the interpreter required.
	 *
	 * @param interpreter_required the new interpreter required
	 */
	public void setInterpreter_required(boolean interpreter_required) {
		this.interpreter_required = interpreter_required;
	}

	/**
	 * Gets the dispute status.
	 *
	 * @return the dispute status
	 */
	public String getDispute_status() {
		return dispute_status;
	}

	/**
	 * Sets the dispute status.
	 *
	 * @param dispute_status the new dispute status
	 */
	public void setDispute_status(String dispute_status) {
		this.dispute_status = dispute_status;
	}

	/**
	 * Gets the dispute ID.
	 *
	 * @return the dispute ID
	 */
	public Long getDisputeID() {
		return disputeID;
	}
	
	/**
	 * Sets the dispute ID.
	 *
	 * @param disputeID the new dispute ID
	 */
	public void setDisputeID(Long disputeID) {
		this.disputeID = disputeID;
	}
	
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
	 * Checks if is accident.
	 *
	 * @return true, if is accident
	 */
	public boolean isAccident() {
		return accident;
	}
	
	/**
	 * Sets the accident.
	 *
	 * @param accident the new accident
	 */
	public void setAccident(boolean accident) {
		this.accident = accident;
	}
	
	/**
	 * Gets the surname.
	 *
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Sets the surname.
	 *
	 * @param surname the new surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * Gets the givenname 1.
	 *
	 * @return the givenname 1
	 */
	public String getGivenname1() {
		return givenname1;
	}
	
	/**
	 * Sets the givenname 1.
	 *
	 * @param givenname1 the new givenname 1
	 */
	public void setGivenname1(String givenname1) {
		this.givenname1 = givenname1;
	}
	
	/**
	 * Gets the givenname 2.
	 *
	 * @return the givenname 2
	 */
	public String getGivenname2() {
		return givenname2;
	}
	
	/**
	 * Sets the givenname 2.
	 *
	 * @param givenname2 the new givenname 2
	 */
	public void setGivenname2(String givenname2) {
		this.givenname2 = givenname2;
	}
	
	/**
	 * Gets the givenname 3.
	 *
	 * @return the givenname 3
	 */
	public String getGivenname3() {
		return givenname3;
	}
	
	/**
	 * Sets the givenname 3.
	 *
	 * @param givenname3 the new givenname 3
	 */
	public void setGivenname3(String givenname3) {
		this.givenname3 = givenname3;
	}
	
	/**
	 * Gets the dl number.
	 *
	 * @return the dl number
	 */
	public String getDl_number() {
		return dl_number;
	}
	
	/**
	 * Sets the dl number.
	 *
	 * @param dl_number the new dl number
	 */
	public void setDl_number(String dl_number) {
		this.dl_number = dl_number;
	}
	
	/**
	 * Gets the client number.
	 *
	 * @return the client number
	 */
	public String getClient_number() {
		return client_number;
	}
	
	/**
	 * Sets the client number.
	 *
	 * @param client_number the new client number
	 */
	public void setClient_number(String client_number) {
		this.client_number = client_number;
	}
	
	/**
	 * Gets the province state.
	 *
	 * @return the province state
	 */
	public String getProvince_state() {
		return province_state;
	}
	
	/**
	 * Sets the province state.
	 *
	 * @param province_state the new province state
	 */
	public void setProvince_state(String province_state) {
		this.province_state = province_state;
	}
	
	/**
	 * Gets the dl produced.
	 *
	 * @return the dl produced
	 */
	public boolean getDl_produced() {
		return dl_produced;
	}
	
	/**
	 * Sets the dl produced.
	 *
	 * @param dl_produced the new dl produced
	 */
	public void setDl_produced(boolean dl_produced) {
		this.dl_produced = dl_produced;
	}
	
	/**
	 * Gets the licence expiry year.
	 *
	 * @return the licence expiry year
	 */
	public String getLicence_expiry_year() {
		return licence_expiry_year;
	}
	
	/**
	 * Sets the licence expiry year.
	 *
	 * @param licence_expiry_year the new licence expiry year
	 */
	public void setLicence_expiry_year(String licence_expiry_year) {
		this.licence_expiry_year = licence_expiry_year;
	}
	
	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Gets the date of birth.
	 *
	 * @return the date of birth
	 */
	public String getDate_of_birth() {
		return date_of_birth;
	}
	
	/**
	 * Sets the date of birth.
	 *
	 * @param date_of_birth the new date of birth
	 */
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	
	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * Gets the postalcode.
	 *
	 * @return the postalcode
	 */
	public String getPostalcode() {
		return postalcode;
	}
	
	/**
	 * Sets the postalcode.
	 *
	 * @param postalcode the new postalcode
	 */
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	
	/**
	 * Gets the youngperson.
	 *
	 * @return the youngperson
	 */
	public boolean getYoungperson() {
		return youngperson;
	}
	
	/**
	 * Sets the youngperson.
	 *
	 * @param youngperson the new youngperson
	 */
	public void setYoungperson(boolean youngperson) {
		this.youngperson = youngperson;
	}
	
	/**
	 * Gets the change of address.
	 *
	 * @return the change of address
	 */
	public boolean getChange_of_address() {
		return change_of_address;
	}
	
	/**
	 * Sets the change of address.
	 *
	 * @param change_of_address the new change of address
	 */
	public void setChange_of_address(boolean change_of_address) {
		this.change_of_address = change_of_address;
	}
	
	/**
	 * Gets the offender type description.
	 *
	 * @return the offender type description
	 */
	public String getOffender_type_description() {
		return offender_type_description;
	}
	
	/**
	 * Sets the offender type description.
	 *
	 * @param offender_type_description the new offender type description
	 */
	public void setOffender_type_description(String offender_type_description) {
		this.offender_type_description = offender_type_description;
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
	 * Gets the violation highway.
	 *
	 * @return the violation highway
	 */
	public String getViolation_highway() {
		return violation_highway;
	}
	
	/**
	 * Sets the violation highway.
	 *
	 * @param violation_highway the new violation highway
	 */
	public void setViolation_highway(String violation_highway) {
		this.violation_highway = violation_highway;
	}
	
	/**
	 * Gets the violation city code.
	 *
	 * @return the violation city code
	 */
	public String getViolation_city_code() {
		return violation_city_code;
	}
	
	/**
	 * Sets the violation city code.
	 *
	 * @param violation_city_code the new violation city code
	 */
	public void setViolation_city_code(String violation_city_code) {
		this.violation_city_code = violation_city_code;
	}
	
	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	
	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/**
	 * Gets the vehicle jurisdiction.
	 *
	 * @return the vehicle jurisdiction
	 */
	public String getVehicle_jurisdiction() {
		return vehicle_jurisdiction;
	}
	
	/**
	 * Sets the vehicle jurisdiction.
	 *
	 * @param vehicle_jurisdiction the new vehicle jurisdiction
	 */
	public void setVehicle_jurisdiction(String vehicle_jurisdiction) {
		this.vehicle_jurisdiction = vehicle_jurisdiction;
	}
	
	/**
	 * Gets the vehicle plate number.
	 *
	 * @return the vehicle plate number
	 */
	public String getVehicle_plate_number() {
		return vehicle_plate_number;
	}
	
	/**
	 * Sets the vehicle plate number.
	 *
	 * @param vehicle_plate_number the new vehicle plate number
	 */
	public void setVehicle_plate_number(String vehicle_plate_number) {
		this.vehicle_plate_number = vehicle_plate_number;
	}
	
	/**
	 * Gets the nsc puj.
	 *
	 * @return the nsc puj
	 */
	public String getNsc_puj() {
		return nsc_puj;
	}
	
	/**
	 * Sets the nsc puj.
	 *
	 * @param nsc_puj the new nsc puj
	 */
	public void setNsc_puj(String nsc_puj) {
		this.nsc_puj = nsc_puj;
	}
	
	/**
	 * Gets the nsc number.
	 *
	 * @return the nsc number
	 */
	public String getNsc_number() {
		return nsc_number;
	}
	
	/**
	 * Sets the nsc number.
	 *
	 * @param nsc_number the new nsc number
	 */
	public void setNsc_number(String nsc_number) {
		this.nsc_number = nsc_number;
	}
	
	/**
	 * Gets the registered owner name.
	 *
	 * @return the registered owner name
	 */
	public String getRegistered_owner_name() {
		return registered_owner_name;
	}
	
	/**
	 * Sets the registered owner name.
	 *
	 * @param registered_owner_name the new registered owner name
	 */
	public void setRegistered_owner_name(String registered_owner_name) {
		this.registered_owner_name = registered_owner_name;
	}
	
	/**
	 * Gets the vehicle type code.
	 *
	 * @return the vehicle type code
	 */
	public String getVehicle_type_code() {
		return vehicle_type_code;
	}
	
	/**
	 * Sets the vehicle type code.
	 *
	 * @param vehicle_type_code the new vehicle type code
	 */
	public void setVehicle_type_code(String vehicle_type_code) {
		this.vehicle_type_code = vehicle_type_code;
	}
	
	/**
	 * Gets the vehicle colour code.
	 *
	 * @return the vehicle colour code
	 */
	public String getVehicle_colour_code() {
		return vehicle_colour_code;
	}
	
	/**
	 * Sets the vehicle colour code.
	 *
	 * @param vehicle_colour_code the new vehicle colour code
	 */
	public void setVehicle_colour_code(String vehicle_colour_code) {
		this.vehicle_colour_code = vehicle_colour_code;
	}
	
	/**
	 * Gets the vehicle year.
	 *
	 * @return the vehicle year
	 */
	public String getVehicle_year() {
		return vehicle_year;
	}
	
	/**
	 * Sets the vehicle year.
	 *
	 * @param vehicle_year the new vehicle year
	 */
	public void setVehicle_year(String vehicle_year) {
		this.vehicle_year = vehicle_year;
	}
	
	/**
	 * Gets the dispute address.
	 *
	 * @return the dispute address
	 */
	public String getDispute_address() {
		return dispute_address;
	}
	
	/**
	 * Sets the dispute address.
	 *
	 * @param dispute_address the new dispute address
	 */
	public void setDispute_address(String dispute_address) {
		this.dispute_address = dispute_address;
	}
	
	/**
	 * Gets the court location.
	 *
	 * @return the court location
	 */
	public String getCourt_location() {
		return court_location;
	}
	
	/**
	 * Sets the court location.
	 *
	 * @param court_location the new court location
	 */
	public void setCourt_location(String court_location) {
		this.court_location = court_location;
	}
	
	/**
	 * Gets the enforcement officer 1 number.
	 *
	 * @return the enforcement officer 1 number
	 */
	public String getEnforcement_officer1_number() {
		return enforcement_officer1_number;
	}
	
	/**
	 * Sets the enforcement officer 1 number.
	 *
	 * @param enforcement_officer1_number the new enforcement officer 1 number
	 */
	public void setEnforcement_officer1_number(String enforcement_officer1_number) {
		this.enforcement_officer1_number = enforcement_officer1_number;
	}
	
	/**
	 * Gets the enforcement officer 1 name.
	 *
	 * @return the enforcement officer 1 name
	 */
	public String getEnforcement_officer1_name() {
		return enforcement_officer1_name;
	}
	
	/**
	 * Sets the enforcement officer 1 name.
	 *
	 * @param enforcement_officer1_name the new enforcement officer 1 name
	 */
	public void setEnforcement_officer1_name(String enforcement_officer1_name) {
		this.enforcement_officer1_name = enforcement_officer1_name;
	}
	
	/**
	 * Gets the enforcement agency name.
	 *
	 * @return the enforcement agency name
	 */
	public String getEnforcement_agency_name() {
		return enforcement_agency_name;
	}
	
	/**
	 * Sets the enforcement agency name.
	 *
	 * @param enforcement_agency_name the new enforcement agency name
	 */
	public void setEnforcement_agency_name(String enforcement_agency_name) {
		this.enforcement_agency_name = enforcement_agency_name;
	}
	
	/**
	 * Gets the enforcement agency code.
	 *
	 * @return the enforcement agency code
	 */
	public String getEnforcement_agency_code() {
		return enforcement_agency_code;
	}
	
	/**
	 * Sets the enforcement agency code.
	 *
	 * @param enforcement_agency_code the new enforcement agency code
	 */
	public void setEnforcement_agency_code(String enforcement_agency_code) {
		this.enforcement_agency_code = enforcement_agency_code;
	}
	
	/**
	 * Gets the cos served to name.
	 *
	 * @return the cos served to name
	 */
	public String getCos_served_to_name() {
		return cos_served_to_name;
	}
	
	/**
	 * Sets the cos served to name.
	 *
	 * @param cos_served_to_name the new cos served to name
	 */
	public void setCos_served_to_name(String cos_served_to_name) {
		this.cos_served_to_name = cos_served_to_name;
	}
	
	/**
	 * Gets the cos date.
	 *
	 * @return the cos date
	 */
	public String getCos_date() {
		return cos_date;
	}
	
	/**
	 * Sets the cos date.
	 *
	 * @param cos_date the new cos date
	 */
	public void setCos_date(String cos_date) {
		this.cos_date = cos_date;
	}
	
	/**
	 * Gets the witnessing officer number.
	 *
	 * @return the witnessing officer number
	 */
	public String getWitnessing_officer_number() {
		return witnessing_officer_number;
	}
	
	/**
	 * Sets the witnessing officer number.
	 *
	 * @param witnessing_officer_number the new witnessing officer number
	 */
	public void setWitnessing_officer_number(String witnessing_officer_number) {
		this.witnessing_officer_number = witnessing_officer_number;
	}
	
	/**
	 * Gets the witnessing officer name.
	 *
	 * @return the witnessing officer name
	 */
	public String getWitnessing_officer_name() {
		return witnessing_officer_name;
	}
	
	/**
	 * Sets the witnessing officer name.
	 *
	 * @param witnessing_officer_name the new witnessing officer name
	 */
	public void setWitnessing_officer_name(String witnessing_officer_name) {
		this.witnessing_officer_name = witnessing_officer_name;
	}
	
	/**
	 * Gets the vehicle make code.
	 *
	 * @return the vehicle make code
	 */
	public String getVehicle_make_code() {
		return vehicle_make_code;
	}
	
	/**
	 * Sets the vehicle make code.
	 *
	 * @param vehicle_make_code the new vehicle make code
	 */
	public void setVehicle_make_code(String vehicle_make_code) {
		this.vehicle_make_code = vehicle_make_code;
	}
	
	/**
	 * Gets the cos form number.
	 *
	 * @return the cos form number
	 */
	public String getCos_form_number() {
		return cos_form_number;
	}
	
	/**
	 * Sets the cos form number.
	 *
	 * @param cos_form_number the new cos form number
	 */
	public void setCos_form_number(String cos_form_number) {
		this.cos_form_number = cos_form_number;
	}
	
	/**
	 * Gets the evt form number.
	 *
	 * @return the evt form number
	 */
	public String getEvt_form_number() {
		return evt_form_number;
	}
	
	/**
	 * Sets the evt form number.
	 *
	 * @param evt_form_number the new evt form number
	 */
	public void setEvt_form_number(String evt_form_number) {
		this.evt_form_number = evt_form_number;
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
	public List<DisputedViolation> getViolations() {
		return violations;
	}

	/**
	 * Sets the violations.
	 *
	 * @param violations the new violations
	 */
	public void setViolations(List<DisputedViolation> violations) {
		this.violations = violations;
	}
	
	
	
}
