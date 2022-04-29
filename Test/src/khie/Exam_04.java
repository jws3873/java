package khie;

public class Exam_04 {

	public static void main(String[] args) {
		int su = Integer.parseInt(args[0]);
		System.out.printf("입력받은 숫자 ==> %d%n",su);
		int oc,c,ob,b,os,s,o,i,res;
		oc = su/5000;
		res = su%5000;
		System.out.printf("오천원 지폐 : %d장%n",oc);
		c = res/1000;
		res = res%1000;
		System.out.printf("천원 지폐 : %d장%n",c);
		ob = res/500;
		res = res%500;
		System.out.printf("오백원 동전 : %d개%n",ob);
		b = res/100;
		res = res%100;
		System.out.printf("백원 동전 : %d개%n",b);
		os = res/50;
		res = res%50;
		System.out.printf("오십원 동전 : %d개%n",os);
		s = res/10;
		res = res%10;
		System.out.printf("십원 동전 : %d개%n",s);
		o = res/5;
		res = res%5;
		System.out.printf("오원 동전 : %d개%n",o);
		i = res/1;
		res = res%1;
		System.out.printf("일원 동전 : %d개%n",i);

		
	}

}
