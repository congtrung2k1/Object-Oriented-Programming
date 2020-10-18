
public class MyLine extends MyShape {
	private int length;
	
	public MyLine(){}
	public MyLine(int length) {
		this.length = length;
	}
	
	@Override
	public void set(int val) {
		this.length = val;
	}
	
	@Override
	public void Draw() {
		System.out.println("Drawing the line.");
		for (int i = 0; i < length; ++i)
			System.out.print("*");
		System.out.println();
	}
}
