class Triangle {
	double a, b, c;
	
	Triangle (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	String verify() {
		if (this.a == this.b && this.b == this.c)
			return "Equilateral";
		if (this.a == this.b || this.b == this.c || this.a == this.c)
			return "Isosceles";
		if (this.a + this.b > this.c && this.a + this.c > this.b && this.b + this.c > this.a)
			return "Scalene";
		return "Not Triangle";
	}
}