package kr.kws.charle;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anum, money, i;


		int[][] bank = new int[10][2];
		
		while(true) {
		System.out.println("==================================");
		System.out.println("1.예금  | 2.출금  | 3.잔액조회  | 4.원장출력");
		System.out.println("==================================");
		System.out.print("선택 <종료:0> >> ");
		int num = scan.nextInt();
		switch(num) {		
		case 1:
			System.out.print("계좌번호, 금액>> ");
			anum = scan.nextInt();
			money = scan.nextInt();
			i = 0;
			while (bank[i][0] != 0 && bank[i][0] != anum) {
				i++;
			}
			if(bank[i][0] == anum) {
				bank[i][1] += money;
				break;
			} else {
			System.out.print("신규 입니까?<Y/N> >> ");
			char select = scan.next().charAt(0);
			if(select == 'y' || select == 'Y') {
				System.out.println("첫거래 감사합니다!");
				bank[i][0] += anum;
				bank[i][1] += money;
				break;
			} else {
				System.out.println("계좌번호 오류입니다.");
				break;
			}
			}			
		case 2:
			System.out.print("계좌번호, 금액>> ");
			anum = scan.nextInt();
			money = scan.nextInt();
			i = 0;
			while (bank[i][0] !=0 && bank[i][0] != anum) {
				i++;
			}
			if(bank[i][0] == anum) {
				bank[i][1] -= money;
				break;
			} else {
			System.out.println("계좌번호 오류입니다.");
			break;
			}
		case 3:
			System.out.print("계좌번호 >> ");
			anum = scan.nextInt();
			i = 0;
			while (bank[i][0] !=0 && bank[i][0] != anum) {
				i++;
			}
			if(bank[i][0] == anum) {
				System.out.printf("계좌번호 : %3d\t 잔액 : %5d원\t\n", anum, bank[i][1]);
				break;
			} else {
				System.out.println("계좌번호 오류입니다.");
				break;
			}
		case 4:
			for(int j=0; j<bank.length; j++) {
				if(bank[j][0] != 0) {
				for(int k=0; k<bank[j].length; k++) {
					}
				System.out.printf("%d. 계좌번호 :%5d \t 잔액 : %8d원"
						, j+1, bank[j][0], bank[j][1]);
				System.out.println();
				}
			}
		}
		if(num == 0) {
			break;
		}
		}
	}
}

/// 메뉴는 예금 출금 잔액조회 원장출력 4가지
/// 메뉴를 선택하면 계좌번호와 입력할 금액을 적는 선택지가 등장
/// 만약 배열 안에 입력된 계좌번호가 없을 경우 신규 입니까?<Y/N> >> 를 묻도록 함.
/// 신규면 계좌번호가 행에 등록되고 열에 입력한 금액이 들어감
/// 아니면 계좌번호 오류입니다. 라고 뜨면서 첫 선택지로 되돌아감. 이는 다른 선택지도 동일.
/// 0번을 누르면 종료
