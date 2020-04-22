package kr.kws.bravo;

import java.util.Scanner;

public class Test3 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("별 개수를 입력하세요 >> ");
		int star = scan.nextInt();
		
		for(int i=0; i<star; i++) {			//별 라인의 수
			for(int z=0; z<=i; z++) {		//라인 당 수
				System.out.print("*");		//를 별로 표현
			}
			System.out.println(" ");		//라인 줄바꿈
		}
	}
}
