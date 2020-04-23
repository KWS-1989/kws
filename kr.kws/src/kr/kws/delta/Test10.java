package kr.kws.delta;

import java.util.regex.Pattern;

public class Test10 {
	public static void main(String [] args) {
	String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};
	String p = "c[a-z]*";
	
	for(int i=0; i<data.length; i++) {
		if(Pattern.matches(p, data[i]))
			System.out.print(data[i] + ",");
	}
	}
}