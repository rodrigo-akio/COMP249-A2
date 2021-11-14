package RemoteAddress;
import Head.Address;

/**
* Creates the web page address class
*
* @param userName 		user name of the email address
* @param domainName		name of the domain
* @param TLD			top level domain
* @param atSymbol		@ part of the email address
* @param dot			. part of the email address
*/
public class EmailAddress extends Address{
	private String userName, domainName, TLD;
	public static String atSymbol = "@";
	public static String dot = ".";
	
	// Getter
	public String getUserName() {
		return userName;
	}

	// Setter
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	// Getter
	public String getDOmainName() {
		return domainName;
	}

	// Setter
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	
	// Getter
	public String getTLD() {
		return TLD;
	}

	// Setter
	public void setTLD(String TLD) {
		this.TLD = TLD;
	}
	
	public EmailAddress() {
		userName = null;
		domainName = null;
		TLD = null;
	}
	
	/**
	* Creates the constructor and copies the parameters
	*/
	public EmailAddress(String validFrom, String validTo, String userName, String atSymbol, String domainName, String dot, String TLD) {
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.userName = userName;
		this.TLD = TLD;
	}
	
	/**
	* Prints the information of the address
	*
	*/
	@Override
	public String toString() {
		return "The email address: " + userName + atSymbol + domainName + dot + TLD + " is valid from " + validFrom + " to " + validTo;
	}
	
	/**
	* Verifies the first object to compare to if its null or different type, then it returns false if those conditions are true
	*/
	public Boolean equals(EmailAddress object) {
		if (object.getClass() == this.getClass() && object != null) {
			if (object.validFrom == this.validFrom 
				&& object.validTo == this.validTo
				&& object.userName == this.userName
				&& object.domainName == this.domainName
				&& object.TLD == this.TLD)
				return true;
			else
				return false;	
		}
		else 
			return false;	
	}
}
