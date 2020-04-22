package kr.kws.charle;

public class Test3 {
	public static void main(String [] args) {
		int arr[][] = new int[5][5];
		int num = 1;
		
		for(int i=0; i<5; i++) {
			if (i%2==0) {
			for(int z=0; z<5; z++) {
				arr[i][z] = num++;
			}
			} else {				
				for(int z=4; z>=0; z--) {
				arr[i][z] = num++;						
					}
			}
			/* 대신 if 부분을 첫번째 for문 뒤에 두고 이렇게 변형 가능
			 * if(i%2==0) 
			 * arr[i][j] = num++;
			 * else
			 * arr[i][4-j] = num++;
			 */
		}
		for(int i=0; i<5; i++) {
			for(int z=0; z<5; z++) {
				System.out.printf("%3d", arr[i][z]);
			}
			System.out.println();
		}
	}
}

// 1.만드는데서 다 만들어놓고 출력은 출력만되게
// 2.숫자생성부분에서 고쳐야함

