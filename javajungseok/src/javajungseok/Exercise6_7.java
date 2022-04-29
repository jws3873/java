package javajungseok;
class Marine{
	int x =0,y = 0;
	int hp = 60;
	static int weapon = 6;
	static int armor=0;
	static void weaponUp() {
		weapon++;
	}
	void armor() {
		armor++;
	}
	void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
public class Exercise6_7 {

	public static void main(String[] args) {
		Marine m = new Marine();
		System.out.println(Marine.weapon);
		Marine.weaponUp();
		System.out.println(m.x);
		
	
	}

}


