//package ex01.lambda;
//
//interface Message {
//	int something(int x); // 미완성 함수
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(80);
//		System.out.println("Number is " + su);
//	}
//}
//
//public class LambdaMain2 {
//
//	public static void main(String[] args) {
//
//		Person p = new Person();
//		
//		p.greeting(new Message( ) {
//
//			@Override
//			public int something(int x) {
//				System.out.println("parameter value : " + x);
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
//		p.greeting((x) -> {
//			System.out.println("parameter value : " + x);
//			return x;
//		});
//	}
//
//}
