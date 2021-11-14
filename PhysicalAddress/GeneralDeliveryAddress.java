package PhysicalAddress;
import RemoteAddress.TelecomAddress;

/**
* Contains general delivery addresses
* 
* @param TelecomAddress		constructor for telecom address
*/
public class GeneralDeliveryAddress extends GeographicAddress {
	protected TelecomAddress telecomAddress = new TelecomAddress();
	
	/**
	* Constructor for general delivery addresses
	*/
	public GeneralDeliveryAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, TelecomAddress telecomAddress) {
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.addressLine = addressLine;
		this.city = city;
		this.regionOrState = regionOrState;
		this.zipOrPostCode = zipOrPostCode;
		this.telecomAddress = telecomAddress;
	}
	
	/**
	* Prints the information of the address
	*/
	@Override
	public String toString() {
		return "The general delivery address: " + addressLine + ", " + city + ", " + regionOrState + ", " + zipOrPostCode + ", " + telecomAddress + " is valid from " + validFrom + " to " + validTo;
	}

	/**
	* Verifies the first object to compare to if its null or different type, then it returns false if those conditions are true
	*/
	public Boolean equals(GeneralDeliveryAddress object) {
		if (object.getClass() == this.getClass() && object != null) {
			if (object.validFrom == this.validFrom 
					&& object.validTo == this.validTo 
					&& object.addressLine == this.addressLine
					&& object.city == this.city 
					&& object.regionOrState == this.regionOrState
					&& object.zipOrPostCode == this.zipOrPostCode 
					&& object.telecomAddress == this.telecomAddress) 
				return true;
			else 
				return false;	
		}
		else 
			return false;
	}
}
