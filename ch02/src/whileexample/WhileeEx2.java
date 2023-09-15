package whileexample;

public class WhileeEx2 {

	public static void main(String[] args) {
		// 1부터 10까지의합계
		// 변수- n,sum
		int n=0;
		int sum=0;
		
/*		n+=1;//1
		n+=2;//3
		n+=3;//6
*/
		
		while(n<10) {
			n++;
			sum+=n;//sum=sum+n
			System.out.println("n="+n+", sum="+sum);
		
			
		}
		System.out.println("합계" +sum);
	}

}
