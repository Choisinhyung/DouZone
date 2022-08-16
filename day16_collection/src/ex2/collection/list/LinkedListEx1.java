package ex2.collection.list;
import java.util.*;
class  LinkedListEx1{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		
		//위치 지정이 가능하다~
		list.addFirst("a"); //처음에 넣기
		list.addLast("z"); //마지막에 넣기
		
		System.out.println(list);
		//요소로 지우기
		list.remove("k");
		System.out.println(list);
		//인덱스 번호로 지우기
		list.remove(2);
		System.out.println(list);
		//첫 번째 지우기
		list.removeFirst();
		System.out.println(list);
		//마지막 지우기
		list.removeLast();
		System.out.println(list);
		//두번째 위치에 있는 값을 a로 변경
		list.set(2,"a");
		System.out.println(list);
		//3번째 위치에 있는 값을 첫번째 값 + change 로 바꾸기
		list.set(3,list.get(1)+"change");
		System.out.println(list);
		//peek : 첫 번째 값 꺼내오기, list에 데이터가 남아있다.
		String str1 = (String)list.peek();
		
		System.out.println("=====================");
		
		System.out.println(str1);
		System.out.println(list);
		System.out.println("=====================");
		// poll : 데이터 반환과 동시에 list에 있는 공간 제거
		String str2 = (String)list.poll();
		System.out.println(str2);
		System.out.println(list);
		System.out.println("=====================");
		// 데이터 넣기 (무조건 데이터를 끝에 넣는다)
		list.offer("a");
		System.out.println(list);
		System.out.println("=====================");

		String str3 = (String)list.remove();
		System.out.println(str3);
		System.out.println(list);
	}
}
