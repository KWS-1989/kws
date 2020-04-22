package kr.kws.bravo;

import java.util.Arrays;

public class Test17 {
	public static void main(String [] args) {
		int[] num = {1,4,3,4,4,3,4,4,2,4,3,1,4,1,4,4,1,3,4,1,2,1};
		int[] ans = new int[4];
		
		for(int i=0; i<num.length; i++) {
			switch(num[i]) {
			case 1:
				ans[0]++;
				break;
			case 2: 
				ans[1]++;
				break;
			case 3:
				ans[2]++;
				break;
			case 4:
				ans[3]++;
				break;
			}
		}
		System.out.println("항목별 통계 : " + Arrays.toString(ans));
	}
}


/* 이런식으로 하는 것이 더 도움이 된다.
 * 
 * 
 * int[] ans = new int[4];
 * 
 * for(int i=0; i<num.length; i++) {
 * 		ans[num[i]-1]++;
 * }
 * 
 * for(int n=0; n<4; n++)
 * System.out.printf("%d : %d \n", n+1, ans[n]);
 */



//1은 몇개 나오고 2는 몇개나오는지 항목별 통계 구하기
//1:6개, 2:2개, 3:4개, 4:10