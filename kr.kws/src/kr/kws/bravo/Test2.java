package kr.kws.bravo;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("약수를 구할 숫자를 입력하세요 >> ");
		int num = scan.nextInt();
		int count = 0;

		for(int i=1; i<=num; i++) {				// 입력 받은 숫자 까지 i가 증감
			if(num%i==0) {						// 입력받은 숫자에서 i를 나눌 때 나머지가 남는 수만
				count++;						// 카운트
				System.out.printf(" %d \n", i); // 남는 수 출력
			}
		}
		System.out.printf("%d의 약수의 개수는 %d개 입니다.", num, count);
	}
}

// 입력받은 숫자 n의 약수 구하기
// 약수 : 나누어 졌을 때 딱 떨어지는 수
