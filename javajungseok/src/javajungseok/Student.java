package javajungseok;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	public Student() {
	}
	public Student(String name,int ban,int no,int kor,int eng,int math) {
	this.name = name;
	this.ban = ban;
	this.no = no;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	}
	public String info() {
		int total = kor+eng+math;
		double avg = (int)(total*3f*10*0.5f)/10f;
//				((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f);
//				((int)((total) / 3f*10+0.5f)/10f);
//		((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f)

		return name+","+ban+","+no+","+kor+","+eng+","+math+","+total+","+avg;
	}
	public int getTotal() {
		return kor+eng+math;
	}
	public float getAverage() {
		return ((int)(getTotal() / 3f * 10 + 0.5f) / 10f);
	}
	
}
