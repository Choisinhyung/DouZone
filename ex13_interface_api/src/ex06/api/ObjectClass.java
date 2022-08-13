package ex06.api;

class Point {
   
}

public class ObjectClass {
   public static void main(String[] args) {
      Point pt = new Point();
      System.out.println("Point pt information");
      System.out.println("class name : " + pt.getClass());
      System.out.println("hash code : " + pt.hashCode()); //2104457164
      System.out.println("Object String: " + pt.toString()); //7d6f77cc
      System.out.println("Object String: " + pt);
      System.out.printf("10진수  %d\n" , 0x7d6f77cc );
      System.out.println("=======================================");
      
      Point pt2 = new Point();
      System.out.println("Point pt information");
      System.out.println("class name : " + pt2.getClass());
      System.out.println("hash code : " + pt2.hashCode()); //627185331
      System.out.println("Object String: " + pt2.toString()); //256216b3
      System.out.println("Object String: " + pt2);
      
      System.out.println("pt2.toString() :  toString()의 의미");
      System.out.println(pt2.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode()));

      Point pt3 = new Point();
      
   
   
   
   }
}