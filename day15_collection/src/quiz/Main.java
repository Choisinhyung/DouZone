package quiz;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Customer c = new Customer();
      Scanner sc = new Scanner(System.in);
      
      
      while(true) {
    	  System.out.println("**고객 관리 프로그램**");
    	  System.out.print("1. 고객 추가 2. 고객삭제 3. 고객 리스트 출력 4. 수정 5. 프로그램 종료 ");
    	  int input = sc.nextInt();
    	  // 고객 추가
	      if(input == 1) {
		   	  c.input();
	      }
	      // 고객 삭제
	      if(input == 2) {
	    	  c.delete();
	      }
	      // 고객 리스트 출력
	      if(input == 3) {
	    	  c.disp();
	      }
	      // 고객 정보 수정
	      if(input == 4) {
	    	  c.delete();
	      }
	      //프로그램 종료
	      if(input == 5) {
	    	  System.exit(0);
	    	  break;
      	}
      }
   }
}
