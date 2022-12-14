package ex01.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx3 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		String from = "a";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
	    set.add("Car");
	    set.add("dZZZZZZ");
	    set.add("dzzzzz");
	    set.add("elephant");
	    set.add("elevator");
	    set.add("fan");
	    set.add("flower");
		
	    // 대문자 우선순위가 큼 + 오름차순
		 System.out.println(set);
         System.out.println("range search : from " + from + " to " + to);
         System.out.println("result : " + set.subSet(from, to)); // a, d
         System.out.println("result : " + set.subSet(from, to + "zzz")); // a, d

	}

}
