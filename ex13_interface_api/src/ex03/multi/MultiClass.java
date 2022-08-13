package ex03.multi;

import ex02.Interface.IDraw;
import ex08.Abstract.Shape;

public class MultiClass 
			extends Shape implements IDraw, Test {
	
	String irum = "이순신";


	@Override
	public void draw() { // IDraw interface
		System.out.println("IDraw interface Method");

	}

	@Override
	public double calc(double x) { // Shape abstract class
		System.out.println("Shape abstract class Method");
		return x;
	}
	
	@Override
	public void tshow(String name) { //Test interface
		System.out.println("Test interface Method");
		
	}

	@Override
	public void show(String name) { // shape abstract class
		System.out.println("shape abstract Method");
		System.out.println(name + "hi!!!");
		
	}

}
