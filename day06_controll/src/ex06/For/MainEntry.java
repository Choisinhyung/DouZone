package ex06.For;

public class MainEntry {

	public static void main(String[] args) {
		// 이중(중첩) for문
		
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 3; j ++) {
				System.out.print(j);
			} // j end
			System.out.println();
		} //i end
		
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j < 10; j++)  {
				System.out.print(i + " X " + j + " = " + (i*j) + "\t");
			}
			System.out.println();
		}
		
		
		
	}

}
