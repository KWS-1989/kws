package kr.kws.bravo;

import java.util.Scanner;

public class Test4 {
		public static void main(String [] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("별 개수를 입력하세요 >> ");
			int star = scan.nextInt();
			
			for(int i=star; i>0; i--) {
				for(int z=1; z<=i; z++) {
				System.out.print("*");		//를 별로 표현
				}
			System.out.println(""); }
		}
}

