package ex04.arrayMethod;

public class MainEntry {

	public static void main(String[] args) {
	
		int x = 3, y = 5;
		
		int result = methodEx(x, y);
		System.out.println(result);
		
		int[] arrResult = methodEx2();
		for(int i = 0; i < arrResult.length; i++) {
			System.out.print(arrResult[i] + " ");
		}
		System.out.println();
		
		for(int item : arrResult) {
			System.out.print(item + " ");
		}
		
		System.out.println();
	
		//2차원 배열 함수 만들기
		
		int sum = 0;
		int[][] arrayResult = methodEx3();
		for(int i = 0; i < arrayResult.length; i++) {
			for(int j = 0; j < arrayResult[i].length; j++) {
				sum += arrayResult[i][j];
			}
		}
		System.out.println(sum);

	}
	

	private static int methodEx(int x, int y) {
		return x + y;
	}
	
	
	private static int[] methodEx2() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		return arr;
	}
	
	private static int[][] methodEx3() {
		int[][] arr2 = {{1, 2, 3, 4}, {1, 2, 3}};
		return arr2;
	}
	
}
	
