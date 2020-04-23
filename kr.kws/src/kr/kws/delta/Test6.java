package kr.kws.delta;

import java.util.Arrays;

public class Test6 {	//값이 랜덤이고 방에 나열해주는 것
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] rnd = new int[10];
		int tmp;
						
		for(int i=0; i<arr.length; i++) {
			do {
				tmp = (int) (Math.random() * 10);
			} while(rnd[tmp] !=0);
			arr[i] = tmp + 1;
			rnd[tmp] = 1;
		}
		System.out.println(Arrays.toString(arr));
	}
}
//1~10까지의 수를 10개의 배열에다가 저장