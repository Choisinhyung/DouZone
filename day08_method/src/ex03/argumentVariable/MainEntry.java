package ex03.argumentVariable;

public class MainEntry {

	//가변길이 매개변수
	
	public static void plus(int x, int y) {
		int hap = x + y;
		System.out.println(hap);
	}
	
	public static void plus(int x, int y, int z) {
		int hap = x + y + z;
		System.out.println(hap);
	}
	
	public static void plus(int ...x ) {
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
	}

}
