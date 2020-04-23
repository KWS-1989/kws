package kr.kws.delta;

import java.util.Random;

public class Test5 {
	public static void main(String[] args) {
		Random rand = new Random();		// Random안에 종자값을 넣으면 항상 같은 난수조합이 탄생
		System.out.println("= rand =");
		for(int i=0; i<5; i++)
			System.out.println(i + ":" + rand.nextInt());
	}

}
