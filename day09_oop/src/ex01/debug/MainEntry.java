package ex01.debug;

public class MainEntry {

	public static void main(String[] args) {
		//디버깅_F5
		
		int x = 5, y = 0;
		int i ;
		
		for(i = 0; i < 6; i++) {
			y += x * i;
		}
		
		for(i = 1; i < 100; i++) {
			if(i == 30) break;
			System.out.print(i + " ");
		}
		System.out.println("\n" + x + ", " + y + ", " + i);
	}

}
