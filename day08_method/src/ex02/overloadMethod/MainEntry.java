package ex02.overloadMethod;

public class MainEntry {

	public static int plus(int x, int y, int z ) {
		int hap = x + y + z;
		return hap; // x+y;
	}
	
	public static int plus(int x, int y, int z, int a) {
		int hap = x + y + z + a;
		return hap; // x+y;
	}
	
	
	public static void main(String[] args) {
		System.out.println(plus(3, 5, 7));
		

	}

}
