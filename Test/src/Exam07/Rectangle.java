package Exam07;

public class Rectangle implements Shape{
	
	int row,column;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int row,int column) {
		this.row = row;
		this.column = column;
	}
	
@Override
public double findArea() {
	// TODO Auto-generated method stub
	return row*column;
}
}
