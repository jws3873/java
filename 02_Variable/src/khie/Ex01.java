package khie;

/*
 *  변수(Variable)?
 *  -프로그래밍에서 가장 기본적인 동작은 데이터를 저장하고, 저장된 데이터 값을 읽어오는 것.
 *  -데이터를 저장하려면 메모리에 값을 저장할 공간을 생성하고 이름을 부여해야 함.
 *  -하나의 데이터(값을)를 저장할 수 있는 메모리 공간을 의미함.
 *  -변수는 여러 개의 값을 저장할 없고, 오직 하나의 값만을 저장할 수 있음.
 *  -필요한 데이터를 저장할 곳을 미리 선언해 주고, 나중에 계속해서 사용하기 위한 변수를 만듬.
 *  -데이터를 저장하기 위해서 생성하는 메모리 공간은 목적에 따라 크기와 특징이 다른데, 이를
 *   자료형이라고 함. 즉, 메모리 공간의 자료형에 따라 저장할 수 있는 값의 종류와 특징이 결정됨.
 *   
 *   
 *   변수를 선언하는 방법
 *   - 형식) 자료형 변수명;
 *   		-자료형: java의 기본 자료형(8가지)
 *   		-변수명: 사용자가 임의로 만들 수 있음.
 */

/*
 * java 에서의 기본 자료형(8가지)
 * 1. 정수형(정수자료형) : byte(1바이트), short(2byte)
 * 					   int(4byte - 기본자료형), long(8byte)
 * 2. 실수형(실수자료형): float(4byte). double(8byte - 기본자료형)
 * 3. 단일문자형 : char(2byte~3byte)
 * 4. 논리형(논리자료형): boolean(true/false)
 * 
 * - 나머지 자료형은 참조 자료형: 5장부터 나오는 내용
 */

/*
 * 변수 사용 절차
 * 1. 변수선언- 자료형 변수명;
 * 2. 변수 초기화 - 변수에 값을 저장(= 기호를 사용)
 * 3. 변수 이용 - 연산 및 출력
 * 
 * 변수명(식별자) 만드는 작성 규칙
 * -변수명, 메서드, 클래스 등의 이름을 지정할 때 사용함.
 * 1. 예약어(키워드 - 문법적으로 사용되는 단어) 사용불가.
 * 2. 영문자 또는 특수문자(_or $ )로 시작.
 * 3. 숫자로 시작하면 안됨. -)예 1sum(x)
 * 4. 대소문자는 구분함. - SUM과  sum은 다른 변수명으로 인식
 * 5. 변수명은 의미있게 만드는 것이 좋음.
 */
public class Ex01 {

	public static void main(String[] args) {
		// 1. 변수선언 
		//int su;
		
		//2. 변수 초기화 - 변수에 값을 저장(= 기호를 사용)
		//su = 100;
		
		// 1+2: 변수 선언 및 변수 초기화
		int su = 100;
		
		su = 345+1024;
		
		su +=2000;
		
		int su2 = 330;
		
		// 3. 변수 이용- 연산 및 출력
		System.out.println(su);
		System.out.println("sum >>> "+(su+su2));
		

	}

}