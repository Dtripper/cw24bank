package MyBank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import Bank.*;

public class BankManager {

	private static HashMap<String, Customer> _allCustomer = new HashMap<String,Customer>();
	private static HashMap<Integer,Account> _allAccounts = new HashMap<>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer cust1 = new Customer("1114");
		Customer cust2 = new Customer("1112");
		Customer cust3 = new Customer("1113");
		Account acc1 = new Account(1);
		
		cust1.AddAccount(acc1,true);
		_allCustomer.put(cust1.getTz(),cust1);
		_allAccounts.put(acc1.get_id(), acc1);
		//acc1.AddCustomer(cust1);
		
		List<Customer> list = new ArrayList<Customer>();
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		
		
		Collections.sort(list);
		
		for (Customer cust :list)
		{
			System.out.println(cust.toString());
		}
		
		Customer.ConnectionDetails conne = cust1.new ConnectionDetails();
		
		conne.setPassword("ddd");
		conne.setUserName("username");
		
		Customer.ConnectionDetails conne2 = cust1.new ConnectionDetails();
		
		conne2.setPassword("ddd");
		conne2.setUserName("username");
		
	}

}
