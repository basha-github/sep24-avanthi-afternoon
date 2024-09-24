class ReserveBank {
	int balance;

	public ReserveBank(int balance) {
		this.balance = balance;
	}

	void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("From Reserve Bank");
		System.out.println("Successfully Deposited amt-->" + amt);

	}

	void withDraw(int amt) {
		this.balance = this.balance - amt;
	}

	void checkBalance() {
		System.out.println("aval balance---->" + this.balance);
	}

}

class SBIBank extends ReserveBank {

	int accNo;
	String name;

	public SBIBank(int balance, int accNo, String name) {

		super(balance);
		this.accNo = accNo;
		this.name = name;
	}

	void deposit(int amt) {
		System.out.println("From SBI Bank... Deposit");

		if (amt < 50000) {
			this.balance = this.balance + amt;
			System.out.println("Successfully Deposited amt-->" + amt);
		} else {
			System.out.println("Limit Exceeds.....");
		}
	}

	void withDraw(int amt) {
		if (amt < 50000) {
			this.balance = this.balance - amt;
			System.out.println("From SBI Bank");
			System.out.println("Successfully WithDraw amt-->" + amt);

		} else {
			System.out.println("Limit Exceeds");
		}
	}

}

class AxisBank extends ReserveBank {

	int accNo;
	String name;

	public AxisBank(int balance, int accNo, String name) {

		super(balance);
		this.accNo = accNo;
		this.name = name;
	}

	void deposit(int amt) {
		System.out.println("From Axis Bank... Deposit");

		if (amt < 200000) {
			this.balance = this.balance + amt;
			System.out.println("Successfully Deposited amt-->" + amt);
		} else {
			System.out.println("Limit Exceeds.....");
		}
	}

	void withDraw(int amt) {
		System.out.println("From Axis Bank");

		if (amt < 200000) {
			this.balance = this.balance - amt;
			System.out.println("Successfully WithDraw amt-->" + amt);

		} else {
			System.out.println("Limit Exceeds");
		}
	}

}

public class OverRidingDemo {

	public static void main(String[] args) {

		SBIBank sbiAcc = new SBIBank(10000, 23456, "Ramu");

		sbiAcc.deposit(65000);
		sbiAcc.checkBalance();

		AxisBank shyamAcc = new AxisBank(5000, 10056, "Shyam");

		shyamAcc.deposit(65000);
		shyamAcc.checkBalance();

	}

}
