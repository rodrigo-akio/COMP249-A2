/**
* Creates the web page address class
*
* @param boxLobbyDoorCode 		code of the lobby door
*/
package PhysicalAddress;

public class PostOfficeAddress extends GeographicAddress {
	private int boxLobbyDoorCode;

	// Getter
	public int getBoxLobbyDoorCode() {
		return boxLobbyDoorCode;
	}

	// Setter
	public void setBoxLobbyDoorCode(int boxLobbyDoorCode) {
		this.boxLobbyDoorCode = boxLobbyDoorCode;
	}
	
	public PostOfficeAddress() {
		boxLobbyDoorCode = 0;
	}
	
	/**
	* Creates the constructor and copies the parameters
	*/
	public PostOfficeAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale locale, int boxLobbyDoorCode) {
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.addressLine = addressLine;
		this.city = city;
		this.regionOrState = regionOrState;
		this.zipOrPostCode = zipOrPostCode;
		this.locale = locale;
		this.boxLobbyDoorCode = boxLobbyDoorCode;
	}
	
	/**
	* Prints the information of the address
	*/
	@Override
	public String toString() {
		return "The post office address: " + addressLine + ", " + city + ", " + regionOrState + ", " + zipOrPostCode + ", " + locale 
				+ ", " + boxLobbyDoorCode + " is valid from " + validFrom + " to " + validTo;
	}

	/**
	* Verifies the first object to compare to if its null or different type, then it returns false if those conditions are true
	*/
	public Boolean equals(PostOfficeAddress object) {
		if (object.getClass() == this.getClass() && object != null) {
			if (object.validFrom == this.validFrom 
					&& object.validTo == this.validTo 
					&& object.addressLine == this.addressLine
					&& object.city == this.city 
					&& object.regionOrState == this.regionOrState
					&& object.zipOrPostCode == this.zipOrPostCode 
					&& object.locale == this.locale
					&& object.boxLobbyDoorCode == this.boxLobbyDoorCode) 
				return true;
			else 
				return false;	
		}
		else 
			return false;
	}
}
