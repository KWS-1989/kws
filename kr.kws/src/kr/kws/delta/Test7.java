package kr.kws.delta;

import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {	// 값은 순차적인 대신 랜덤 값이 주소 값
		int[] arr = new int[10];		
		int tmp;
		
		for(int i=1; i<= 10; i++) {
			do {
				 tmp = (int)(Math.random() * 10);
			} while(arr[tmp] != 0);
			arr[tmp] = i;
		}
		System.out.println(Arrays.toString(arr));
	}
}