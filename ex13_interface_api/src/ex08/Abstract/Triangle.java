package ex08.Abstract;

public class Triangle extends Shape {
	
	int w = 100; // 너비

	@Override
	public double calc(double x) {
		result = (w * x) / 2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(9.0);
		System.out.println(result + " 크기의 " + name + "이 그려졌습니다. ");
		
	}

}
