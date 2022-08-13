package ex01.inhertance;

public class Point {
	protected int x, y;
	
	public Point() {
		x = y = 100;
		System.out.println("Point Super class call~~~");
		
		//슈포ㅓ는 디폴ㅌ츠 생성자 호출
		
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("포인트 클래스 매개변수 2");
	}
	
	public Point(int x) {
		super();
		this.x = x;
		System.out.println("포인트 클래스 매개변수 1");
	}
	
	public void disp() {
		System.out.println(x + ", " + y + "\t");
	}
}
