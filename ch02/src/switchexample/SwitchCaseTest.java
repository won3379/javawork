package switchexample;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// 랭킹에 따른 메달 출력
		//1등 금메달 2등 은메달 3등 동메달
		//변수=rank
		Scanner sc = new Scanner(System.in);
		System.out.print("등수를 입력하세요:");
		int rank=sc.nextInt();
		
		switch(rank) { //switch 다음에 변수가 온다. switch(변수)
		case 1: //콜론으로 끝남:
			System.out.println("금메달!!!!");
			//break;
		case 2:
			System.err.println("은메달!!!!");
			break;
		case 3:
			System.out.println("동메달!!!");
			break;
			default: //case에 포함되지 않은 경우 처리
				System.out.println("메달이 없습니다.");
				break;
		}
	sc.close();
	}

}
