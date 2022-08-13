package ex08.Abstract;

public abstract class Shape {
	
	protected double result = 0;
	public abstract double calc(double x); // abstract 메소드
	public abstract void show(String name);
	
	public void viwe() {
		System.out.println("super class Shape입니다. ");
	}
}
