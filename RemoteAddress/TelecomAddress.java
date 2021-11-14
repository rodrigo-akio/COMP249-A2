package RemoteAddress;
import Head.Address;

/**
* Creates the web page address class
*
* @param countryCode 					code of the Country
* @param nationalDirectDialingPrefix	prefix of the national direct dialing
* @param physicalType					type of the phone
* @param areaCode						code of the area
* @param extension						extension code
* @param number							number of the phone
*/
public class TelecomAddress extends Address{
	private String countryCode, nationalDirectDialingPrefix, physicalType;
	private int areaCode, extension;
	private long number;
	
	// Getter
	public String getCountryCode() {
		return countryCode;
	}

	// Setter
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	// Getter
	public String getNationalDirectDialingPrefix() {
		return nationalDirectDialingPrefix;
	}

	// Setter
	public void setNationalDirectDialingPrefix(String nationalDirectDialingPrefix) {
		this.nationalDirectDialingPrefix = nationalDirectDialingPrefix;
	}
	
	// Getter
	public String getPhysicalType() {
		return physicalType;
	}

	// Setter
	public void setPhysicalType(String physicalType) {
		this.physicalType = physicalType;
	}
	
	// Getter
	public int getAreaCode() {
		return areaCode;
	}

	// Setter
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	
	// Getter
	public int getExtension() {
		return extension;
	}

	// Setter
	public void setExtension(int extension) {
		this.extension = extension;
	}
	
	// Getter
	public long getNumber() {
		return number;
	}

	// Setter
	public void setNumber(long number) {
		this.number = number;
	}
	
	public TelecomAddress() {
		countryCode = null;
		nationalDirectDialingPrefix = null;
		areaCode = 0;
		number = 0;
		extension = 0;
		physicalType = null;	
	}
	
	/**
	* Creates the constructor and copies the parameters
	*/
	public TelecomAddress(String validFrom, String validTo, String countryCode, String nationalDirectDialingPrefix, int areaCode, long number, int extension, String physicalType) {
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.countryCode = countryCode;
		this.nationalDirectDialingPrefix = nationalDirectDialingPrefix;
		this.areaCode = areaCode;
		this.number = number;
		this.extension = extension;
		this.physicalType = physicalType;
	}
	
	/**
	* Prints the information of the address
	*
	*/
	@Override
	public String toString() {
		return "The telecom address: " + countryCode + " " + nationalDirectDialingPrefix + areaCode + " " + 
		number + " ext. " + extension + " " + physicalType + " is valid from " + validFrom + " to " + validTo;
	}
	
	/**
	* Verifies the first object to compare to if its null or different type, then it returns false if those conditions are true
	*/
	public Boolean equals(TelecomAddress object) {
		if (object.getClass() == this.getClass() && object != null) {
			if (object.validFrom == this.validFrom 
				&& object.validTo == this.validTo
				&& object.countryCode == this.countryCode
				&& object.nationalDirectDialingPrefix == this.nationalDirectDialingPrefix
				&& object.areaCode == this.areaCode
				&& object.number == this.number
				&& object.extension == this.extension
				&& object.physicalType == this.physicalType)
				return true;
			else
				return false;	
		}
		else 
			return false;	
	}
}
