package kr.kws.bravo;

public class Test {

	public static void main(String [] args) {
		int[] num = {1,4,3,4,4,3,4,4,2,4,3,2,2,3,1,4,1,3,2,1};
		int[] ans = new int[5];
		
		for(int i=0; i<num.length; i++) {		// num 0번줄부터 끝줄까지 증감
			ans[num[i]]++;			// num 증감 중 ans배열에서 해당되는 수가 있으면 해당 배열이 증감하게
		}
		
		for(int i=1; i<ans.length; i++) {		// ans 배열을 증감시키는데 0번이 아닌 1번부터
			System.out.printf("%d의  총합은  %d개\n", i, ans[i]);	// 결과적으로 1번부터 총합을 계산
		}
	}
}
		
			
////////항목별 통계 구하기
/* 0. 정답 : 1 = 4, 2 = 4, 3 = 5, 4 = 7 총합 = 20
 * 1. num 안에 있는걸 나열
 * 2. 0~3 ans에서 이것을 판별
 * 3. 그것을 프린트로 출력
 */
