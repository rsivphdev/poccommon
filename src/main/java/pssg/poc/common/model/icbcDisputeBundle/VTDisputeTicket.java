package pssg.poc.common.model.icbcDisputeBundle;


// import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

public class VTDisputeTicket {

    private String ticket_number = null;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String dispute_date = null;
    private Boolean accident = null;
    private String surname = null;
    private String givenname1 = null;
    private String givenname2 = null;
    private String givenname3 = null;
    private String dl_number = null;
    private String client_number = null;
    private String province_state = null;
    private Boolean dl_produced = null;
    private Number licence_expiry_year = null;
    private String gender = null;
    private String date_of_birth = null;
    private String address = null;
    private String city = null;
    private String country = null;
    private String postalcode = null;
    private Boolean youngperson = null;
    private Boolean change_of_address = null;
    private String offender_type_description = null;
    private String violation_date = null;
    private String violation_time = null;
    private String violation_highway = null;
    private String violation_city_code = null;
    private String location = null;
    private Boolean interpreter_required = null;
    private String vehicle_jurisdiction = null;
    private String vehicle_plate_number = null;
    private String nsc_puj = null;
    private String nsc_number = null;
    private String registered_owner_name = null;
    private String vehicle_type_code = null;
    private String vehicle_colour_code = null;
    private String vehicle_year = null;
    private String dispute_address = null;
    private String court_location = null;
    private String enforcement_officer1_number = null;
    private String enforcement_officer1_name = null;
    private String enforcement_agency_name = null;
    private String enforcement_agency_code = null;
    private String cos_served_to_name = null;
    private String cos_date = null;
    private String witnessing_officer_number = null;
    private String witnessing_officer_name = null;
    private String vehicle_make_code = null;
    private String cos_form_number = null;
    private String evt_form_number = null;
    private String evt_xml = null;
    private String print_name = null;
    private List<VTViolation> violations = null;

    public String getTicket_number() {
        return ticket_number;
    }

    public void setTicket_number(String ticket_number) {
        this.ticket_number = ticket_number;
    }

    public String getDispute_date() {
        return dispute_date;
    }

    public void setDispute_date(String dispute_date) {
        this.dispute_date = dispute_date;
    }

    public Boolean getAccident() {
        return accident;
    }

