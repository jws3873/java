package khie;
/*
 * 스레드(Thread)?
 * - process를 작은 단위로 쪼개어 놓은 작업단위.
 * ==> 실제 프로그램이 수행되는 작업의 최소 단위 .
 * -스레드는 병행처리를 지원함(멀티태스킹).
 * -응용분야 : 게임, 채팅 등등
 */

/*
 * [스레드 클래스를 작성하는 방법 - 2가지]
 * 1. Thread 라는 클래스를 상속(extends)하여 사용하는 방법
 * 2. Runnable 인터페이스를 구현(implements)하여 사용하는 방법
 */

/*
 * 1. Thread 라는 클래스를 상속(extends)하여 사용하는 방법
 * 1) Thread 라는 클래스를 상속(extends)을 받음.
 * 2) run() 메서드를 overriding한다. - 스레드 구현
 * 3-1) 스레드 클래스의 객체 생성.
 * 3-2) 참조변수.start()메서드를 호출 ==> run()메서드 실행. 
 */

class Thred1 extends Thread{//1-1)Thread 라는 클래스를 상속(extends)을 받음.
	@Override
	public void run() { // 1-2)run() 메서드를 overriding한다. - 스레드 구현
		int i = 1;
		while(true) {
			System.out.println("i>>>"+i);
			i++;
		}
	
	}
}

class Thred2 extends Thread{//1-1)Thread 라는 클래스를 상속(extends)을 받음.
	@Override
	public void run() { // 1-2)run() 메서드를 overriding한다. - 스레드 구현
		int j = 1;
		while(true) {
			System.out.println("j>>>"+j);
			j++;
		}
	
	}
}


public class Ex02 {

	public static void main(String[] args) {
		
		Thred1 thread1 = new Thred1();
		Thred2 thread2 = new Thred2();
		
		thread1.start();//run()메서드를 정의했지만 start()메서드를 호출하면 스레드클래스가 알아서  run()메서드를 호출한다.
		thread2.start();
		

		
		
	}

}
