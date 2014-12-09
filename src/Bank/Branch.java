package Bank;

import java.util.HashMap;

public class Branch {
	private HashMap<String,Customer> _allBranchCustomers;
	private HashMap<Integer,Account > _allBranchAccounts;
	
	private int _branchNumber;
	private String _branchAddress;
	private String _branchTelephone;
	
	public Branch()
	{
		
	}
	@Override
	public String toString() {
		return "Branch [_allBranchCustomers=" + _allBranchCustomers
				+ ", _allBranchAccounts=" + _allBranchAccounts
				+ ", _branchNumber=" + _branchNumber + ", _branchAddress="
				+ _branchAddress + ", _branchTelephone=" + _branchTelephone
				+ "]";
	}
	public String get_branchTelephone() {
		return _branchTelephone;
	}
	public void set_branchTelephone(String _branchTelephone) {
		this._branchTelephone = _branchTelephone;
	}
	public String get_branchAddress() {
		return _branchAddress;
	}
	public void set_branchAddress(String _branchAddress) {
		this._branchAddress = _branchAddress;
	}
	public int get_branchNumber() {
		return _branchNumber;
	}
	public void set_branchNumber(int _branchNumber) {
		this._branchNumber = _branchNumber;
	}
	
	
}
