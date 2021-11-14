package PhysicalAddress;

public class Locale {
	private String localeCode1, localeCountryName;
	private int localeCode2;
	
	// Getter
	public String getLocaleCode1() {
		return localeCode1;
	}
	
	// Setter 
	public void setLocaleCode1(String localeCode1) {
		this.localeCode1 = localeCode1;
	}

	// Getter
	public String getLocaleCountryName() {
		return localeCountryName;
	}

	// Setter
	public void setLocaleCountryName(String localeCountryName) {
		this.localeCountryName = localeCountryName;
	}

	// Getter
	public int getLocaleCode2() {
		return localeCode2;
	}

	// Setter
	public void setLocaleCode2(int localeCode2) {
		this.localeCode2 = localeCode2;
	}
	
	public Locale() {
		localeCode1 = null;
		localeCountryName = null;
		localeCode2 = 0;
	}
	
	/**
	* Creates the constructor and copies the parameters
	*/
	public Locale(String localeCode1, String countryName, int localeCode2) {
		this.localeCode1 = localeCode1;
		this.localeCountryName = countryName;
		this.localeCode2 = localeCode2;
	}
	
	/**
	* Prints the information of the address
	*
	*/
	@Override
	public String toString() {
		return "\"" + localeCode1 + "\" " + localeCode2 + " \"" + localeCountryName + "\"" ;
	}

	/**
	* Verifies the first object to compare to if its null or different type, then it returns false if those conditions are true
	*/
	public Boolean equals(Locale object) {
		if (object.getClass() == this.getClass() && object != null) {
			if (object.localeCode1 == this.localeCode1 
					&& object.localeCode2 == this.localeCode2 
					&& object.localeCountryName == this.localeCountryName) 
				return true;
			else 
				return false;	
		}
		else 
			return false;
	}
}
