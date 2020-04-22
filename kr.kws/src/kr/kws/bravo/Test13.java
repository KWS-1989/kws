package kr.kws.bravo;

public class Test13 {
	public static void main(String[] args) {
		int[] num = {23, 42, 62, 74, 85, 48, 19, 88, 92, 71};
		int sum = 0;
				
		for(int i=0; i<num.length; i++) {
			sum += num[i];
			}
		System.out.printf("합계 = %d, 평균 = %4.1f", sum, (float)sum / num.length);
	}
}
//저장된 값의 합계와 평균 구하기