package forexample;

public class forEx1 {

	public static void main(String[] args) {
		/*
		 for(초기값;종료값;증감값){
		 실행문
		 }
		 
		 */
		
		//1~10출력
		for(int i=1; i<=10; i++) {
			System.out.print(i+"\t");
		}
		
	
	//ASCII 코드값 알파벳 출력
	// 'A'65 'a'97 0-48
	char alpha = 'A';
	System.out.println(alpha);
	
	int val =66;
	System.out.println((char)val);
			
	/*for(int num=65; num<=91; num++) {
		System.out.println((char)num);
	}*/
		for(char ch=65; ch<123; ch++) {
			System.out.println(ch +" ");
		}
			//한글 유니코드 값(12593 ~12686)
		for(char ch=12593; ch<12686;ch ++) {
			System.out.println(ch + " ");
		}
	}
		
	}
