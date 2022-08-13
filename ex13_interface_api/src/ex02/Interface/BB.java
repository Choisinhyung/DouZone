package ex02.Interface;

public class BB implements IDraw {

	@Override
	public void draw() {
		System.out.println("BB 클래스에서 인터페이스 IDraw의 메소드를 오버라이드함");
		System.out.println(su);
	}
	
	public void show() {
//		su = 3000; final 상수라서 값 변경 불가
		System.out.println();
	}

}
