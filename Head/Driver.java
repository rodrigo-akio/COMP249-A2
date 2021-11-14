package Head;
import PhysicalAddress.GeneralDeliveryAddress;
import PhysicalAddress.GeographicAddress;
import PhysicalAddress.Locale;
import PhysicalAddress.PostOfficeAddress;
import RemoteAddress.EmailAddress;
import RemoteAddress.TelecomAddress;
import RemoteAddress.WebPageAddress;


public class Driver {

	/**
	* Traces obsolete addresses and identifies valid and obsolete addresses.
	*
	* @param Array 		the array of addresses
	* @param YYYY		tHe year
	* @param MM 		the Month
	* @param DD 		the day
	*/
	public static void traceObsoleteAddresses(Address[] Array, int YYYY, int MM, int DD) {
		for (int i = 0; i < Array.length; i++) {
			if (Array[i].validFrom == null || YYYY < Integer.parseInt(Array[i].validFrom.substring(0, 4))
					|| Array[i].validTo == null || YYYY > Integer.parseInt(Array[i].validTo.substring(0, 4)))
				System.out.println("Obselete Address: " + Array[i].toString());
			
			else if (YYYY == Integer.parseInt(Array[i].validFrom.substring(0, 4)) 
					&& MM < Integer.parseInt(Array[i].validFrom.substring(5, 7))
					|| YYYY == Integer.parseInt(Array[i].validTo.substring(0, 4)) 
					&& MM > Integer.parseInt(Array[i].validTo.substring(5, 7)))
				System.out.println("Obselete Address: " + Array[i].toString());
			
			else if (YYYY == Integer.parseInt(Array[i].validFrom.substring(0, 4)) 
					&& MM == Integer.parseInt(Array[i].validFrom.substring(5, 7))
					&& DD < Integer.parseInt(Array[i].validFrom.substring(8, 10))
					|| YYYY == Integer.parseInt(Array[i].validTo.substring(0, 4)) 
					&& MM == Integer.parseInt(Array[i].validTo.substring(5, 7))
					&& DD > Integer.parseInt(Array[i].validTo.substring(8, 10)))
				System.out.println("Obselete Address: " + Array[i].toString());	
			
			else
				System.out.println("Valid Address: " + Array[i].toString());
		}
	}
	
	/**
	* Copies the array to another one, and returns that new duplicate array
	*
	* @param Array 		the array of addresses
	* @param copy		the new duplicate array
	* @return 			the new duplicate array
	*/
	public static Address[] copyAddresses(Address[] Array) {
        Address[] copy = new Address[Array.length];
        System.arraycopy(Array, 0, copy, 0, Array.length);
        
        return copy;
    }

