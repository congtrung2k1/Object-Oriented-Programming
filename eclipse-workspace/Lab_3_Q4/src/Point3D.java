
public class Point3D extends Point2D{
	private float z = 0.0f;
	
	public Point3D() {}
	public Point3D(Point2D A) {
		super(A);
	}
	public Point3D(float x, float y, float z) {
		super(x,y);
		this.z = z;
	}
	
	public float getZ() {
		return this.z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	
	public float[] setXYZ() {
		float[] re = new float[3];
		re[0] = getXY()[0];
		re[1] = getXY()[1];
		re[2] = this.z;
		return re;
	}
	
	public String toString() {
		return "(" + getX() + "," + getY() + "," + this.z + ")"; 
	}	
}
