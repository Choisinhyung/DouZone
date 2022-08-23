//package ex01.lambda;
//// 타입을 써야할 상황이 있다
//interface Message{
//   void something(int x, int y);   // parameter
//   //void good(int x);
//}
//
//interface Talk {
//   void something(String x, String y);      // functional interface - 1개의 메소드
//}
//
//class Person{
//   public void greeting(Message msg) {
//      msg.something(3, 5);
//   }
//   public void greeting(Talk msg) {
//      msg.something("Hello", "World");
//   }
//}
//
//public class LambdaMain4 {
//   public static void main(String[] args) {
//      //Lambda Expression, JDK 1.8 이상
//      Person p = new Person();
//      p.greeting(new Message() {
//         
//         @Override
//         public void something(int x, int y) {      // 익명(무명) 클래스
//            System.out.println("parameter value : " + x + ", " + y);
//         }
//         
//      });
//      System.out.println("------------------------------------------");
//      char ch = 'A';
//      // 람다식으로 변경
////      public int sum(int x, int y) {return x+y}
////      (x,y) -> {x + y}
//      //p.greeting((x, y) -> {   // 에러발생, 타입에 대해 애매해서 타입을 정확히 써줘야함
//      p.greeting((int x, int y) -> {   // 에러발생, 타입에 대해 애매해서 타입을 정확히 써줘야함   
//         System.out.println("parameter value : " + x + ", " + y);
//         System.out.println(ch);
//         // ch = 'B';      // 에러발생, 람다에서는 타입 변경 안됨
//      });
//      p.greeting((String x, String y) -> {   
//         System.out.println("parameter value : " + x + ", " + y);
//         num = 2222;      // static 변수값은 람다에서 변경 가능
//         System.out.println(num);
//      });
//   }
//   
//   static int num = 30;
//   
//}