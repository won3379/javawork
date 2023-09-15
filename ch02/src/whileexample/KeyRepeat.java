package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		
		// 'y'키를 입력하면 -> "출력 반복합니다"
		// 'n'키 입력 -> " 반복을 중단합니다."
		// 그 이외의 ㅣ -> "키를 잘못 눌렀습니다."
		// 문자열 동등 비교함수는 equals()
		Scanner sc =new Scanner(System.in);
				
		
		while(true) {
			
			System.out.println("반복해용(y/n)?:");
			String key = sc.nextLine();
			//문자가 일치하는지 비교할 때 equals
			if(key.equals("y") ||key.equals("Y")) {
				System.out.println("계속 반복합니다.");
			}else if(key.equals("n")||key.equals("N")) {
				System.out.println("반복을 중단합니다.");
				break;
			}else {
				System.out.println("키를 잘못 눌렀습니다.");
			}
				
			}
			sc.close(); //입력하는 부분 종료해도 되는 곳에다가 ~ 종료 
			
		}// main() 함수 끝 
		
	}//클래스 끝 

