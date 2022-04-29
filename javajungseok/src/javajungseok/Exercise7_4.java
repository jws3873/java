package javajungseok;
//[7-4] MyTv isPowerOn, channel, volume 클래스의 멤버변수 을 클래스 외부에서 접근할 수
//없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
//getter setter .

class MyTv1{
	private boolean isPowerOn;
	private int channel;
	private int volum;
	private int prevchannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setchannel(int channel) {
		prevchannel = this.channel;
		if(channel>MAX_CHANNEL||channel<MIN_CHANNEL) {
			return;
		}
		this.channel = channel;
	}
	public int getchannel() {
		return channel;
	}
	
	public void setvolum(int volum) {
		if(volum>MAX_VOLUME||volum<MIN_VOLUME) {
			return;
		}
		this.volum = volum;
	}
	public int getvolum() {
		return volum;
	}
	public void gotoPrevChnnel() {
		setchannel(prevchannel);
	}
}


public class Exercise7_4 {

	public static void main(String[] args) {
		MyTv1 t = new MyTv1();
		
		t.setchannel(10);
		System.out.println("CH:"+t.getchannel());
		t.setchannel(20);
		System.out.println("CH:"+t.getchannel());
		t.gotoPrevChnnel();
		System.out.println("CH:"+t.getchannel());
		t.gotoPrevChnnel();
		System.out.println("CH:"+t.getchannel());

		
	}

}
