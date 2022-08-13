package ex07.Abstract;

//abstract class, Super class
public abstract class Shape {
	double result = 0;
	public abstract double calc(); // 추상메소드
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape");
	}
}
