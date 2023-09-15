package arrays;

public class FindMaxidx {

	public static void main(String[] args) {
		// 최대값의 위치 찾기
		//최대값의 위치를 0번 인덱스로 설정
		
		int[] arr =new int[] {10, 50, 80, 30, 100};
		int maxIdx =0; //최대값일땐 arr[0]으로세팅
		for(int i =1; i<arr.length; i++) {
			if(arr[i] > arr[maxIdx]) //값의 대소 비교 
				maxIdx =i; //최대 위치에 i를 저장
			System.out.println("최대값의 위치:"+maxIdx);
		}
	}

}
