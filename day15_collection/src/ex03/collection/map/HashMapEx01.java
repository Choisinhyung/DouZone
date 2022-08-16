package ex03.collection.map;

import java.util.HashMap;
import java.util.Scanner;

// key / value 한 쌍으로 처리 ( set + list )
public class HashMapEx01 {
	   public static void main(String[] args) {
	      HashMap hm = new HashMap();
	      hm.put("kosa","1234");
	      hm.put("kosa","1111");
	      hm.put("tlsgud","tlsgud123");
	      
	      Scanner sc = new Scanner(System.in);
	      while(true)
	      {
	         System.out.println("id와 password를 입력해주세요.");
	         
	         System.out.print("id : ");
	         String id = sc.nextLine().trim();
	         System.out.print("pw : ");
	         String password = sc.nextLine().trim();
	         System.out.println();
	         
	         if(!hm.containsKey(id)) {
	            System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
	            continue; // 하위 조건문으로 진행
	            
	         }else {
	            if(!hm.get(id).equals(password))
	            {
	               System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세여");
	            }else
	            {
	               System.out.println("id와 password가 일치합니다.");
	            }
	         }
	         
	      }
	      
	   }
	}