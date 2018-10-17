
package pssg.poc.common.model.icbcDisputeBundle;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pssg.poc.vph.pocvphvtd.dataaccess.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pssg.poc.vph.pocvphvtd.dataaccess.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XMLFILE }
     * 
     */
    public XMLFILE createXMLFILE() {
        return new XMLFILE();
    }

    /**
     * Create an instance of {@link XMLFILE.REPORT }
     * 
     */
    public XMLFILE.REPORT createXMLFILEREPORT() {
        return new XMLFILE.REPORT();
    }

    /**
     * Create an instance of {@link XMLFILE.REPORT.PERSON }
     * 
     */
    public XMLFILE.REPORT.PERSON createXMLFILEREPORTPERSON() {
        return new XMLFILE.REPORT.PERSON();
    }

    /**
     * Create an instance of {@link XMLFILE.REPORT.VEHICLE }
     * 
     */
    public XMLFILE.REPORT.VEHICLE createXMLFILEREPORTVEHICLE() {
        return new XMLFILE.REPORT.VEHICLE();
    }

    /**
     * Create an instance of {@link XMLFILE.REPORT.CUSTOMDATA }
     * 
     */
    public XMLFILE.REPORT.CUSTOMDATA createXMLFILEREPORTCUSTOMDATA() {
        return new XMLFILE.REPORT.CUSTOMDATA();
    }

    /**
     * Create an instance of {@link XMLFILE.REPORT.PERSON.CHARGE }
     * 
     */
    public XMLFILE.REPORT.PERSON.CHARGE createXMLFILEREPORTPERSONCHARGE() {
        return new XMLFILE.REPORT.PERSON.CHARGE();
    }

}
