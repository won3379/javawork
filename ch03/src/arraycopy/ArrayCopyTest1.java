package arraycopy;

public class ArrayCopyTest1 {

	public static void main(String[] args) {
		//배열의 복사
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = new int[4];

		//arr2[0] = arr1[0];
		//System.out.println(arr2[0]);
		//1.복사
		for(int i = 0; i< arr1.length; i++) {
			arr2[i]= arr1[i];
		}
		//출력
		for(int i = 0; i< arr1.length; i++) {
			System.out.println(arr2[i]+" ");
		}
		System.out.println();
	//2.clone()사용
		int[] arr3=arr2.clone();
		for(int i = 0; i< arr3.length; i++) {
			System.out.println(arr3[i]+" ");
		}
		
	}
	
	}
