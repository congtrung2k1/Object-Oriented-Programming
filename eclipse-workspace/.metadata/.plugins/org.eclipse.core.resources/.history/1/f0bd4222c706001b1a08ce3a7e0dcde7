class Rectangle {
	double w, h;
	
	Rectangle(double width, double height){
		if (width < 0) {
			System.out.println("Width Invalid.");
			this.w = 1;
		} 
		else 
			this.w = width;
		
		if (height < 0) {
			System.out.println("Height Invalid.");
			this.h = 1;
		} 
		else 
			this.h = height; 
	}
	
	void display() {
		for (int i = 0; i < this.h; ++i) {
			for (int j = 0; j < this.w; ++j)
				System.out.print('*');
			System.out.println('\n');
		}
		System.out.println('\n');
	}
}