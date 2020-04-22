package kr.kws.bravo;

public class Test1 {
	public static void main(String [] args) {
		
		int count = 0;
		for(int i=1; i<=100; i++) {			// 1부터 100까지
			if (i%2==0 || i%3==0) {			// 그 중 2의 배수, 3의 배수 OR
				count++;					// 배수 나올수록 카운트 추가
				System.out.println(i);
				}
		}
		System.out.printf("갯수는 %d 개", count);
	}
}
			

				

//1부터 100사이의 수 중에서 2의 배수나 3의 배수를 모두 출력하고 그 개수도 출력하기 (마지막에 갯수 출력