    public void setAccident(Boolean accident) {
        this.accident = accident;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenname1() {
        return givenname1;
    }

    public void setGivenname1(String givenname1) {
        this.givenname1 = givenname1;
    }

    public String getGivenname2() {
        return givenname2;
    }

    public void setGivenname2(String givenname2) {
        this.givenname2 = givenname2;
    }

    public String getGivenname3() {
        return givenname3;
    }

    public void setGivenname3(String givenname3) {
        this.givenname3 = givenname3;
    }


    public String getDl_number() {
        return dl_number;
    }

    public void setDl_number(String dl_number) {
        this.dl_number = dl_number;
    }

    public String getClient_number() {
        return client_number;
    }

    public void setClient_number(String client_number) {
        this.client_number = client_number;
    }

    public String getProvince_state() {
        return province_state;
    }

    public void setProvince_state(String province_state) {
        this.province_state = province_state;
    }

    public Boolean getDl_produced() {
        return dl_produced;
    }

    public void setDl_produced(Boolean dl_produced) {
        this.dl_produced = dl_produced;
    }

    public Number getLicence_expiry_year() {
        return licence_expiry_year;
    }

    public void setLicence_expiry_year(Number licence_expiry_year) {
        this.licence_expiry_year = licence_expiry_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public Boolean getYoungperson() {
        return youngperson;
    }

    public void setYoungperson(Boolean youngperson) {
        this.youngperson = youngperson;
    }

    public Boolean getChange_of_address() {
        return change_of_address;
    }

    public void setChange_of_address(Boolean change_of_address) {
        this.change_of_address = change_of_address;
    }

    public String getOffender_type_description() {
        return offender_type_description;
    }

    public void setOffender_type_description(String offender_type_description) {
        this.offender_type_description = offender_type_description;
    }

    public String getViolation_date() {
        return violation_date;
    }

    public void setViolation_date(String violation_date) {
        this.violation_date = violation_date;
    }

    public String getViolation_time() {
        return violation_time;
    }

    public void setViolation_time(String violation_time) {
        this.violation_time = violation_time;
    }

    public String getViolation_highway() {
        return violation_highway;
    }

    public void setViolation_highway(String violation_highway) {
        this.violation_highway = violation_highway;
    }

    public String getViolation_city_code() {
        return violation_city_code;
    }

    public void setViolation_city_code(String violation_city_code) {
        this.violation_city_code = violation_city_code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getInterpreter_required() {
        return interpreter_required;
    }

    public void setInterpreter_required(Boolean interpreter_required) {
        this.interpreter_required = interpreter_required;
    }

    public String getVehicle_jurisdiction() {
        return vehicle_jurisdiction;
    }

    public void setVehicle_jurisdiction(String vehicle_jurisdiction) {
        this.vehicle_jurisdiction = vehicle_jurisdiction;
    }

    public String getVehicle_plate_number() {
        return vehicle_plate_number;
    }

    public void setVehicle_plate_number(String vehicle_plate_number) {
        this.vehicle_plate_number = vehicle_plate_number;
    }

    public String getNsc_puj() {
        return nsc_puj;
    }

    public void setNsc_puj(String nsc_puj) {
        this.nsc_puj = nsc_puj;
    }

    public String getNsc_number() {
        return nsc_number;
    }

    public void setNsc_number(String nsc_number) {
        this.nsc_number = nsc_number;
    }

    public String getRegistered_owner_name() {
        return registered_owner_name;
    }

    public void setRegistered_owner_name(String registered_owner_name) {
        this.registered_owner_name = registered_owner_name;
    }

    public String getVehicle_type_code() {
        return vehicle_type_code;
    }

    public void setVehicle_type_code(String vehicle_type_code) {
        this.vehicle_type_code = vehicle_type_code;
    }

    public String getVehicle_colour_code() {
        return vehicle_colour_code;
    }

    public void setVehicle_colour_code(String vehicle_colour_code) {
        this.vehicle_colour_code = vehicle_colour_code;
    }

    public String getVehicle_year() {
        return vehicle_year;
    }

    public void setVehicle_year(String vehicle_year) {
        this.vehicle_year = vehicle_year;
    }

    public String getDispute_address() {
        return dispute_address;
    }

    public void setDispute_address(String dispute_address) {
        this.dispute_address = dispute_address;
    }

    public String getCourt_location() {
        return court_location;
    }

    public void setCourt_location(String court_location) {
        this.court_location = court_location;
    }

    public String getEnforcement_officer1_number() {
        return enforcement_officer1_number;
    }

    public void setEnforcement_officer1_number(String enforcement_officer1_number) {
        this.enforcement_officer1_number = enforcement_officer1_number;
    }

    public String getEnforcement_officer1_name() {
        return enforcement_officer1_name;
    }

    public void setEnforcement_officer1_name(String enforcement_officer1_name) {
        this.enforcement_officer1_name = enforcement_officer1_name;
    }

    public String getEnforcement_agency_name() {
        return enforcement_agency_name;
    }

    public void setEnforcement_agency_name(String enforcement_agency_name) {
        this.enforcement_agency_name = enforcement_agency_name;
    }

    public String getEnforcement_agency_code() {
        return enforcement_agency_code;
    }

    public void setEnforcement_agency_code(String enforcement_agency_code) {
        this.enforcement_agency_code = enforcement_agency_code;
    }

    public String getCos_served_to_name() {
        return cos_served_to_name;
    }

    public void setCos_served_to_name(String cos_served_to_name) {
        this.cos_served_to_name = cos_served_to_name;
    }

    public String getCos_date() {
        return cos_date;
    }

    public void setCos_date(String cos_date) {
        this.cos_date = cos_date;
    }

    public String getWitnessing_officer_number() {
        return witnessing_officer_number;
    }

    public void setWitnessing_officer_number(String witnessing_officer_number) {
        this.witnessing_officer_number = witnessing_officer_number;
    }

    public String getWitnessing_officer_name() {
        return witnessing_officer_name;
    }

    public void setWitnessing_officer_name(String witnessing_officer_name) {
        this.witnessing_officer_name = witnessing_officer_name;
    }

    public String getVehicle_make_code() {
        return vehicle_make_code;
    }

    public void setVehicle_make_code(String vehicle_make_code) {
        this.vehicle_make_code = vehicle_make_code;
    }

    public String getCos_form_number() {
        return cos_form_number;
    }

    public void setCos_form_number(String cos_form_number) {
        this.cos_form_number = cos_form_number;
    }

    public String getEvt_form_number() {
        return evt_form_number;
    }

    public void setEvt_form_number(String evt_form_number) {
        this.evt_form_number = evt_form_number;
    }

    public String getEvt_xml() {
        return evt_xml;
    }

    public void setEvt_xml(String evt_xml) {
        this.evt_xml = evt_xml;
    }


    public String getPrint_name() {
        return print_name;
    }

    public void setPrint_name(String print_name) {
        this.print_name = print_name;
    }

    public List<VTViolation> getViolations() {
        return violations;
    }

    public void setViolations(List<VTViolation> violations) {
        this.violations = violations;
    }

    public VTDisputeTicket() {
    }


}
