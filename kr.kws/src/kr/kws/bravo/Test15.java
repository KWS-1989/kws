package kr.kws.bravo;

public class Test15 {
	public static void main(String[] args) {
		int[] num = {23, 42, 62, 74, 85, 48, 19, 88, 92, 71};
		
		for(int i=0; i<num.length-1; i++) {
			for(int z=0; z<num.length-i-1; z++) {	// 완료된 순차 배열은 맨 뒤로 가서 건들지 않게 됨
				if (num[z] > num[z+1]) {
					int temp = num[z];
					num[z] = num[z+1];
					num[z+1] = temp;
			}
		}
			System.out.printf("%d, ", num[i]);
		}
	}
}


// 필요 규칙 1.배열 정렬 마다 뒷자리가 고정되면서 건들면 안됨
// 2. 1,2열 -> 2,3열 등 순차적으로 서로 비교하면서 적은 값과 자리를 뒤바꿈 
// 3. 뒤바꾸는 과정엔 비우고 덮어씌우는 게 필요