package ex01.lambda;

interface Message {
	int something(); // 미완성 함수
}

class Person {
	public void greeting(Message msg) {
		int su = msg.something();
		System.out.println("Number is " + su);
	}
}

public class LambdaMain {

	public static void main(String[] args) {
		// Lambda Expression, JDK 1.8 이상
		Person p = new Person();
		p.greeting(new Message() {
			
			@Override
			public int something() {
				System.out.println("good morning");
				return 300;
			}
			
		});
		System.out.println("==============");
		
		//public int sum(int x, int y) { return x + y; }
		// ( x, y ) -> { x + y }
		
		p.greeting(() -> {
			System.out.println("good morning");
			return 50;
		});
	}

}
