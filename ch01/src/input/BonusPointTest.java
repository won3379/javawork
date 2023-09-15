package input;

import java.util.Scanner;

public class BonusPointTest {

	public static void main(String[] args) {
		// 고객의 이름, 구매 금액을 입력
		// 이름과 구매 포인트 출력 
		// 구매포인트(bonusPoint) =상품가격(price)*보너스적립율(bonusRatio)
		//입력 
		Scanner sc =new Scanner(System.in);

		System.out.print("고객의 이름을 입력하시오:");//고객입력
		String customer =sc.nextLine();
		System.out.print("구매 금액을 입력하시오:");//금액입력
		int price=sc.nextInt();
		double bonusRatio = 0.02;
		int bonusPoint = 0;
				
		//계산 처리
		bonusPoint =(int)(price * bonusRatio); //정수형으로 강제형변환 
		
		//출력
		System.out.println(customer+ "보너스포인트는"+bonusPoint+ "점 입니다.");
		sc.close();
		
	}

}
;