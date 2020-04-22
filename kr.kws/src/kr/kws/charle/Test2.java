package kr.kws.charle;

public class Test2 {
	public static void main(String[] args) {
		int[][] arr = new int [5][5];
		int num = 1;
		for(int i=0; i<5; i++) {
			for(int z=0; z<5; z++) {
				arr[i][z] = num++;
			}
		}
		for(int i=0; i<5; i++) {
			for(int z=0; z<5; z++) {
				System.out.printf("%3d", arr[i][z]);
			}
			System.out.println();
		}
	}
}
		
	
		
		
		
		
//2차원 배열 5x5에 1부터 25까지의 숫자를 넣고 출력하기