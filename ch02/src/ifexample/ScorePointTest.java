package ifexample;

import java.util.Scanner;

public class ScorePointTest {

	public static void main(String[] args) {
		// 점수에 따른 학점 출력 프로그램
//변수 -score(정수형)인티져,grade(문자형)스트링
//		데이터타입 자료형
      	//A학점 -90~100	
		//B학점 -80~90	
		//C학점 -70~80	
		//D학점 -60~70	
		//F학점 -0~60
		//객체(변수) scan 생성
		Scanner sc=new Scanner(System.in);
		//입력
		System.out.print("점수를 입력하세요:");
		int score = sc.nextInt();
		char grade = 'A';//char한 문자(홀따옴표)
		//String grade = "A"; 와 같다. 
		//연산
		if(score>=90 && score<=100) { //true&&true
			grade = 'A';
		}else if(score>=80 && score<90) {
			grade = 'B';
		}else if(score>=70 && score<80) {
			grade = 'C';
		}else if(score>=60 && score<70) {
			grade = 'D';
		}else {  //else if(score >=0&&score <60)
			grade = 'F';
		}
		//출력
		System.out.println(grade+ "학점입니다.");
		
		sc.close();
	}

}
