package quiz;

import java.util.Scanner;

public class TV {

	private String color;
	private int channel = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public String getColor() {
		return color;
	}
	
	public void setColor() {
		System.out.println("원하는 tv색상을 입력해주세요");
		color = sc.nextLine();
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel() {
		System.out.println("원하는 tv채널을 입력해주세요");
		channel = sc.nextInt();
		
	}
	
	public void setChannel2() {
		System.out.println("현재 채널은 " + channel + "입니다. 채널을 변경하시겠습니까? (1.올림, 0.내림)");
		int up = sc.nextInt();
		if(up == 1) {
			channel += 1;		
			System.out.println("채널을 올렸습니다.");
		} else if (up == 0) {
			channel -= 1;
			System.out.println("채널을 내렸습니다.");
		}
	}
	
	public void output() {
		System.out.print("현재 tv색상은 " + color + "이며, ");
		System.out.println("현재 채널은 " + channel + "입니다. ");
		
	}
}
