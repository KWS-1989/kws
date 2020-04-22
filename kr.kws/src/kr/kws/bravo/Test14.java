package kr.kws.bravo;

public class Test14 {
	public static void main(String[] args) {
		int[] num = {23, 42, 62, 74, 85, 48, 19, 88, 92, 71};
		int max= num[0], min = num[0];
						
		for(int i=0; i<num.length; i++) {
			if(max<num[i]) 
				max = num[i];			
			if(min>num[i]) 
				min = num[i];			
		}
		System.out.printf("최대값 : %d, 최소값 : %d", max, min);
	}
}

// 최대값과 최소값


