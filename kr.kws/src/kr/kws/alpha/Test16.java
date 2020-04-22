package kr.kws.alpha;

import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("원하는 숫자를 입력해주세요 >> ");
	
	int num1 = scan.nextInt();
	for(int i=1; i<=9; i++) {
		System.out.printf("%d * %d = %d\n", num1, i, num1 * i);
		}

	}

}

// 원하는 단은 입력으로 받을 것
// for문의 기본
// 