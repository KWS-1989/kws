package kr.kws.alpha;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.print("x = ");
		int num = scan.nextInt();
		boolean answer = ((num%2==0 || num%3==0) && num%6!=0);
		
		System.out.printf("%b", answer);
		
	}

}

// x가 2의 배수 또는 3의 배수이지만 6의 배수가 아니면 true