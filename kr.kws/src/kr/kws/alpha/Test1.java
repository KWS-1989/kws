package kr.kws.alpha;

import java.util.Scanner;

public class Test1 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("이름을 입력하세요 >> ");
		String name = scan.nextLine();
		
		System.out.print("출생년도를 입력하세요 >> ");
		int age = scan.nextInt();
		
		
		
		System.out.printf("\n%s님의 나이는 %d살 입니다.\n", name, 2020 - age);
		
		
	}

}
