package Bank;

import java.util.HashMap;

public class Account {
	private int _id;
	private String _name;
	private double _balance;
	private EnumAccountType _accountType;
	private double _maxWithdraw;
	
	protected HashMap <String,Customer> _customersofAccount;
	
	public Account(int id)
	{
		this._id = id;
		_customersofAccount = new HashMap<String,Customer>();
	}
	
	public void AddCustomer(Customer cust ,boolean addAccount)
	{
		if (addAccount)
			cust.AddAccount(this,false);
		_customersofAccount.put(cust.getTz(),cust);
	}

	protected EnumAccountType get_accountType() {
		return _accountType;
	}

	protected void set_accountType(EnumAccountType _accountType) {
		this._accountType = _accountType;
	}

	protected double get_balance() {
		return _balance;
	}

	protected void set_balance(double _balance) {
		this._balance = _balance;
	}

	protected String get_name() {
		return _name;
	}

	protected void set_name(String _name) {
		this._name = _name;
	}

	public int get_id() {
		return _id;
	}

	protected void set_id(int _id) {
		this._id = _id;
	}

	private double get_maxWithdraw() {
		return _maxWithdraw;
	}

	private void set_maxWithdraw(double _maxWithdraw) {
		this._maxWithdraw = _maxWithdraw;
	}
	
	@Override
	public String toString() {
		return ("Account number = " + _id 
				+ " Name =" + _name  
				+ " Balance = " + _balance);
	}
	
	public void PrintAllCustomers()
	{
		for (Customer cust:_customersofAccount.values())
		{
			System.out.println(cust.toString());
		}
	}
	
}
