package ex02.oop;

import ex02.oop.Point;

public class MainEntry {

	public static void main(String[] args) {
		Point pt = new Point();
		
		pt.display();
		pt.setX(20); 
		pt.setY(30); 
		pt.display();
		System.out.println("-------------");
		
		
		Circle c = new Circle();
		c.setR(5);
		c.setX(100);
		c.setY(150);
		c.display();
		System.out.println("-------------");
		
		// 객체 생성 출력
		Rectangle re = new Rectangle();
		re.setX(1);
		re.setY(2);
		re.setX2(3);
		re.setY2(4);
		re.display();
	}

}
