package ex03.randomClass;

import java.util.Random;
/*
 * random class
 */



public class MainEntry {

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println(rand.nextInt(5)); // 0 ~ 4까지 랜덤 출력
		System.out.println(rand.nextDouble()); // 
		System.out.println(rand.nextBoolean());

		System.out.println(rand.nextInt(10) + 1); // 1 ~ 10까지 랜덤 출력
		
		for(int i = 0; i < 11; i++) {
			System.out.print(rand.nextInt(10) + 1 + " ");
		}
	}

}
