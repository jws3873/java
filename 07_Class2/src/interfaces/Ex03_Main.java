package interfaces;
interface Camera{
	//사진을 찍는 기능
	public abstract void phto();
}

interface DMB{
	// TV를 보는 기능
	public abstract void viewTv();
}

interface MP3{
	public abstract void playMP3();
}

class Myphone implements Camera,DMB,MP3{

	@Override
	public void playMP3() {
		System.out.println("핸드폰으로 음악을 들어요~~");		
	}

	@Override
	public void viewTv() {
		System.out.println("핸드폰으로 tv를 봐요~~");
	}

	@Override
	public void phto() {
		System.out.println("핸드폰으로 사진을 찍어요~~");
		
	}
	
}
public class Ex03_Main {

	public static void main(String[] args) {

		Myphone phone = new Myphone();
		phone.playMP3();phone.viewTv();phone.phto();
		
	}

}
