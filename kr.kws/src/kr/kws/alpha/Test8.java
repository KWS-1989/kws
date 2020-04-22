package kr.kws.alpha;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >> ");
		
		int num = scan.nextInt();
		String key = " ";
		
		if (num > 0) {
		key = "양수";	
		} else {
			key = "음수";
		}
			
		System.out.printf("%d는 %s 입니다. \n", num, key);
		}
		
}
