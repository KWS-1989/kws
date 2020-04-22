package kr.kws.bravo;

import java.util.Arrays;

public class Test16 {
	public static void main(String[] args) {
		int[] num = {23, 42, 62, 74, 85, 48, 19, 88, 92, 71};
		int[] rd = new int[10];
		
		for(int i=0; i<num.length; i++) {
			for(int z=0; z<num.length; z++) {
				if(num[i] <= num[z]) {
				rd[i]++;
				}
			}
		}
		System.out.println("점수 : " + Arrays.toString(num));		// 배열을 스트링으로 출력하고 싶을 때
		System.out.println("석차 : " + Arrays.toString(rd));
	}
}
//석차
//내가 1등 : 나보다 잘하는 사람 0
//내가 5등 : 나보다 잘하는 사람 4명
//나보다 높은 수가 나오면 카운트가 늘어나며 석차가 나온다.
// 석차를 아래에 출력해서 비교