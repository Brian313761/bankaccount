package bankaccount;

public class BankAccount {

	int accountNumber;
	double balance;
	
	public BankAccount(int accountNumber) {
		this.accountNumber= accountNumber;
	//this.balance = balance;
		this.balance= 0.0;
	}
	
	void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Desposited $" + amount + " to the account" + accountNumber);
		}
		else {
			System.out.println("Deposit invalid");
			
			
		}
	}
	
	void withdraw(double amount) {
		if(amount>0) {
			if(amount<=balance) {
				balance -= amount;
				System.out.println("withdraw $" + amount + " from the account" + accountNumber);
			}
			else {
				System.out.println("declined");
			}
			}
		else {
			System.out.println("1");
		}
		}

	public double getbalance() {
		return(balance);
			
	// 
	}
	
	

	public static void main(String[] args) {
		//create object of bank account
		
BankAccount bankaccount1= new BankAccount(1);
bankaccount1.deposit(100);

bankaccount1.withdraw(80);

System.out.println("current balance $" + bankaccount1.getbalance() );

BankAccount bankaccount2= new BankAccount(2);
bankaccount2.deposit(64);

bankaccount2.withdraw(33);

System.out.println("current balance $" + bankaccount2.getbalance() );

}
}
