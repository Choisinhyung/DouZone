package ex8.DoWhile;

public class MainEntry {

	public static void main(String[] args) {
		
		int a = 1, b = 1;
		
		//다중 do while문의 경우 안쪽 변수의 초기화가 반드시 이루어져야 한다.
		
		do {
			b = 1; //1번 여기서 초기화를 하거나
			do {
				System.out.print(b + "\t");
				b++; //증감식
			} while (b <= 3); //문장 종결기호
//			b = 1;	//2번 여기서 초기화를 하거나~
			System.out.println();
				a++;
		} while (a <= 2); //조건

	}

}
