package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행 업무
		//1. 예금 2.출금 3. 잔액 조회 4. 종료
		//화면 출력 은행 메뉴 화면 만들기
		Scanner sc=new Scanner(System.in);
		int balance =0;//잔고 
		int money = 0;//입금 출금액
		boolean sw =true; //상태 변수             							  //상태 변수
		while(sw) {
			System.out.println("==========================");
			System.out.println("1.예금 |2.출금 |3.잔액 |4.종료");
			System.out.println("==========================");
			
			int selNum =sc.nextInt(); //메뉴 번호 입력

			switch(selNum) {
			case 1:
				System.out.println("예금액을 입력하세요");
				balance+= sc.nextInt();///입금
				break;
			case 2:
				System.out.println("출금액을 입력하세요");
				//balance-= sc.nextInt();//출금
				money =sc.nextInt();
				if(money >balance) {
					System.out.println("잔액이부족하다.");
				}else {
					balance -=money;
				}
				break;
			case 3:
				System.out.println("잔고:"+balance);
				break;
			case 4:
				sw = false;
				break;
				default: 
					System.out.println("지원되지않는기능입니다.");
					break;
			}
		
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
