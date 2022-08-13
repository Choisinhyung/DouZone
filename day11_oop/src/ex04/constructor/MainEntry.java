package ex04.constructor;

class Point {
	private int x, y;
	
	//생성자의 최대 생성 개수는 클래스가 포함하고 있는 매개변수 +1개이다. 
	public Point() { // 디폴트 생성자 함수
		x = y = 100;
	}
	public Point(int x) { // 매개변수 1개 생성자 함수
		this.x = x;
		y = 88;
	}
	public Point(int x, int y) { // 매개변수 2개 생성자 함수
		this.x = x;
		this.y = y;
	}
	public void disp() {
		System.out.println(x + ", " + y);
	}
	
	
}

public class MainEntry {

	public static void main(String[] args) {
		Point pt = new Point();
		Point pt2 = new Point(20, 30); // 생성자함수 자동호출 : 절대 명시적으로 불러내지 못함(pt. 안됨)
		pt2.disp();
		pt.disp();
		

	}

}
