package ex08.string;

import java.awt.Point;

public class MainEntry {
   public static void main(String[] args) {
         int x = 9;
         String str = "abc";
         System.out.println("str : "+str);
         char ch = str.charAt(0);
         System.out.println(ch);
         System.out.println(str.charAt(2));
         
         char[] data = {'k', 'b', 's'};
         str = new String(data);
         System.out.println("str : "+str);
         
         String msg = "defghijklmn";
         System.out.println("korea " + msg);   //문자열 결합
         System.out.println(msg);
         
         String str2 = "abcdefghikjlm".substring(2);   //인덱스 2부터 끝까지 출력
         System.out.println(str2);
         
         str2 = "abcdefghikjlm".substring(2, 5);   //2부터 끝 인덱스갑 미포함(2~4까지)
         System.out.println(str2);
         System.out.println("***********************************");
         Point p1 = new Point();
         Point p2 = new Point();
         
         System.out.println("p1.hashCode(): " + p1.hashCode());
         System.out.println("p2.hashCode(): " + p2.hashCode());
         
         String s1 = new String("kosa");
         String s2 = new String("kosa");
         System.out.println("s1.hashCode(): " + s1.hashCode());
         System.out.println("s2.hashCode(): " + s2.hashCode());
         
         
         String s3 = "seoul";
         String s4 = "seoul";
         
         if(s3 == s4) System.out.println("same");
         else System.out.println("not same");
         System.out.println("-----------------------------");
         if(s1 == s2) System.out.println("same");
         else System.out.println("not same");
         
         String xx = "abc";
         String yy = "kbs";
         System.out.println(xx + ", " + yy);
         System.out.println(xx.hashCode() + ", " + yy.hashCode());
         yy = xx;
         System.out.println(xx.hashCode() + ", " + yy.hashCode());
         yy = "mbc";
         System.out.println(xx + ", " + yy);
         System.out.println(xx.hashCode() + ", " + yy.hashCode());
         xx = "korea";
         System.out.println(xx + ", " + yy);
         System.out.println(xx.hashCode() + ", " + yy.hashCode());
         String z = "korea";
         System.out.println(xx + ", " + yy + ", " + z);
         System.out.println(xx.hashCode() + ", " + yy.hashCode() + ", " + z.hashCode());
         
   }
}