package forexample;

public class GugudanFull {

	public static void main(String[] args) {
		// 구구단전체출력.
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
				/*단보다 곱하는 수가 작거나 같은 경우까지만 출력
				 * 2x1 2
				 * 22 4
				 * 313
				 * 326
				 * 339
				 * 414
				 * 428
				 * 4312
				 * 4416
				 * 99
				 */
			}
		}

	}

}
