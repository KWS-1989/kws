package kr.kws.bravo;

public class Test8 {
	public static void main(String [] args) {
		int sum = 0;
		int z = 0;
		for(int i=1; i<=1000; i+=100) {
			for(z=i; z<i+100; z++) {
				sum += z;
							}
			System.out.printf("1부터 %d까지의 합은\t %d\n", z-1, sum);
		}
	}
}


//1부터 1000까지의 합 출력
// 100단위마다 중간 합을 출력
//ex 1부터 100까지의 합은 5050
//ex 표현은 1지만 사실상 101부터 200