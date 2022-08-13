package ex06.inhertance;
// 생성자 함수는 상속이 안된다..!

class Point { //super class
	protected int x, y; // 보호모드 - 상속받은 자손은 접근가능
	
	public Point() {
		System.out.println("Point default constructor!");
	}

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
	
	public void disp() {
		System.out.println(x + ", " + y);
	}
	
	
}

class Circle extends Point{ // sub class
	private int r;
	
	public Circle() {
		System.out.println("Circle default constructor");
	}
	
	public void disp() {
		System.out.println(x + ", " + y + ", " + r);
	}
	
}
public class MainEntry {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.disp();

	}

}
