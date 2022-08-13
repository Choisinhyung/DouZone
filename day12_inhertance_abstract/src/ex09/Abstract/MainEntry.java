package ex09.Abstract;

public class MainEntry {

	public static void main(String[] args) {
		
		Trans[] t = new Trans[4];
		
		t[0] = new Subway();
		t[1] = new Bus();
		t[2] = new Bicycle();
		t[3] = new Plain();
		
		String[] name = {"Subway", "Bus", "Bicycle", "Plain"};
		
		
		for(int i = 0; i < t.length; i++) {
			t[i].start(name[i]);
			t[i].stop(name[i]);
		}

	}
}
