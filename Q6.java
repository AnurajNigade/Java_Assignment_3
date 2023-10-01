class Customer{
	String customerName;
	String address;
	String phNo;
	
	public Customer(String customerName, String address, String phNo) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.phNo = phNo;
	}

	
	
	
}
class Account{
	int accNo;
	double balance;
	
	public Account(int accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	
	
	
	
}
class RBI{
	Customer customer;
	Account account;
	
	

	public RBI(Customer customer, Account account) {
		super();
		this.customer = customer;
		this.account = account;
	}


	public double getWithdrawalLimit() {
		return 10000;
	}
	public double getInterestRate() {
        
        return 4.0; 
    }

	
	

}
class SBI extends RBI{

	public SBI(Customer customer, Account account) {
		super(customer, account);
		
	}
	
	public String toString() {
		return "SBI customer=" + customer.customerName + "\n "+customer.address+" \n "+customer.phNo+" \n account=" + account.accNo +" \n"+account.balance+ ", \nWithdrawalLimit=" + getWithdrawalLimit()
				+ ", InterestRate=" + getInterestRate() + "]";
	}
	
}
class PNB extends RBI{

	public PNB(Customer customer, Account account) {
		super(customer, account);
		
	}
	
	public String toString() {
		return "PNB customer=" + customer.customerName + "\n "+customer.address+" \n "+customer.phNo+" \n account=" + account.accNo +" \n"+account.balance+ ", \nWithdrawalLimit=" + getWithdrawalLimit()
				+ ", InterestRate=" + getInterestRate() + "]";
	}
}
public class Q6 {
	public static void main(String[] args) {
		
		Customer c1=new  Customer("Anuraj", "Bhor-Pune", "486541534");
		Account a1=new Account(202957202, 87485745);
		
		SBI sAccount=new SBI(c1, a1);
		
		Customer c2 =new Customer("Shubham", "Ghulewadi-Sangmaner", "562416552");
		Account a2=new Account(653241, 876498657);
		
		PNB pAccount =new PNB(c2, a2);
		
		System.out.println(sAccount.toString());
		System.out.println(pAccount.toString());
		
		
	}
}
