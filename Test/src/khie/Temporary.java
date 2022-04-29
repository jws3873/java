package khie;

public class Temporary {
	String name;
	int time;
	int timePay;
	public Temporary() {
		// TODO Auto-generated constructor stub
	}
	public Temporary(String n,int t,int p) {
		name = n;
		time = t;
		timePay = p;
	}
	public void salaryCalculation() {
		int totalPay,deduction,actualPay;
		totalPay = time*timePay;
		deduction = (int)(totalPay*0.03);
		actualPay = totalPay-deduction;
				
		System.out.println("이름 : "+name);
		System.out.printf("총급여 : %,d원%n",totalPay);
		System.out.printf("공제액 : %,d원%n",deduction);
		System.out.printf("실지급액 : %,d원%n",actualPay);

	}
}
