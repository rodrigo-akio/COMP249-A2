package Head;

/**
* Creates the valid dates and the Address class
*
* @param validFrom 	beginning of the valid date
* @param copy		end of the valid date
*/
public class Address {
	protected String validFrom, validTo;
	
	// Getter
	public String getValidFrom() {
		return validFrom;
	}

	// Setter
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
	  
	// Getter
	public String getValidTo() {
		return validTo;
	}

	// Setter
	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public Address() {
		validFrom = "YYYY-MM-DD";
		validTo = "YYYY-MM-DD";
		}
	
	/**
	* Creates the constructor and copies the parameters
	*/
	public Address(String validFrom, String validTo) {
		this.validFrom = validFrom;
		this.validTo = validTo;
	}
	
	/**
	* Prints the information of the address
	*
	*/
	@Override
	public String toString() {
		return "Valid from " + validFrom + " to " + validTo;
	}
	
	/**
	* Verifies the first object to compare to if its null or different type, then it returns false if those conditions are true
	*/
    public Boolean equals(Address object) {
		if (object.getClass() == this.getClass() && object != null) {
			if (object.validFrom == this.validFrom 
				&& object.validTo == this.validTo)
				return true;
			else
				return false;	
		}
		else 
			return false;	
	}
}
