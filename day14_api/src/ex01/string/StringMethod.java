package ex01.string;

public class StringMethod {
   public static void main(String[] args) {
      String s1 = "happydoyeon";
      String s2 = "SEOUL";
      System.out.println("s1 = " + s1 + ", s2 = " + s2);
      System.out.println(s1.concat(s2)); // 문자열 결합
      System.out.println(s1 + s2);
      System.out.println(s2.replace("EO", "korea")); // 문자열에서 EO를 찾아서 korea로 바꿔서 출력
      System.out.println("s1 = " + s1 + ", s2 = " + s2);

      String s3 = new String("      ab      cd        ");
      System.out.println("length = " + s3.length()); // 화이트 스페이스 포함해서 길이 출력
      s3 = s3.trim(); // 공백제거
      System.out.println("length = " + s3.length());
      System.out.println(s3);

      int[] arr = { 1, 2, 3, 4, 5 };
      for (int i = 0; i < arr.length; i++) {

      }

      String s4 = new String("asdfgdf adsgjddfkg q8946 7987946546");
      String[] s5 = s4.split(" ");   // 공백을 기준으로 문자열 분리
//      String s4 = new String("asdfgdf/adsgjddfkg/q8946/7987946546");
//      String[] s5 = s4.split("/");   // /를 기준으로 문자열 분리
      for (int i = 0; i < s5.length; i++) {
            System.out.println("분리된 "+i+"번쨰 문자열 : " + s5[i]);
      }
      
      String s6 = "123-3456-7890";
      s5 = s6.split("-");
      for (int i = 0; i < s5.length; i++) {
         System.out.println(s5[i]);
   }
      String s8 = "1234567890a      34566     77f88f8      string";
      char ch = s8.charAt(15);
      System.out.println(ch);
      System.out.println(s8.indexOf('f'));
      System.out.println(s8.lastIndexOf('f'));
      
      System.out.println(s1);
      System.out.println(s1.substring(3));   //3번부터 인덱스 끝까지 출력
      
      s8 = s8.substring(5, 7);   //시작값포함, 끝값 미포함
      System.out.println(s8);
      System.out.println(s1.substring(5, 7));

   }
}