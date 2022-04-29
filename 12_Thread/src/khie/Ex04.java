package khie;

/*
 * 무명 클래스(anonymous class)를 이용한 스레드 생성.
 * - 코드의 집중화로 가독성이 높아진다.
 * - 변도의 상속 과정이 필요가 없다.
 */
public class Ex04 {

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 1;
				while(true) {
					System.out.println("i >>> "+i);
					i++;
					if(i>100) break;
				}
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				int j = 1;
				while(true) {
					System.out.println("j >>> "+j);
					j++;
					if(j>100) break;
				}
			}
		}).start();
		
		
	}

}//소스코드 확인
