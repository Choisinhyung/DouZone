//package ex01.lambda;
//
//interface Message {
//	int something(int x, int y); // 미완성 함수
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(80, 70);
//		System.out.println("Number is " + su);
//	}
//}
//
//public class LambdaMain3 {
//
//	public static void main(String[] args) {
//
//		Person p = new Person();
//		
//		p.greeting(new Message( ) {
//
//			@Override
//			public int something(int x, int y) {
//				System.out.println("parameter value : " + x + ", " + y);
//				return 100;
//			}
//			
//		});
//
//		System.out.println("==============");
//		
//		//public int sum(int x, int y) { return x + y; }
//		// ( x, y ) -> { x + y }
//		
//		p.greeting((x, y) -> {
//			System.out.println("parameter value : " + (x + y));
//			return x+y;
//		});
//	}
//
//}
