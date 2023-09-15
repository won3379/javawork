package overriding.shop;

public class HeadShop {
	public HeadShop() {} //생성자 써도되고 안써도되고 내포되어있기 때문 다른 생성자를 쓸 때 같이 써줘야함 

	
	public void 된장찌개() {
		System.out.println("된장찌개: 7,000원");
	}
	public void 김치찌개() {
		System.out.println("김치찌개: 7,500원");
	}
	public void 비빔밥() {
		System.out.println("비빔밥: 8,000원");
	}
}
