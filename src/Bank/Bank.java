package Bank;

import java.util.HashMap;

public class Bank {
	private HashMap<String,Customer> _allBankCustomers;
	private HashMap<Integer,Account > _allBankAccounts;
	private HashMap<Integer,Branch> _allBranches;
	
	
	
	public Bank()
	{
		_allBankCustomers = new HashMap<String,Customer>();
		_allBankAccounts = new HashMap<Integer,Account>();
		_allBranches = new HashMap<Integer,Branch>();
	}
	
	
}
