package khie;

class Runnable3 implements Runnable{
	@Override
	public synchronized void run() {
		for(int i =1;i<=100;i++) {
			System.out.println("i>>>"+i);
		}
	}
}

class Runnabla4 implements Runnable{
	public synchronized void run() {
		for(char c ='A';c<='Z';c++) {
			System.out.println("c>>>"+c);
		}
	}
}


public class test {
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable3());
		Thread t2 = new Thread(new Runnabla4());
		
		t1.start();
		t2.start();
		
		
		
	}

}
