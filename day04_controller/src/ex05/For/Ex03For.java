package ex05.For;

public class Ex03For {

	public static void main(String[] args) {
		
		int sum, count;
		sum = count = 0;  // 누적변수는 초기화하는 것이 좋다
		// 1 ~ 100까지 중 홀수를 구하세요
		
		for(int i = 0; i < 100; i++) {
			if(i % 10 == 0) System.out.println();
			if(i % 2 == 0) System.out.print(i + 1 + " ");
		} //for end
		System.out.println();
		// 1 ~ 100까지 중에서 7의 배수의 합과 개수를 구하는 프로그램
		for(int i = 1; i < 101; i++) {
			if(i % 7 == 0 ) {
				sum += i;
				count++;
			}
		} // end for
			System.out.println("1~ 100까지 중에서 7의 배수의 합과 개수 : " + sum + ", " + count);
	}

}
