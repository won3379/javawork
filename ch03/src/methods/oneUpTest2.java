package methods;

public class oneUpTest2 {
	//정적 변수 - static 키워드를 붙인 변수
	//정적 변수는 생성된 후 프로그래밍이 종료될 때 소멸된다.
	//특징-값을 공유, 누적함 
	static int x=1; //전역 공간(위쪽)
			
	public static int oneup() {
	x+=1;	
	return x;
	}

	public static void main(String[] args) {
		System.out.println(oneup()); //2
		System.out.println(oneup()); //3
		System.out.println(oneup()); //4
		//변수 x값 출력
		System.out.println(x);
	}

}
