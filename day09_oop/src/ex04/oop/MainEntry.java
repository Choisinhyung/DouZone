package ex04.oop;


class Point {
	 private int x;
	 private int y; // 멤버변수
	
	
	// 멤법함수 : getter / setter method
	public void setX(int xx) {
		x = xx;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int yy) {
		y = yy;
	}
	
	public int getY() {
		return y;
	}
	
	public void display() {
		System.out.println(getX() + ", " + getY());
		System.out.println(x + ", " + y); // 함수로 호출 안하고 바로 멤버변수 출력 가능
	}
} // class Point end


class Circle {
	private int x, y, r;
	

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public void output() {
		System.out.println(x + ", " + y + ", " + r);
	}
}

	

 public class MainEntry {

	public static void main(String[] args) {
		Point pt = new Point(); // 객체 생성, 메모리에 할당, 생성자 함수 자동호출
		Circle cl = new Circle();
		cl.output();
//		System.out.println(pt.x + ", " + pt.y); // 접근지정자를 입력하면 이렇게 출력이 불가능 함
		pt.setX(10);
		pt.setY(5);
		pt.display();
//		System.out.println(pt.getX() + ", " + pt.getY());
		//int x = 9;
		// 함수 안의 로컬 변수는 초기화를 하지 않으면 사용할 수 없다.
		// 멤버변수는 접근지정자로 숨기로 get set은 멤버 함수로 설정
	}

} // class MainEntry end