	/**
	* Driver array to launch all necessary methods and prints
	*
	* @param array1 	array of the addresses
	* @param array2		the new duplicate array
	* @param WPA1		web address 1
	* @param WPA2 		web address 2
	* @param WPA3		web address 3
	* @param EA1		email address 1
	* @param EA2 		email address 2
	* @param EA3		email address 3
	* @param TA1		telecom address 1
	* @param TA2		telecom address 2
	* @param L1			locale 1
	* @param L2			locale 2
	* @param GA1		geographic address 1
	* @param GA2		geographic address 2
	* @param GA3		geographic address 3
	* @param POA1		post office address 1
	* @param POA2		post office address 2
	* @param GDA1		general delivery address 1
	* @param GDA2		general delivery address 2
	*/
	public static void main(String[] args) {
		Address[] array1 = new Address[15];
		Address[] array2 = new Address[array1.length];
		
		WebPageAddress WPA1 = new WebPageAddress("1997-04-05", "2017-03-01", WebPageAddress.www, "davidconte.com", "/facebook");
		WebPageAddress WPA2 = new WebPageAddress("1998-01-01", "2016-11-11", WebPageAddress.www, "cadonechocolate.com", "/facebook");
		WebPageAddress WPA3 = new WebPageAddress("1830-01-01", "2019-11-12", WebPageAddress.www, "fontaneesweets.com", "/info");
		
		EmailAddress EA1 = new EmailAddress("1996-03-22", "2017-03-01", "bobsurrey2000", EmailAddress.atSymbol, "yahoo", EmailAddress.dot, "com");
		EmailAddress EA2 = new EmailAddress("1998-01-12", "2013-04-02", "foxxy233", EmailAddress.atSymbol, "gmail", EmailAddress.dot, "com");
		EmailAddress EA3 = new EmailAddress("1993-01-12", "2240-01-02", "rondeecax44", EmailAddress.atSymbol, "gmail", EmailAddress.dot, "ca");
		
		TelecomAddress TA1 = new TelecomAddress("1998-06-19", "2018-03-23", "+1", "(0)", 204, 4567944, 394, "mobile");
		TelecomAddress TA2 = new TelecomAddress("2001-03-13", "2019-01-14", "+1", "(0)", 301, 4465944, 302, "fax");
		
		Locale L1 = new Locale("CA", "Canada", 123);
		Locale L2 = new Locale("US", "The United States of America", 840);

		GeographicAddress GA1 = new GeographicAddress("1997-04-05", "2017-03-01", "305 Avenue Mustarde", "Pierrefonds", "QC", "H9R4P3", L1);
		GeographicAddress GA2 = new GeographicAddress("1999-09-09", "2019-01-01", "452 Avenue Rattoon", "DDO", "QC", "H9R543", L2);
		GeographicAddress GA3 = new GeographicAddress("1800-01-11", "2019-01-04", "112 Avenue Serenlo", "DDO", "QC", "H9R44P5", L2);
		
		PostOfficeAddress POA1 = new PostOfficeAddress("1953-04-01", "2017-03-01", "34 Avenue Locha", "Dorval", "QC", "H9R343", L1, 235067);
		PostOfficeAddress POA2 = new PostOfficeAddress("1993-02-02", "2018-03-01", "305 Avenue Stracone", "Pierrefonds", "QC", "H9R783", L1, 234655);
		
		GeneralDeliveryAddress GDA1 = new GeneralDeliveryAddress("1933-01-01", "2018-03-03", "344 Avenue Mustarde", "Pierrefonds", "QC", "H9R4P3", TA1);
		GeneralDeliveryAddress GDA2 = new GeneralDeliveryAddress("2003-01-01", "2021-03-03", "322 Avenue Lonst", "Dorval", "QC", "H9R4P3", TA2);
		
		array1[0] = WPA1;
		array1[1] = WPA2;
		array1[2] = WPA3;
		array1[3] = EA1;
		array1[4] = EA2;
		array1[5] = EA3;
		array1[6] = TA1;
		array1[7] = TA2;
		array1[8] = GA1;
		array1[9] = GA2;
		array1[10] = GA3;
		array1[11] = POA1;
		array1[12] = POA2;
		array1[13] = GDA1;
		array1[14] = GDA2;
		
		System.out.println("-----------------------------------------------------");
		System.out.println("   Assignment 2 by Rodrigo Akio de Almeida Hisano ");
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		System.out.println("Testing equals() method");
		System.out.println("Testing WPA1 with WPA2 = " + WPA1.equals(WPA2));
		System.out.println("Testing WPA1 with WPA1 = " + WPA1.equals(WPA1));
		System.out.println("Testing GA1 with GDA2 = " + GA1.equals(GDA2));
		System.out.println("Testing GDA2 with GDA2 = " + GDA2.equals(GDA2));
	
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		System.out.println("Date to pass through: 2018-01-01");
		System.out.println();
		System.out.println("filetering . . .");
		System.out.println();
		traceObsoleteAddresses(array1, 2018, 01, 01);
		
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		System.out.println("Copying array using the copyAddresses() method");
		System.out.println();
		System.out.println("copying . . .");
		System.out.println();
		System.out.println("Displaying the copied array: ");
		array2 = copyAddresses(array1);
		for(int i = 0; i < array2.length; i++)
            System.out.println(array2[i].toString());
		System.out.println();
		System.out.println();
		System.out.println("Displaying the original array: ");
		for(int i = 0; i < array1.length; i++)
            System.out.println(array1[i].toString());
		System.out.println();
		System.out.println("The copy was succesful!");
        
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		System.out.println("All done!");
		
	}
}
