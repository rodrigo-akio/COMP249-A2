package RemoteAddress;
import Head.Address;

/**
* Creates the web page address class
*
* @param www 			world wide web
* @param URL			uniform resource locator
* @param resourceName	name of the resource
*/
public class WebPageAddress extends Address {
	public static String www = "www.";
	private String URL, resourceName;
	
	// Getter
	public String getURL() {
		return URL;
	}

	// Setter
	public void setURL(String URL) {
		this.URL = URL;
	}
	
	// Getter
	public String getResourceName() {
		return resourceName;
	}

	// Setter
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
	public WebPageAddress() {
		URL = null;
		resourceName = null;
	}
	
	/**
	* Creates the constructor and copies the parameters
	*/
	public WebPageAddress(String validFrom, String validTo, String www, String URL, String resourceName) {
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.URL = URL;
		this.resourceName = resourceName;
	}
	
	/**
	* Prints the information of the address
	*
	*/
	@Override
	public String toString() {
		return "The web page address: " + www + URL + resourceName + " is valid from " + validFrom + " to " + validTo;
	}
	
	/**
	* Verifies the first object to compare to if its null or different type, then it returns false if those conditions are true
	*/
    public Boolean equals(WebPageAddress object) {
		if (object.getClass() == this.getClass() && object != null) {
			if (object.validFrom == this.validFrom 
				&& object.validTo == this.validTo
				&& object.URL == this.URL
				&& object.resourceName == this.resourceName)
				return true;
			else
				return false;	
		}
		else 
			return false;	
	}
}
