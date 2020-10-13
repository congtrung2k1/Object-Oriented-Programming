
public class CheckingAccount extends Account{
	double limit;
	
	public CheckingAccount(int accNo) {
		super(accNo);
	}
	public CheckingAccount(int accNo, double accBal) {
		super(accNo, accBal);
	}
	public CheckingAccount(int accNo, double accBal, double limit) {
		super(accNo, accBal);
		this.limit = limit;
	}
	
	public void Using(double amount) {
		if (amount <= this.limit + super.getBal()) {
			super.Withdraw(super.getBal() - amount);
		}
	}
}
