package arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 실수형 배열의 연산
		//크기가 5인 실수형 배열data 선언
		//총점
		double total = 0.0;
		double[] data =new double[5];
		double average;
		//저장
		data[0]=10.0;
		data[1]=20.0;
		data[2]=30.0;
		for(int i=0; i<data.length; i++) {
			total +=data[i];
			System.out.println(data[i]);	
	
		}
		average=total/data.length;
		System.out.println("합계:"+total);
		System.out.println("평균:"+average);
		}

	}


