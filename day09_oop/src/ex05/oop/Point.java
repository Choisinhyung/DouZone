package ex05.oop;

public class Point {
	private int x, y; //멤버변수
	
	//멤버함수
	public void setX(int xx) {
		this.x = xx;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int yy) {
		this.y = yy;
	}
	
	public int getY() {
		return y;
	}
	
	//output
	public void display() {
		System.out.println(x + ", " + y);
	}
	

}
