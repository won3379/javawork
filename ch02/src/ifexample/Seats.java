package ifexample;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석의 줄(행)수 계산,
		// 변수 - customer(고객 수), column(열 수), row(줄 수)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장객 수 입력 :" );
	    int customer =sc.nextInt();
	    System.out.print("좌석 열 수 입력 :" );
		int column=sc.nextInt();
		
		int row=0; //줄 수	
		
		
		//연산 처리(if~else문)
		if(customer% column ==0) {// 나누어 떨어지면
			row = customer / column ; //row =몫 
			
		}else {
			row = customer /column +1; //row = 몫+1
		}
		System.out.println(row + "줄이필요하다");
		sc.close();
		
	}

}
