package kr.kws.bravo;

import java.util.Scanner;

public class Test5 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("별 개수를 입력하세요 >> ");
		int star = scan.nextInt();
		
		
		for(int i=0; i<star; i++) {
			for(int z=0; z<star-1-i; z++) {
				System.out.print(" ");		// z가 입력값의 -1-i 만큼 공백을 생성
			}
			for(int y=0; y<i*2+1; y++) {	// y가 i값의 2배+1만큼 *생성
					System.out.print("*");
			}
					System.out.println();
		}
	}
}

// 첫쨰줄 z가 4가 될때까지 공백을 생성 = 공백 4칸, 이후 y가 1이 될때까지 별을 생성 = 별 1칸
// 둘째줄 z가 3이 될떄까지 공백을 생성 = 공백 3칸, 이후 y가 3이 될떄까지 별을 생성 = 별 3칸
// 셋째줄 z가 2가 될때까지 공백을 생성 = 공백 2칸, 이후 y가 5가 될때까지 별을 생성 = 별 5칸
//
// ex 5줄이면  *은 1개 공백은 4개
	//4줄이면  *은 3개 공백은 3개
	//3줄	*은 5개 공백은 2개
	//2줄	*은 7개 공백은 1개

	
//입력이 0일때 *이 하나 나머지가 공백
//나머지가 공백

