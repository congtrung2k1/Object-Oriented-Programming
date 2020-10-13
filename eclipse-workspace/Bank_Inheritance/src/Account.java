
public class Account {
	private int accNo;
	private double accBal;
	
	public Account() {}
	
	public Account(int accNo) {
		this.accNo = accNo;
		this.accBal = 0.0;
	}
	
	public Account(int accNo, double accBal){
		this.accNo = accNo;
		this.accBal = accBal;
	}
	
	public void setNo(int accNo) {
		this.accNo = accNo;
	}
	public void setBal(double accBal) {
		this.accBal = accBal;
	}
	
	public int getNo() {
		return this.accNo;
	}
	public double getBal() {
		return this.accBal;
	}
	
	public void Deposit(double amount) {
		this.accBal += amount;
	}
	public void Withdraw(double amount) {
		this.accBal -= amount;
	}
	
	public String toString() {
		return Integer.toString(this.accNo) + " " + Double.toString(this.accBal);
	}
	
	public final void Print() {
		System.out.println(toString());
	}
}
