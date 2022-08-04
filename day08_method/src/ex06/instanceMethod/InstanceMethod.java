package ex06.instanceMethod;
// 객체를 생성하고 사용해야한다. (메모리상에 할당이 되어야 함)


class B {
	int x, y;
	
	public static void setData(int xx, int yy) {
		System.out.println(xx + " " + yy);
	}
} // B class end






public class InstanceMethod {
//	B.setData();  불가능!!! static 키워드 안적었음~ 메모리할당x
	
	public static void main(String[] args) {
		// b는 인스턴스 or object
		B b = new B();//객체 생성, 메모리에 할당, 생성자함수 자동호출
		b.setData(100, 200);
	}
	
}
