package Class;
class Point {
	int x,y;
	public Point() {
	}
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
class Point3D extends Point{
	int z;
	public Point3D(int x,int y,int z) {
//		super();
//		super.x = x;
//		super.y = y;
//		this.z = z;
		super(x,y);
		this.z = z;
	}
}
public class Test1 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println("X : "+p.x+", y : "+p.y+", z : "+p.z);
	}

}