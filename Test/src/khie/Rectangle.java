package khie;

public class Rectangle {
	int row, column;
	public Rectangle() {
	}
	public Rectangle(int r, int c) {
		row = r;
		column = c;
	}
	public int width() {
		return row*column;
	}
	
	public int circumference() {
		return (row+column)*2;
	}
}
