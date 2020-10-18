
public class MyRectangle extends MyBoundedShape {
	private int a;
	private int b;
	
	MyRectangle(){}
	MyRectangle(int a, int b){
		this.a = a;
		this.b = b;
	}
		
	@Override
	public void set(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double GetArea() {
		return this.a * this.b;
	}

	@Override
	public void Draw() {
		System.out.println("Drawing a Rectangle.");
		for (int i = 0; i < this.a; ++i) {
			for (int j = 0; j < this.b; ++j)
				System.out.print("*");
			System.out.println();
		}
	}
	
	@Override
	public void set(int val) {}
}
