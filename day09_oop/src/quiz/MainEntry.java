package quiz;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		Score s = new Score();
		s.setName();
		s.setKor();
		s.setEng();
		s.setCom();
		s.setTotal();
		s.setAverage();
		s.grade();
		s.output();
	}
}
