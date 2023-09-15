package overriding.shop;

public class Shop1 extends HeadShop {
	
	public Shop1(){
		System.out.println("***역세권 매장입니다.***");	
	}

	
	public void 된장찌개() {
		System.out.println("된장찌개:7500원");
		
	}

	
	public void 김치찌개() {
		System.out.println("김치찌개:8000원");
		
		
	}

	
	public void 비빔밥() {
		System.out.println("된장찌개:8500원");
		
	}
	
}
