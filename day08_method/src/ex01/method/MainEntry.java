package ex01.method;

public class MainEntry {
	// 메서드 : 메인메서드의 부담을 덜어주고 반복적인 코드를 함수로 만들어서 호출해서 사용
	// instance메서드 : 객체를 생성하고 사용해야 함 ( 메모리상에 할당이 되어야 하기 때문에 )
	// static메서드 : 객체 생성 없이 바로 사용 가능 (이태리체~) / class명.메서드명
	
	// 매개변수(Parameter) 유무, retuen타입 유무
	// 1) 매개변수가 없고, 리턴타입도 없는 경우 : line(), display()
	// 2) 매개변수가 있고, 리턴타입은 없는 겨웅 : showName()
	// 3) 매개변수가 없고, 리턴타입은 있는 경우
	// 4) 매개변수가 있고, 티천타입도 있는 경우
	
	//return 값; // 오직 1개 ex, int x = 3, y = 5; return x + y;   // return x,y -> error
	// 연산된 결과는 리턴시킬수없지만 변수 여러 개를 리턴 시킬수는 없다. 
	
	//return; 만 하는경우 : 제어권을 넘기는 것 (호출한곳으로 리턴~)
	
	public static void line() {
		System.out.println("====================");
	}

	public static void showName(String name, int age) {
		System.out.println("당신의 이름은 " + name + "입니까?");
		System.out.println("나이는 " + age + "살 입니다.");
	}
	
	public static void display() { //함수정의부
		System.out.println("Happy Sinhyung");
	}
	
	public static void main(String[] args) {
		line();
		showName("최신형", 29);
		line();
		System.out.println("Main Start!");
		line();
		display(); //함수 호출
		line();
		System.out.println("Main End!");
		line();

	}

}
