package ex07.Abstract;

public class Triangle extends Shape {

	int h = 10;
	int w = 20;
	
	@Override
	public double calc() {
		result = (h * w) / 2;
		return 0;
	}

	@Override
	public void draw() {
		calc();
		System.out.printf("삼각형의 넓이 : %.3f 인 삼각형을 그렸습니다. ",result);


	}

}
