package ex2.collection.list;
import java.util.*; 
public class ArrayListLinkedListTest { 
      public static void main(String args[]) { 
            ArrayList al = new ArrayList(1000000);
            LinkedList ll = new LinkedList(); 
            System.out.println("순차적으로 추가"); 
            System.out.println("ArrayList :"+add1(al)); 
            System.out.println("LinkedList :"+add1(ll)); 

            System.out.println(); 
            System.out.println("중간 추가"); 
            System.out.println("ArrayList :"+add2(al)); 
            System.out.println("LinkedList :"+add2(ll)); 

            System.out.println(); 
            System.out.println("중간 삭제"); 
            System.out.println("ArrayList :"+remove2(al)); 
            System.out.println("LinkedList :"+remove2(ll)); 

            System.out.println(); 
            System.out.println("순차적 삭제"); 
            System.out.println("ArrayList :"+remove1(al)); 
            System.out.println("LinkedList :"+remove1(ll)); 
      } 

      public static long add1(List list) {
    	  // 순차적으로 추가하기
            long start = System.currentTimeMillis();

            for(int i=0; i<100000;i++) // 작업
				list.add(i+""); 

            long end = System.currentTimeMillis(); 
            return end - start; 
      }

      public static long add2(List list) { 
    	  // 중간에 데이터 추가
            long start = System.currentTimeMillis(); 
            for(int i=0; i<1000;i++) // 중간
				list.add(500, "X");
            long end = System.currentTimeMillis(); 
            return end - start; 
      } 

      public static long remove1(List list) { 
    	  // 중간 데이터 삭제
            long start = System.currentTimeMillis(); 
            for(int i=list.size()-1; i > 0;i--) // 끝에서부터 역순으로
				list.remove(i); 
            long end = System.currentTimeMillis(); 
            return end - start; 
      } 

      public static long remove2(List list) { 
    	  // 순차적 데이터 삭제
            long start = System.currentTimeMillis(); 
            for(int i=0; i<1000;i++) 
				list.remove(i); 
            long end = System.currentTimeMillis(); 
            return end - start; 
      } 
} 