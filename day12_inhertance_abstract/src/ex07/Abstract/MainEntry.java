package ex07.Abstract;

public class MainEntry {

	public static void main(String[] args) {
		//1. 각자의 클래스로 객체 생성한 형태
		
		Circle c = new Circle(); // 1.번째 방법
		c.draw();  
		
//2.번째 방법		new Circle().draw();
		
		new Rectangle().draw();
		new Triangle().draw();

	}

}
