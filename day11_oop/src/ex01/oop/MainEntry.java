package ex01.oop;
// import java.lang.*; // 자동 임포트

class Circle {
	int x, y; // 접근지정자 생략시 자바는 default
}


public class MainEntry extends Object{ //

	public static void main(String[] args) {
		Point pt = new Point(); // new하는 순간 힙영역에 저장됨 , 객체생성, 메모리 할당, 생성자함수 자동 호출
		pt.setX(100);
		pt.setY(50);
//		System.out.println(pt.getX() + ", " + pt.getY());
		pt.setData(2, 5);
		pt.display();
		pt.setData(2, 10);
		pt.display();
		
		Circle c = new Circle();
		c.x = 3; // 이런식으로 함부로 접근해서 값을 변경하면 안된다
		c.y = 5;
		System.out.println(c.x + ", " + c.y);

	}

}

class Point { // 접근지정자
	// private 본인 클래스에서만 사용가능하기 때문에 메인클래스에서 pt.으로 함수를 호출했을 때 불가능하다. 
	private int x, y; // private < default(같은 패키지 모두 공유) < protected < public
	
	public void setData(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int xx) {
		this.x = xx;
	}

	public int getY() {
		return y;
	}

	public void setY(int yy) {
		this.y = yy;
	}
	
	public void display() {
		System.out.println(getX() + ", " + getY());
	}
	
}
