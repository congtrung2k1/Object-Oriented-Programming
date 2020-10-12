class Box {
	int w, h;
	
	Box(int w, int h){
		this.w = w;
		this.h = h;
	}
	
	private static Box instance;
	private Box() {};
	
	public static Box getInstance(int w, int h){
		if (instance == null) {
			instance = new Box(w, h);
		}
		return instance;
	}
	
	public int cnt = 0;
	public Particle[] exist = new Particle[1000];
	
	public void newParticle(Particle newInput) {
		this.exist[cnt] = newInput;
		this.cnt += 1;
	}
	
	public boolean check(int s, int v) {
		for (int i = 0; i < this.cnt; ++i) { 
			if (this.exist[i].x == s && this.exist[i].y == v)
				return false;
		}
		return true;
	}
}
