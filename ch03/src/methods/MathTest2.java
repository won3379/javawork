package methods;

public class MathTest2 {

	public static void main(String[] args) {
		/*	for(int i=1; i<=10; i++) {
			int dice =(int)(Math.random()*6)+1;	
			System.out.println(dice);
		}*/
		//배열에서 문자열 랜덤 추출
		String[] word = {"나","너","우리","나라"};
		
		System.out.println(word[0]);
		//전체 출력
		for(int i=0; i<word.length; i++)
			System.out.println(word[i]);
		//랜덤 추출
		int idx=(int)(Math.random()*word.length); //0~4
		//System.out.println(idx);
		System.out.println(word[idx]);
				
		}
		

	}


