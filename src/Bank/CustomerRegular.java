package Bank;

public class CustomerRegular extends Customer {

	public CustomerRegular(String tz, String firstName, String lastName,
			String phoneNumber, String address,
			EnumCustomerType enumCustomerType) {
		super(tz, firstName, lastName, phoneNumber, address, EnumCustomerType.regular);
		
	}

}
