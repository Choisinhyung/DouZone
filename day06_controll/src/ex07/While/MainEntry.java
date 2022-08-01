package ex07.While;

public class MainEntry {

	public static void main(String[] args) {
		//while 반복문
		
		for(int i = 1; i <= 10; i++) { //초기값 조건식 증감식
			System.out.print(i + " ");
		}
		
		System.out.println("\nwhile ---------------------");
		
		int a = 1;
		int i = 1; //while문을 사용할 때에는 반드시 변수 초기화를 해야 함. 
		while(i <= 10) { // 조건식
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\ndo-while----------------");
		
		i = 1;
		
		do {			
			System.out.print(i + " ");
			System.out.print(a + " ");
			i++;  // 증감식
		} while ( i <= 10);

	}

}
