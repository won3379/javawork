package overriding.shop;

public class Shop2 extends HeadShop {
	public Shop2() {
		System.out.println("대학가 매장입니다.");
	}

	@Override
	public void 된장찌개() {
		System.out.println("된장찌개:6500원");
		
	}

	@Override
	public void 김치찌개() {
		System.out.println("김치찌개:7000원");
	}

	@Override
	public void 비빔밥() {
		System.out.println("된장찌개7500원");
		
	}
}
