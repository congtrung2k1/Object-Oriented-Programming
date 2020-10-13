
public class SavingAccount extends Account{
	public double percent;
	public int term;
	
	public SavingAccount(int accNo) {
		super(accNo);
	}
	public SavingAccount(int accNo, double accBal) {
		super(accNo, accBal);
	}
	public SavingAccount(int accNo, double accBal, double percent, int term) {
		super(accNo, accBal);
		this.percent = percent;
		this.term = term;
	}
	
	public void onTime(int time) {
		if (this.term == time) {
			double term = super.getBal();
			term += (term / 100) * this.percent;
			super.setBal(term);
		}
	}	
}
