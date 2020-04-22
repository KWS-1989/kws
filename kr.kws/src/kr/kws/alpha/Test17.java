package kr.kws.alpha;

import java.util.Scanner;

public class Test17 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("원하는 값을 입력해주세요 >> ");
	int num = scan.nextInt();
	int f = 1;			// 0으로 하면 0*가 반복되므로 0만 나옴
	
	for (int i=1; i<=num; i++) 
		f *= i;
	System.out.printf("%d! = %d\n", num, f);
	}
}

// n! 구하기 (팩토리얼)
// ex) 4! = 2 x 3 x 4의 값
