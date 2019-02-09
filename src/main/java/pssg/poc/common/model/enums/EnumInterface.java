package pssg.poc.common.model.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * The Enum EnumInterface.
 * @author HLiang
 */
public enum EnumInterface {
	
	/** The icbc cc. */
	ICBC_CC("ICBC_CC",	"Issuance: Send eVT to ICBC", 1), 
	
	/** The icbc qt. */
	ICBC_QT("ICBC_QT",	"Payment: Query ticket request to ICBC", 3),
	
	/** The icbc cr. */
	ICBC_CR("ICBC_CR",	"Payment: Create receipt in ICBC", 4),
	
	/** The vph fd. */
	VPH_FD("VPH_FD", "Issuance: Delete file from FTP folder", 2),
	
	/** The vph g. */
	VPH_G("VPH_G", "General", 5),
	
	/** The vph dp. */
	VPH_TD("VPH_TD", "Ticket dispute: Ticket dispute", 6),
	
	/** The vph su. */
	VPH_SU("VPH_SU", "Status update: Ticket status update", 7);;
	
	/** The code value. */
	private String codeValue;
	
	/** The code description. */
	private String codeDescription;
	
	/** The display order. */
	private int displayOrder;
	
	/** The Constant mapCode. */
	private static final Map<String, EnumInterface> mapCode;
	
	/**
	 * Instantiates a new enum interface.
	 *
	 * @param codeValue the code value
	 * @param codeDescription the code description
	 */
	private EnumInterface(final String codeValue, final String codeDescription, final int displayOrder) {
		this.codeValue = codeValue;
		this.codeDescription = codeDescription;
		this.displayOrder = displayOrder;
	}
	
	static {
		mapCode = new HashMap<String, EnumInterface>();
		for (EnumInterface v : EnumInterface.values()) {
			mapCode.put(v.codeValue, v);
		}
	}
	
	/**
	 * Gets the enumfrom code value.
	 *
	 * @param codeValue the code value
	 * @return the enumfrom code value
	 */
	public static EnumInterface getEnumfromCodeValue(String codeValue) {
		return mapCode.get(codeValue);
	}

	/**
	 * Gets the code value.
	 *
	 * @return the code value
	 */
	public String getCodeValue() {
		return codeValue;
	}

	/**
	 * Gets the code description.
	 *
	 * @return the code description
	 */
	public String getCodeDescription() {
		return codeDescription;
	}

	/**
	 * Gets the display order.
	 *
	 * @return the display order
	 */
	public int getDisplayOrder() {
		return displayOrder;
	}
	
}
