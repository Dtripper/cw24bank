package Bank;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class Customer implements Comparable<Customer> ,Serializable{
	
	protected String _tz;
	protected String _firstName;
	protected String _lastName;
	protected String _phoneNumber;
	protected String _address;
	protected EnumCustomerType _customerType;
	public static int bonus;
	
	public class ConnectionDetails
	{
		private String UserName;
		private String Password;
		public String getUserName() {
			return UserName;
		}
		public void setUserName(String userName) {
			UserName = userName;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
	}
	
	
	
	
	private HashMap<Integer,Account> _accountsOfCustomer;

	
	public Customer(String tz)
	{
		this._tz = tz;
		_accountsOfCustomer = new HashMap<Integer,Account>();
	}
	
	public Customer(String tz, String firstName, 
					String lastName,String phoneNumber,
					String address, EnumCustomerType enumCustomerType) 
	{
		
		this._tz = tz;
		this._customerType = enumCustomerType;
		this._firstName = firstName;
		this._lastName = lastName;
		this._address = address;
		this._phoneNumber = phoneNumber;
		
		_accountsOfCustomer = new HashMap<Integer,Account>();
	}
	
	public void AddAccount(Account acc, boolean addCustomer)
	{
		if (addCustomer)
			acc.AddCustomer(this,false);
		_accountsOfCustomer.put(acc.get_id(), acc);
	}

	public String getTz() {
		return _tz;
	}


	public void setTz(String tz) {
		this._tz = tz;
	}


	public String get_firstName() {
		return _firstName;
	}


	public void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}


	public String get_lastName() {
		return _lastName;
	}


	public void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}


	public String get_phoneNumber() {
		return _phoneNumber;
	}


	public void set_phoneNumber(String _phoneNumber) {
		this._phoneNumber = _phoneNumber;
	}


	public String get_address() {
		return _address;
	}


	public void set_address(String _address) {
		this._address = _address;
	}


	public void PrintAllAccounts()
	{
		for (Account ac:_accountsOfCustomer.values())
		{
			System.out.println(ac.toString());
		}
	}
	
	@Override
	public String toString() {
		return "Customer tz = " + _tz + " Name =" +
					_firstName + " Last Name = " + _lastName; 
	}

	@Override
	public int compareTo(Customer custOther) {
		
		int result = this._tz.compareTo(custOther._tz);
		return result;
	}
	
	
}
