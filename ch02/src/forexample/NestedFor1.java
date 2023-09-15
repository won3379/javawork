package forexample;

public class NestedFor1 {

	public static void main(String[] args) {
		// 중첩 for 문 
		//5행 5열의 star 바깥의 for가 행 , 안쪽이 열.
		/*for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
			*/
	
		

		/* 
		 * i=1 j=1 *
		 *    j=2 		      
		      j=3
                4		
		*       5
		*  2    1 
		*       2
		*       ~
		*       ~..... 
		
		//삼각형 모양1-행의 변화는 없고 열은 행이 증가할때마다 1씩 증가
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			*/ 
		
			//삼각형 모양2-열의 변화는 없고 행은 열이 증가할때마다 1씩 증가
			/*for(int i=1; i<=5; i++) {
				for(int j=1; j<=6-i; j++) {
					System.out.print("*");
				}
				System.out.println();
		}*/
			for(int i=1; i<=5; i++) {
				for(int j=5; j>=i; j--) {//j가1234 순서로 줄어든다.)
					System.out.print("*");
					System.out.print("i="+i+",+j="+j);
				}
				System.out.println();
			}
		

	}
	
}
