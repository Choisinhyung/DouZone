package ex02.array;

public class MainEntry {

	public static void main(String[] args) {
		// 2차원 배열[행][열]
		
//		int[][] a = new int[2][3];
//		int[][] a = new int[][] { {1, 2, 3}, {4, 5, 6}}; //2행 3열
		int[][] a = { {1, 2, 3, 55, 8, 100, 44}, {4, 5, 6, 8, 77}}; //초기화로 행,열이 구분된다.
		
		//2차원 배열에서 행의 길이 구하기
		System.out.println("행 길이 = " + a.length);
		System.out.println("duf 길이 = " + a[0].length); //행길이.length;
		System.out.println("duf 길이 = " + a[1].length);
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
			}
		}
			
	}

}


/* package ex02.array;

public class MainEntry {

	public static void main(String[] args) {
		// 2차원 배열[행][열]
		
//		int[][] a = new int[2][3];
//		int[][] a = new int[][] { {1, 2, 3}, {4, 5, 6}}; //2행 3열
		int[][] a = { {1, 2, 3}, {4, 5, 6}}; //초기화로 행,열이 구분된다.
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
			}
		}
			
	}

} */
