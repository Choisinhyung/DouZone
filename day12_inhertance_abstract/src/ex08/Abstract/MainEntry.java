package ex08.Abstract;

public class MainEntry {

	public static void main(String[] args) {
		
		// 배열 이용한 형태
		Shape[] s = new Shape[3]; //배열 생성 및 선언
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		String[] name = {"Circle", "Rectangle", "Triangle"};
		
		for(int i = 0; i < s.length; i++) {
			s[i].show(name[i]);
		}
		
		System.out.println("---------------");
		// 2. shape 부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("Circle");
		
		sh = new Rectangle();
		sh.show("Rectangle");
		
		sh = new Triangle();
		sh.show("Triangle");
		
		System.out.println("---------------");
		
		//1. 각자의 클래스로 객체 생성한 형태
		new Circle().show("원");
		
		Rectangle r = new Rectangle();
		r.show("Rectangle");
		
		Triangle t = new Triangle();
		t.show("Triangle");
		

	}

}
