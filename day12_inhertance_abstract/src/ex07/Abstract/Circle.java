package ex07.Abstract;

public class Circle extends Shape {
	
	double r = 5.0;

	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.printf("원의 넓이 : %.3f 인 원을 그렸습니다. ",result);

	}

}
