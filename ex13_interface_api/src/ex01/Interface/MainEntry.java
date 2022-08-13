package ex01.Interface;

interface A{
   int x = 9;   // interface멤버는 abstract method, final member만 가질 수 있다
   static final int y = 7777;
   
   public void show();
   public abstract void disp();
   public int plus(int x, int y);
}
interface B{
   void view();
}
interface C{
   String name = "happy";
   public void draw();
}
interface D extends B{   //interface간에 상속에서도 extends키워드 사용
   void dview();
}

class Rect implements C{

   @Override
   public void draw() {
      System.out.println(name + "님 반갑습니다");
   }
}

class Shape{
   
}
class Multi extends Shape implements B, C, A{

   @Override
   public void show() {
      System.out.println("show call");
      
   }

   @Override
   public void disp() {
      System.out.println("disp call");
      
   }

   @Override
   public int plus(int x, int y) {
      System.out.println("plus call");
      return x + y;
   }

   @Override
   public void draw() {
      System.out.println("draw call");
      
   }

   @Override
   public void view() {
      System.out.println("view call");
      
   }
   
}

public class MainEntry {

   public static void main(String[] args) {
      Rect r = new Rect();
      r.draw();
      C rr = new Rect();
      rr.draw();
      System.out.println("*************************");
      Multi m = new Multi();
      m.view();
      A a = new Multi();
   }

}
