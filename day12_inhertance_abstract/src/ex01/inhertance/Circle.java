package ex01.inhertance;

public class Circle extends Point {
	private int r; // 반지름
	
	public Circle() {
		r = 5;
		System.out.println("Circle Sub class call!!!");
	}

	public Circle(int r) {
		super();
		this.r = r;
		System.out.println("써클 클래스 매개변수 1");
	}

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
		System.out.println("써클 클래스 매개변수 3");
	}

	public Circle(int x, int r) {
		super(x);
		this.r = r;
		System.out.println("써클 클래스 매개변수 2");
	}
	
	public void disp() {
		System.out.println(x + ", " + y + ", " + r);
	}
	
	
	
}
