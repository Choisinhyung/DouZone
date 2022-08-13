package ex04.staticMember;

class Atm {
	int count; // instance member
	static int total; // static member
	
	public Atm(int amount) { // construstor method
		count += amount;
		total += amount;
	}
	
	public static void view() {
		total += 100;
//		count += 100; static 메서드에는 instance 변수 사용 불가능
	}
	
	public void show(int count, int total) {
		this.count = count;
//		this.total = total; // static멤버에는 this.사용 불가
	}
	
	public void display() { // instance method에서는 둘 다 사용 가능하다.
		count += 200;
		total += 200;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
	
	
}

public class MainEntry {

	public static void main(String[] args) {
		Atm at = new Atm(1000);
		at.display();
		System.out.println("--------------");
		Atm at2 = new Atm(1000);
		at2.display();
		System.out.println("--------------");
		Atm at3 = new Atm(1000);
		at3.display();
		// static 멤버는 누적된다(공유가능)
		// instance 멤버는 매번 초기화
		System.out.println(at.count);
		System.out.println(Atm.total);

	}

}
