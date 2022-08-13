package ex06.Abstract;

abstract class Shape { // 추상클래스는 일반메서드와 추상메소드를 둘 다 가질 수 있다.
	// 객체 생성 할 수 없음
	double result = 0;
	public abstract double calc(); // 추상메소드
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape");
	}
	
}

class Circle extends Shape {
	// shape클래스가 추상 클래스라 (미완성)
	// 오버라이드해서 재정의해서 사용해야한다. 

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	} 
	
}

class Point {
	
}

class Rect extends Point {
	
}

public class MainEntry {

	public static void main(String[] args) {
//		Shape s = new Shape(); // 자체적으로 객체 생성 불가능 _ 추상 클래스
		Shape s = new Circle(); // 상속 받은 자손 클래스로는 객체 생성 할 수 있다.

	}

}
