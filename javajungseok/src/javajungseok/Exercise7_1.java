package javajungseok;
//[7-1] ����ī�� ���� �����ϴ� ����ī�� �� �� Ŭ���� �� ������ ���̴� �� 20 (SutdaDeck ) .
//��ī�� ���� ��� �迭�� �ʱ�ȭ�Ͻÿ� �� ����ī��� ���� ������ ���� 20 SutdaCard . , 1 10
//�� ���� ī�尡 �� �־� �ְ� ���ڰ� �� ��쿡�� �� ���� �� ���� �� �� , 1, 3, 8 (Kwang)
//��� �Ѵ� �� �� �ν��Ͻ����� �� ���� �̾�� �Ѵ� . , SutdaCard isKwang true .

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		
		for(int i =0;i<cards.length;i++) {
			int num =(i%10)+1;
			boolean isKwang=(i<10)&&(num==1||num==3||num==8);
			cards[i]=new SutdaCard(num,isKwang);
		}
		}
	
	void shuffle() {
		
		SutdaCard temp = new SutdaCard();
		for(int i =0;i<cards.length;i++) {
		int random = (int)(Math.random()*CARD_NUM);
		temp = cards[i];
		cards[i] = cards[random];
		cards[random] = temp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		return cards[(int)(Math.random()*CARD_NUM)];
	}
	
	}


class SutdaCard{
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1,true);
	}
	SutdaCard(int num,boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num+(isKwang ? "K":"");
	}
}


public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i<deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));

		
	}

}
