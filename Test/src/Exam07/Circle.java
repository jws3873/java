package Exam07;

public class Circle implements Shape{
	int radius; //반지름 변수
	
	public Circle() { //기본 생성자 
	}
	public Circle(int radius) {
		this.radius = radius;
	}//인자 생성자

@Override
public double findArea() {

	return 3.14*radius*radius;
}
}
