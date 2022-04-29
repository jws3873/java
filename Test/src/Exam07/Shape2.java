package Exam07;

public class Shape2 implements Circle2,Rectangle2{
	int radius;
	int row;
	int column;
	public Shape2() {
		// TODO Auto-generated constructor stub
	}
	public Shape2(int radius) {
		this.radius = radius;
	}
	public Shape2(int row,int column) {
		this.row = row;
		this.column = column;
	}
	@Override
	public double RectangleArea() {
		// TODO Auto-generated method stub
		return row*column;
	}

	@Override
	public double CircleArea() {
		return 3.14*radius*radius;
	}

}
