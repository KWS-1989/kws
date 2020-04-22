package kr.kws.alpha;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >> ");
		
		int num = scan.nextInt();
		
		if ((num >= 10  && num <= 25) || num >= 60) {
			System.out.println (num);
		} 	
		
		
		
	}

}

// 숫자를 입력받아 10에서 25사이의 수이거나 60이상일 때만 출력
