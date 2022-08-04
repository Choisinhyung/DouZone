package ex05.staticMethod;
	//객체 생성을 하지 않아도 바로 사용이 가능함
	//object.methodName();
	//ClassName.methodName();


class A {
	int x, y;
	
	//static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + " " + yy);
	}
} //A class end


public class StaticMethod {

	public static void main(String[] args) {
		A obj = new A(); // 객체 생성, 메모리에 할당, 생성자함수 자동 호출
		obj.x = 9;
		System.out.println(obj.x);
		obj.setData(5, 7); // object.methodName();
		
		A.setData(50, 70); //ClassName.methodName();
	}
	
}
