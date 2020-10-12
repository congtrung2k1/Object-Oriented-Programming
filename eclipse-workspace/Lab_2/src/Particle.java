class Particle {
	int x, y;
	int dirx, diry;
	
	Particle() {}
	Particle(int x, int y, int dirx, int diry) {
		this.x = x;
		this.y = y;
		this.dirx = dirx;
		this.diry = diry;
	}
	
	public boolean IsCollide(Particle A) {
		return this.x == A.x && this.y == A.y;
	}
	
	public void nextPosition(int boundx, int boundy) {
		if (this.x + this.dirx == -1 || this.x + this.dirx == boundx)
			this.dirx *= -1;
		
		if (this.y + this.diry == -1 || this.y + this.diry == boundy)
			this.diry *= -1;
			
		this.x += dirx;
		this.y += diry;
	}
}
