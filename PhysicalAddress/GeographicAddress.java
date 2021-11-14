package PhysicalAddress;
import Head.Address;

/**
* Creates the web page address class
*
* @param addressLine 	street name and number
* @param city			city name
* @param regionOrState	region or state's name
* @param ziporPostCode	zip code or postal code
* @param locale			Copy of Locale
*/
public class GeographicAddress extends Address{
	protected String addressLine, city, regionOrState, zipOrPostCode;
	protected Locale locale = new Locale();
	
	// Getter
	public String getAddressLine() {
		return addressLine;
	}

	// Setter
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	
	// Getter
	public String getCity() {
		return city;
	}

	// Setter
	public void setCity(String city) {
		this.city = city;
	}
	
	// Getter
	public String getRegionOrState() {
		return regionOrState;
	}

	// Setter
	public void setRegionOrState(String regionOrState) {
		this.regionOrState = regionOrState;
	}

	// Getter
	public String getZipOrPostCode() {
		return zipOrPostCode;
	}

	// Setter
	public void setZipOrPostCode(String zipOrPostCode) {
		this.zipOrPostCode = zipOrPostCode;
	}
	
	// Getter
	public Locale getLocale() {
		return locale;
	}

	// Setter
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	public GeographicAddress() {
		addressLine = null;
		city = null;
		regionOrState = null;
		zipOrPostCode = null;
		locale = null;
	}
	
	/**
	* Creates the constructor and copies the parameters
	*/
	public GeographicAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale locale) {
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.addressLine = addressLine;
		this.city = city;
		this.regionOrState = regionOrState;
		this.zipOrPostCode = zipOrPostCode;
		this.locale = locale;
	}
	
	/**
	* Prints the information of the address
	*
	*/
	@Override
	public String toString() {
		return "The geographic address: " + addressLine + ", " + city + ", " + regionOrState + ", " + zipOrPostCode + ", " + locale 
				+ " is valid from " + validFrom + " to " + validTo;
	}

	/**
	* Verifies the first object to compare to if its null or different type, then it returns false if those conditions are true
	*/
	public Boolean equals(GeographicAddress object) {
		if (object.getClass() == this.getClass() && object != null) {
			if (object.validFrom == this.validFrom 
					&& object.validTo == this.validTo 
					&& object.addressLine == this.addressLine
					&& object.city == this.city 
					&& object.regionOrState == this.regionOrState
					&& object.zipOrPostCode == this.zipOrPostCode 
					&& object.locale == this.locale) 
				return true;
			else 
				return false;	
		}
		else 
			return false;
	}
	
	
}
